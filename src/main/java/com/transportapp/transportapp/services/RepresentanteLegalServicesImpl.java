package com.transportapp.transportapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transportapp.transportapp.model.RepresentanteLegal;
import com.transportapp.transportapp.repository.RepresentanteLegalRepository;

@Service
public class RepresentanteLegalServicesImpl implements RepresentanteLegalService  {

	
	@Autowired
    private RepresentanteLegalRepository representanteLegal;
	@Override
	public List<RepresentanteLegal> findAll() {
		return representanteLegal.findAll();
	}
	
	
	@Override
	public Optional<RepresentanteLegal> findById(Long id) {
		return representanteLegal.findById(id);
	}

}
