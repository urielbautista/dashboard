package com.ks3.dashboard.dao.api;


import java.util.List;


public interface GenericDAO<T, ID> {
	T load(ID id);
	void save(T t);
	void saveOrUpdate(T t);
	void saveOrUpdateAll(List<T> t);
	void delete(T t);
	void deleteById(ID id);
	List<T> getList();
	List<T> findByExample(T t,  String[] excludeProperty);
}