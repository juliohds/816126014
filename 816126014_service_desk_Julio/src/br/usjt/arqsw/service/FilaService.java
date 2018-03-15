package br.usjt.arqsw.service;

import java.io.IOException;
import java.util.ArrayList;

import br.usjt.arqsw.dao.FilaDAO;
import br.usjt.arqsw.entity.Fila;

/**
 * 
 * @author julio 816126014
 *
 */

public class FilaService {
	private FilaDAO dao;
	
	public FilaService() {
		
	}
	public ArrayList<Fila> listarFilas() throws IOException{
				
		return dao.listarFilas();
	}
	
	
	public Fila carregar(int id) throws IOException{
		// TODO 4.3. Complete o método carregar(int id) da classe FilaService 
		//que deve retornar um objeto fila com o nome e o id.
		Fila fila = dao.Carregar(id);
		
		return fila;
	}
}
