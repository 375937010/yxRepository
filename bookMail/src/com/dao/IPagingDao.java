package com.dao;

import java.util.List;

public interface IPagingDao<T> extends IDao<T> {
	public List<T> getByPaging(int nowPage,int pageSize,String hql) throws Exception;
}
