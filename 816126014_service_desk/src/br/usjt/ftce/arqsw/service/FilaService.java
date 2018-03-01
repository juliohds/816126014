package br.usjt.ftce.arqsw.service;

import java.io.IOException;
import java.util.ArrayList;

import br.usjt.ftce.arqsw.dao.FilaDao;
import br.usjt.ftce.arqsw.entity.Fila;

public class FilaService {
	
private FilaDao dao;
	
	public FilaService() {
		dao = new FilaDao();
	}
	
	public ArrayList<Fila> ListarFilas() throws IOException{
			
		return dao.ListarFilas();

	}

}
