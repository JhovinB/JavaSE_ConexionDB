package com.jbac.controller;

import com.jbac.dao.IPersonaDao;
import com.jbac.impl.PersonaDaoImpl;
import com.jbac.model.Persona;

public class App {
	public static void main(String[] args) {
		
		IPersonaDao dao = new PersonaDaoImpl();
		
		try{
			//dao.update(new Persona(4, "Maho", "Lozano"));
			dao.registrar(new Persona(4, "Jaime", "MedinaC"));
			//dao.findAll().forEach(x -> System.out.println(x.getId() + x.getNombres() + x.getApellidos()));
			System.out.println("¡Éxito!");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
}
