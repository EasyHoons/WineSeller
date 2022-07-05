package com.wineseller.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.wineseller.web.entity.Wine;

@Mapper
public interface SearchDao {
	
	@Select("select * from winetable")
	List<Wine> getList();
}
