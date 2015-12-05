package com.factory;

import com.dao.IDao;
import com.daoimpl.BookDaoImpl;
import com.daoimpl.CategoryDaoImpl;
import com.entity.Category;

public class DaoFactory {
	public static BookDaoImpl getBookDaoInstance(){
		return new BookDaoImpl();
	}
	
	public static IDao<Category> getCategoryInstance(){
		return new CategoryDaoImpl();
	}
}
