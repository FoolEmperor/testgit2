package demo.mcx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import demo.mcx.entity.User;


@Controller
@RequestMapping("/modelattr")
public class ModelMappingController {

	/**
	 * @ModelAttribute使用实例
	 * _________________注释方法
	 * 1.@ModelAttribute注释void返回值的方法 
	 * 2.@ModelAttribute注释返回具体类的方法
	 * 3.@ModelAttribute(value="")注释返回具体类的方法
	 * 4.@ModelAttribute和@RequestMapping同时注释一个方法 
	 * _________________注释方法参数
	 * 5.从model中获取 
	 * 6.从Form表单或URL参数中获取（实际上，不做此注释也能拿到user对象） ——参数学习是已经实践
	 */
	
	/**
	 * @SessionAttributes和@ModelAttribute
	 *
	 * 默认情况，ModelMap 中的属性作用域是 request 级别，即当本次请求结束后，
	 * ModelMap 中的属性将销毁。如果希望在多个请求中共享 ModelMap 中的属性，
	 * 必须将其属性转存到 session 中，这样 ModelMap 的属性才可以被跨请求访问。
	 * Spring 允许有选择地指定 ModelMap 中的哪些属性需要转存到 session 中，
	 * 以便下一个请求属对应的 ModelMap 的属性列表中还能访问到这些属性。
	 * 这一功能是通过类定义处标注 @SessionAttributes 注解来实现的。
	 * 
	 * 综上所述：这两个注解只是作用域不同，一个request级别的，一个是session级别的
	 * 
	 * 注：调用session中的user
	 * @SessionAttributes("user")
	 * public ... xxxName(@ModelAttribute("user")User user){}
	 */
	
	
	/*
	 * 1.@ModelAttribute注释void返回值的方法 
	 * 被@ModelAttribute注释的方法会在此controller每个方法执行前被执行
	 * 因此当URL或者post中不包含次参数时，会报错，
	 */
	
	@ModelAttribute
	public void modelAttrReturnVoid(@RequestParam String param,Model model){
		model.addAttribute("param_var",param);
	}
	
	
	
	/*
	 * 2.@ModelAttribute注释返回具体类的方法
	 * 此时等于在model.addAttribute("User",new User(param,null,null,null));
	 * model.addAttribute("ClassName",Object);
	 */
	@ModelAttribute
	public User modelAttrReturnUser(){
		User user=new User();
		user.setUserName("little ming");
		return user;
	}
	
	/*
	 * 3.@ModelAttribute(value="")注释返回具体类的方法
	 */
	@ModelAttribute("user2")
	public User modelAttrReturnName(){
		User user=new User();
		user.setPassword("little ming");
		return user;
	}
	

	@RequestMapping("/result2")
	public String result(){
		return "modelattr/result";
	} 
	
	/*
	 *4.@ModelAttribute和@RequestMapping同时注释一个方法 
	 *方法的返回值并不是表示一个视图名称，而是model属性的值，
	 *视图名称由RequestToViewNameTranslator根据请求"/result"转换为逻辑视图modelattr/result.jsp。
	 *即url映射的地址
	 *Model属性名称有@ModelAttribute(value=””)指定
	 */
	@RequestMapping("/result")
	@ModelAttribute("param_var2")
	public String result2(){
		return "modelattr/result";
	} 
	
	/*
	 * 5.从model中获取 
	 * 方法体没有标注@SessionAttributes("user")，那么scope为request，
	 * 如果标注了，那么scope为session
	 */
	@RequestMapping("/anno")
	public String anno(@ModelAttribute("user2")User user){
		user.setSex("男");
		return "modelattr/result";
	}
}
