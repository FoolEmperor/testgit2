package demo.mcx.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.mcx.entity.Client;


@Controller
@RequestMapping("/form")
public class FormCheckController {
	/**
	 * 
	 */
	@RequestMapping("/check")
	public String validate(@Valid Client client,BindingResult result,Model model){
		if(result.hasErrors()){
			model.addAttribute("result",result.getAllErrors());
			return "form/error";
		}
		model.addAttribute("result","success:"+client.getName()+"你的申请通过了。将在"+client.getBirthday()+"生效。");
		return "form/result";
		
	}
}
