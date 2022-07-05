package com.wineseller.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wineseller.web.entity.Wine;
import com.wineseller.web.service.WineService;

@Controller
public class HomeController {
	
	@Autowired
	private WineService wineservice;
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	@RequestMapping("/search")
	public List<Wine> Search(Model model) {
		
		List<Wine> list = wineservice.getList();
		
		model.addAttribute("list", list);
		
		return list;
	}
	
	@RequestMapping("/testlist")
	@ResponseBody
	public List<Wine> list(Model model){
		
		List<Wine> list = wineservice.getList();
		
		model.addAttribute("list", list);
		
		return list;
	}
}
