package com.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Session;

public  class BaseDao<T> implements IDao<T> {

	protected Session session;
	protected Class<?> cls;
	
	public BaseDao() {
		super();
		// TODO Auto-generated constructor stub
		//获取T的Class类型,
		ParameterizedType pType= (ParameterizedType) this.getClass().getGenericSuperclass();
		//Type type=(Type)this.getClass().getSuperclass();
		//ParameterizedType pType=(ParameterizedType) type;
		cls=(Class<T>)pType.getActualTypeArguments()[0];
		System.out.println("cls======================="+cls);
	}	
	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	@Override
	public void insert(T vo) throws Exception {
		// TODO Auto-generated method stub
		session.save(vo);
	}
	public void delete(Serializable id) throws Exception{
		delete(get(id));
	}

	@Override
	public void update(T vo) throws Exception {
		// TODO Auto-generated method stub
		session.update(vo);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> get(String hql) throws Exception {
		// TODO Auto-generated method stub
		return session.createQuery(hql).list();
	}

	@Override
	public void delete(T vo) throws Exception {
		// TODO Auto-generated method stub
		session.delete(vo);
	}

	@SuppressWarnings("unchecked")
	@Override
	public T get(Serializable id) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(cls);
		return (T) session.get(cls, id);
	}
	
	public int count(String hql) throws Exception{
		return ((Long)(session.createQuery("count(*)"+hql).uniqueResult())).intValue();
	}
}
