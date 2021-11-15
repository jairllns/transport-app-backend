package com.transportapp.transportapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.transportapp.transportapp.model.Empresa;

@Repository
	public interface EmpresaRepository extends JpaRepository<Empresa, Long>{

	}

