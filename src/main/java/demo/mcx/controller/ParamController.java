package demo.mcx.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import demo.mcx.entity.User;


@Controller
@RequestMapping("/param")
public class ParamController {
	/*
	 * springmvc中有4中方式获取参数
	 * 1.HttpServletRequest request。getParam
	 * 2.@RequestParam 将参数绑定到控制器方法参数上
	 * 3.@PathVariable 获（url）取路径参数
	 * 4.@ModelAttribute获取POST请求的FORM表单数据
	 *  
	 * */
	
	/*
	 * 1.HttpServletRequest request。getParameter
	 */
	@RequestMapping("/get")
	public String getParamByRequest(HttpServletRequest request,Model model){
		String name=request.getParameter("name");
		model.addAttribute("param_var", "get接收值为："+name);
		return "param/result";
	}
	
	@RequestMapping(value="/post",method=RequestMethod.POST)
	public String postParamByRequest(HttpServletRequest request,Model model){
		String name=request.getParameter("name");
		model.addAttribute("param_var", "post接收值为："+name);
		return "param/result";
	}
	
	/*
	 * 2.@RequestParam 将参数绑定到控制器方法参数上
	 * @RequestParam(value="value", required=[true|false],defaultValue="deflaut")   required是否必填选项
	 */
	@RequestMapping("/getparam")
	public String getParamByRequestParam(@RequestParam(value="name",defaultValue="null") String username,Model model){
		model.addAttribute("param_var", "get获取的 username："+username);
		return "param/result";
	}
	
	@RequestMapping(value="/postparam",method=RequestMethod.POST)
	public String postParamByRequestParam(@RequestParam(value="name",defaultValue="null") String username,Model model){
		model.addAttribute("param_var", "post获取的 username："+username);
		return "param/result";
	}
	
	/*
	 * 3.@PathVariable 获（url）取路径参数
	 */
	@RequestMapping("/getpath/{name}/{id}")
	public String getPathVar(@PathVariable(value="name")String username,@PathVariable(value="id")String userid,Model model){
		String value="name:"+username+",id:"+userid;
		model.addAttribute("param_var",value);
		return "param/result";
	}
	
	/*
	 * 4.@ModelAttribute获取POST请求的FORM表单数据
	 * 这个User类一定要有没有参数的构造函数。
	 */
	@RequestMapping("/postattribute")
	public String postModelAttribute(@ModelAttribute User user,Model model){
		String value="name:"+user.getUserName()+",password:"+user.getPassword()+",age:"+user.getAge()+",sex:"+user.getSex();
		model.addAttribute("param_var",value);
		return "param/result";
	}
	
}
