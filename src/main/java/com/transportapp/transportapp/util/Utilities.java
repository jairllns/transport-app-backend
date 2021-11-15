package com.transportapp.transportapp.util;

import java.util.HashMap;

public class Utilities {

	
	  
	  public static HashMap<String, String> getTipoDocumentoList() {
	    HashMap<String, String> documentList =new HashMap<String, String>();
	    documentList.put("CC", "Cedula de ciudadania");
	    documentList.put("TI", "Tarjeta de identidad");
	    documentList.put("RC", "Registro civil");
	    documentList.put("PP", "Pasaporte");
	    documentList.put("PEP", "Permiso especial de permanencia");
	    documentList.put("NIT", "Nit");
	    return documentList;
	  }
	  
}
