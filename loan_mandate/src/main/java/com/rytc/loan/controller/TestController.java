package com.rytc.loan.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rytc.loan.model.User;
import com.rytc.loan.service.UserService;

/**
 * 测试类
 *@author lzp
 * 2018年5月25日
 */
@Controller
public class TestController {
	private static final Logger log = Logger.getLogger(TestController.class);

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/insert")
	public String insert(Model model) {
		try {
			User u = new User();
			u.setName("张三");
			Integer insert = userService.insert(u);
			System.out.println(insert);
			model.addAttribute("name", u.getName());
		} catch (Exception e) {
			log.error("插入报错");
		}
		return "test";
	}
}
