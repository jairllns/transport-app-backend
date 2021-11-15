package com.transportapp.transportapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.transportapp.transportapp.model.RepresentanteLegal;

@Service
public interface RepresentanteLegalService {
	
	List < RepresentanteLegal > findAll();
	
	Optional<RepresentanteLegal> findById(Long id);
}
