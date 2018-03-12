package br.usjt.arqsw.service;

import java.io.IOException;
import java.util.ArrayList;

import br.usjt.arqsw.dao.ChamadoDAO;
import br.usjt.arqsw.entity.Chamado;
import br.usjt.arqsw.entity.Fila;

//TODO  Faça o ChamadoService na package servisse com um método para listar os chamados 
//      recebendo como parâmetro um objeto Fila


	public class ChamadoService {
		
		private ChamadoDAO dao;
		
		public ChamadoService() {
			this.dao = new ChamadoDAO();
		}
		
		public int criarChamado(Chamado chamado) throws IOException{
			
			
			return 0;
		}
		
		
		public ArrayList<Chamado> listarChamados(Fila fila) throws IOException{
			
			ArrayList<Chamado> listaChamados = new ArrayList<>();								
			listaChamados = dao.listarChamados(fila);			
			return listaChamados;					 
						
		}
	
	}

	
	

