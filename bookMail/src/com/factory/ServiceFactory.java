package com.factory;

import com.serviceimpl.BookServie;

public class ServiceFactory {
	public static BookServie getBookService(){
		return new BookServie();
	}
}
