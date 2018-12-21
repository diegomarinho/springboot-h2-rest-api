package com.springboot.h2.restapi.service;

import java.util.List;

/**
 * 
 * @author Diego Marinho
 *
 */
public interface GenericService<T> {

	T save(T product);

	void delete(long idProduct);

	List<T> findAll();

}
