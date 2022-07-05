package com.wineseller.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wineseller.web.dao.SearchDao;
import com.wineseller.web.entity.Wine;

@Service
public class WineServiceImp implements WineService{

	@Autowired
	private SearchDao  searchdao;
	
	public List<Wine> getList() {
		
		List<Wine> list = searchdao.getList();
		
		return list;
	}
	
}
