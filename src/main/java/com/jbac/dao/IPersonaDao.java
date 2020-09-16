package com.jbac.dao;

import java.util.List;

import com.jbac.model.Persona;

public interface IPersonaDao {
	
	public void registrar(Persona persona) throws Exception;
	
	public void delete(int id)throws Exception;
	
	public void update(Persona persona)throws Exception;
	
	public List<Persona> findAll()throws Exception;
	
	public Persona findById(int id)throws Exception;
}
