package com.dao;

import java.util.List;

public class BasePagingDao<T> extends BaseDao<T> implements IPagingDao<T> {

	
	@SuppressWarnings("unchecked")
	@Override
	public List<T> getByPaging(int nowPage, int pageSize,String hql) throws Exception {
		// TODO Auto-generated method stub
		int start = nowPage*pageSize;
		int end = start+pageSize;
		return session.createQuery(hql).setFirstResult(start).setMaxResults(end).list();
	}

}
