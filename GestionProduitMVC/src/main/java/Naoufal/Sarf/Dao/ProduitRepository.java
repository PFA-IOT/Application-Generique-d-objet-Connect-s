package Naoufal.Sarf.Dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import Naoufal.Sarf.Models.Produit;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
	
	public Page<Produit> findByDesignationContains(String motcle,Pageable pageable);

}
