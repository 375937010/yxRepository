package com.test;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;

import com.entity.Book;
import com.entity.Category;
import com.serviceimpl.BookServie;
import com.util.HibernateSessionFactory;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			BookServie service = new BookServie();
			
			Book book = new Book();
			book.setName("C++");
			book.setDescription("12wdsacfsdfs");
			book.setCover("nnnnnnnnnnnnnnn");
			
			Category category = new Category();
			category.setName("jisuanji");
			category.setDescription("sjsjsjsjjsjsjsjsjjsjsjsjsj");
			
			book.setCategory(category);
			service.add(book);
//			
//			List<Book> books = service.get("from Book where id>4 order by id desc");
//			for (Book book2 : books) {
//				System.out.println(book2);
//			}
			
//			Map<String,Object> map = service.getByPaging(1, 3, "from Book");
//			System.out.println(map.get("count"));
//			Book book = service.get(1);
//			System.out.println(book);
			
//			Session session = HibernateSessionFactory.getSession();
//			session.beginTransaction();
//			session.save(category);
//			session.save(book);
//			session.getTransaction().commit();
//			session.close();
	}

}
