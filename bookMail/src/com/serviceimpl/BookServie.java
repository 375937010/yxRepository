package com.serviceimpl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;

import com.daoimpl.BookDaoImpl;
import com.entity.Book;
import com.factory.DaoFactory;
import com.service.IService;
import com.util.HibernateSessionFactory;

public class BookServie implements IService<Book> {
	
	private BookDaoImpl dao = DaoFactory.getBookDaoInstance();
	public BookServie() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean add(Book vo) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		dao.setSession(session);
		try {
			dao.insert(vo);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}finally{
			session.getTransaction().commit();
			session.close();
		}
		
	}

	@Override
	public boolean delete(Book vo) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		dao.setSession(session);
		try {
			dao.delete(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}finally{
			session.getTransaction().commit();
			session.close();
		}
		return true;
	}

	@Override
	public boolean update(Book vo) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		dao.setSession(session);
		try {
			dao.update(vo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}finally{
			session.getTransaction().commit();
			session.close();
		}
		return true;
	}

	@Override
	public List<Book> get(String hql) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		dao.setSession(session);
		try {
			return dao.get(hql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally{
			session.getTransaction().commit();
			session.close();
		}
	}

	@Override
	public Map<String, Object> getByPaging(int nowPage, int pageSize, String hql) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		dao.setSession(session);
		
		Map<String,Object> map = new HashMap<String,Object>();
		try {
			map.put("list", dao.getByPaging(nowPage, pageSize, hql));
			map.put("count", dao.count(hql));
			return map;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally{
			session.getTransaction().commit();
			session.close();
		}
	}
	@Override
	public Book get(Serializable id) {
		// TODO Auto-generated method stub
		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		dao.setSession(session);
		try {
			return dao.get(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally{
			session.getTransaction().commit();
			session.close();
		}
	}

}
