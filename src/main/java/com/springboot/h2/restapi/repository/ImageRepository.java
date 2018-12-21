package com.springboot.h2.restapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.h2.restapi.model.Image;

/**
 * 
 * @author Diego Marinho
 *
 */
public interface ImageRepository extends JpaRepository<Image, Long> {

	List<Image> findByProduct_Id(Long idProduct);

}
