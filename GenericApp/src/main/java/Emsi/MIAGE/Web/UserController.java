package Emsi.MIAGE.Web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping("/")
	public String Home()
	{ 
		return "index";
	}
	@RequestMapping("/signIn")
	public String Login()
	{ 
		return "signIn";
	}
	@RequestMapping("/404")
	public String Error()
	{ 
		return "404";
	}
	@RequestMapping("/500")
	public String ErrorController()
	{ 
		return "500";
	}
	@RequestMapping("/blank")
	public String blank()
	{ 
		return "blank";
	}
	@RequestMapping("/buttons")
	public String buttons()
	{ 
		return "buttons";
	}
	@RequestMapping("/calendar")
	public String calendar()
	{ 
		return "calendar";
	}
	@RequestMapping("/chart")
	public String chart()
	{ 
		return "chart";
	}
	@RequestMapping("/compose")
	public String compose()
	{ 
		return "compose";
	}
	@RequestMapping("/editor")
	public String editor()
	{ 
		return "editor";
	}
	@RequestMapping("/forms")
	public String forms()
	{ 
		return "forms";
	}
	@RequestMapping("/graph")
	public String graph()
	{ 
		return "graph";
	}
	@RequestMapping("/grids")
	public String grids()
	{ 
		return "grids";
	}
	@RequestMapping("/inbox")
	public String inbox()
	{ 
		return "inbox";
	}
	@RequestMapping("/index")
	public String index()
	{ 
		return "index";
	}
	@RequestMapping("/map")
	public String map()
	{ 
		return "map";
	}
	@RequestMapping("/media")
	public String media()
	{ 
		return "media";
	}
	@RequestMapping("/profile")
	public String profile()
	{ 
		return "profile";
	}
	@RequestMapping("/project")
	public String project()
	{ 
		return "project";
	}
	@RequestMapping("/register")
	public String register()
	{ 
		return "register";
	}
	@RequestMapping("/ribbon")
	public String ribbon()
	{ 
		return "ribbon";
	}
	@RequestMapping("/sign")
	public String sign()
	{ 
		return "sign";
	}
	@RequestMapping("/table")
	public String table()
	{ 
		return "table";
	}
	@RequestMapping("/tabs")
	public String tabs()
	{ 
		return "tabs";
	}
	@RequestMapping("/typography")
	public String typography()
	{ 
		return "typography";
	}
	@RequestMapping("/validation")
	public String validation()
	{ 
		return "validation";
	}
}
