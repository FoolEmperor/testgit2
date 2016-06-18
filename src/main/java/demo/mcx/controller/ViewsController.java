package demo.mcx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class ViewsController {	
	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/param")
	public String param(){
		return "param/param";
	}
	
	@RequestMapping("/json")
	public String json(){
		return "json/json";
	}
	
	@RequestMapping("/modelattr")
	public String modelattr(){
		return "modelattr/modelattr";
	}
	
	@RequestMapping("/form")
	public String form(){
		return "form/form";
	}
}
