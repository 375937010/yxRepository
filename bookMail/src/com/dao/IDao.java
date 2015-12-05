package com.dao;

import java.io.Serializable;
import java.util.List;

public interface IDao<T> {
	
	public void insert(T vo) throws Exception;
	
	public void delete(T vo) throws Exception;
	
	public void delete(Serializable id) throws Exception;
	
	public void update(T vo) throws Exception;
	
	public List<T> get(String hql) throws Exception;
	
	public T get(Serializable id) throws Exception;
	
	public int count(String hql) throws Exception;
}
