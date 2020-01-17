package Naoufal.Sarf.Web;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import Naoufal.Sarf.Dao.ProduitRepository;
import Naoufal.Sarf.Models.Produit;

@Controller
public class ProduitController {
	
	@Autowired
	private ProduitRepository produitRepository;
	
	@RequestMapping(value="/")
	public String Welcome()
	{ 
		return "home";
	}
	
	@RequestMapping(value="/user/index",method=RequestMethod.GET) // on peut utiliser l annotation GetMapping("/index") c est la meme chose et le meme cas si on veut changer de methode 
	public String Search(Model model, @RequestParam(name="page",defaultValue="0") int page,@RequestParam(name="size",defaultValue="5") int size,
										@RequestParam(name="motcle",defaultValue="") String motcle)
	{ 
		Page<Produit> Pagesproduit=produitRepository.findByDesignationContains(motcle,PageRequest.of(page,size));
		model.addAttribute("listProduits",Pagesproduit.getContent());
		model.addAttribute("pages",new int [Pagesproduit.getTotalPages()] );
		model.addAttribute("CurentPage",page);
		model.addAttribute("motcle",motcle);
		return "produits";
	}
	
	@RequestMapping(value="/admin/Delete",method=RequestMethod.GET)
	public String Delete(Long id,int page,String motcle)
	{ 
		produitRepository.deleteById(id);
		return "redirect:/user/index?page="+page+"&motcle="+motcle;
	}
	
	@RequestMapping(value="/admin/formProduit",method=RequestMethod.GET)
	public String form(Model model)
	{ 
		model.addAttribute("produit",new Produit());
		return "FormProduit";
	}
	
	@RequestMapping( value="/admin/save",method=RequestMethod.POST)
	public String save(Model model,@Valid Produit produit,BindingResult b) // bindingResult il cherche si la methode retourne une erreur il l'a stock dans model 
	{ 
		if(b.hasErrors())return "FormProduit";
		produitRepository.save(produit);
		return "redirect:/user/index";
	}
	
	
	@GetMapping(value = "/admin/update")
	public String update(Model model,Long id)
	{ 
		Produit produit=produitRepository.findById(id).get();
		model.addAttribute("produit",produit);
		return "EditProduit";
	}
	
	@GetMapping(value="/403")
	public String notAuthorized() { 
		return"403";
	}
	
	@GetMapping(value="/login")
	public String login() { 
		return"login";
	}
	
	/*
	 * @GetMapping(value="/home") public String home() { return"home"; }
	 */


}
