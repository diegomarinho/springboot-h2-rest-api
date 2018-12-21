package com.springboot.h2.restapi.service;

import java.util.List;

import com.springboot.h2.restapi.model.Image;

/**
 * 
 * @author Diego Marinho
 *
 */
public interface ImageService extends GenericService<Image> {

	List<Image> findByProduct(Long idProduct);

	Image findById(Long id);

}
