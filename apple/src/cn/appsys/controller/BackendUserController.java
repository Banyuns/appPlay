package cn.appsys.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.appsys.pojo.BackendUser;
import cn.appsys.service.BackendUserService;

@Controller
@RequestMapping("/backendUser")
public class BackendUserController {

	@Resource
	public BackendUserService backendUserService;
	@RequestMapping("/login")
	public String logins(BackendUser backendUser ,HttpSession session){
		System.out.println(backendUser.getUserCode()+"\t"+backendUser.getUserPassword());
		BackendUser backeanUsers=backendUserService.login(backendUser);
		if(backeanUsers!=null){
		session.setAttribute("user", backeanUsers);
			return "user";
		}else{
			return "login";
		}
	}
	
}
