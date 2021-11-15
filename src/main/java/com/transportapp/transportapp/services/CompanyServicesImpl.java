package com.transportapp.transportapp.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.stereotype.Service;

import com.transportapp.transportapp.model.Empresa;
import com.transportapp.transportapp.repository.EmpresaRepository;
import com.transportapp.transportapp.util.Utilities;

@Service
public class CompanyServicesImpl implements CompanyService {

	@Autowired
	private EmpresaRepository empresaRepository;
	
	@Autowired
	private RepresentanteLegalService representanteLegalService;

	@Override
	public List<Empresa> findAll() {
		return empresaRepository.findAll();
	}

	@Override
	public void save(Empresa empresa) {
		empresaRepository.save(empresa);
	}

	@Override
	public HashMap<String, String> getTipoDocumentoList() {

		return Utilities.getTipoDocumentoList();
	}

	@Override
	public Optional<Empresa> findById(Long id) {
		return empresaRepository.findById(id);
	}

	@Override
	public void saveCompany(Map<String, Object> obj) {
		
		if( obj.containsKey("id")  && obj.get("id") != null) {
			Optional<Empresa> empresaOpt = findById(new Long((long) obj.get("id")));
			Empresa empresa = empresaOpt.get();
			empresa.setNombre( obj.get("nombre").toString());
			empresa.setTipoDocumento(obj.get("tipoDocumento").toString());
			empresa.setNumDocumento((Integer) obj.get("numeroDocumento"));
			empresa.setDireccion(obj.get("direccion").toString());
			empresa.setCiudad(obj.get("ciudad").toString());
			empresa.setDepartamento(obj.get("departamento").toString());
			empresa.setPais(obj.get("pais").toString());
			empresa.setTelefono((Integer) obj.get("telefono"));
			empresa.setRepresentanteLegal(representanteLegalService.findById((Long) obj.get("representanteLegalId")).get() );
			save(empresa);
		}else {
			Empresa empresa = new Empresa();
			empresa.setNombre( obj.get("nombre").toString());
			empresa.setTipoDocumento(obj.get("tipoDocumento").toString());
			empresa.setNumDocumento((Integer) obj.get("numeroDocumento"));
			empresa.setDireccion(obj.get("direccion").toString());
			empresa.setCiudad(obj.get("ciudad").toString());
			empresa.setDepartamento(obj.get("departamento").toString());
			empresa.setPais(obj.get("pais").toString());
			empresa.setTelefono((Integer) obj.get("telefono"));
			empresa.setRepresentanteLegal(representanteLegalService.findById((Long) obj.get("representanteLegalId")).get() );
			save(empresa);
		}
		
	}

	

}
