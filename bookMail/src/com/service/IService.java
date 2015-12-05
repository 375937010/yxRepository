package com.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface IService<T> {
	public boolean add(T vo);
	public boolean delete(T vo);
	public boolean update(T vo);
	public List<T> get(String hql);
	public T get(Serializable id);
	public Map<String,Object> getByPaging(int nowPage,int pageSize,String hql);
}
