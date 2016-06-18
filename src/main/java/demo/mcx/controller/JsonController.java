package demo.mcx.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import demo.mcx.entity.User;


@Controller
@RequestMapping("/json")
public class JsonController {
	
	@RequestMapping("/list")
	@ResponseBody
	public List<User> sendListUser(){
		List<User> users=new ArrayList<User>();
		for(int i=0;i<6;i++){
			User user=new User("用户"+i,"123456","18","女性");
			users.add(user);
		}
		return users;
	}
	
	@RequestMapping("/object")
	@ResponseBody
	public Object sendObject(){
		int[] intArray=new int[6];
		Map<String, int[]> map=new HashMap<String, int[]>();
		for(int i=0;i<intArray.length;i++){
			intArray[i]=i;
			map.put("数组"+i, intArray);
		}
		return map;
	}
	
	@RequestMapping(value="/senddata")
	@ResponseBody
	public String sendData(HttpServletRequest request){
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String sex=request.getParameter("sex");
		String result="id:"+id+",name:"+name+",sex"+sex;
		System.out.println(result);
		return result;
	}
	
}
