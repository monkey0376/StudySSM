package com.zz.service;

import java.util.List;

import com.zz.domain.Book;

/**
 * Book服务层接口
 * */
public interface BookService {
	
	/**
	 * 查找所有图书
	 * @return Book对象集合
	 * */
	List<Book> getAll();

}
