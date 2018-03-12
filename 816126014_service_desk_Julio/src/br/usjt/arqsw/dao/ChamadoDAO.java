package br.usjt.arqsw.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import br.usjt.arqsw.entity.Chamado;
import br.usjt.arqsw.entity.Fila;
import br.usjt.arqsw.service.FilaService;

/**
 * 
 * @author julio 816126014
 *
 */

public class ChamadoDAO {
	
	// Crie a classe ChamadoDAO com um método que retorne um ArrayList<Chamado> de uma determinada fila
	public int criarChamado(Chamado chamado) throws IOException{
		
		Date dataAbertura = new Date(chamado.getDT_ABERTURA().getTime());
		return 0;
	}
		
	public ArrayList<Chamado> listarChamados(Fila fila) throws IOException{
		
		String sqlSelect = "select * from chamado WHERE chamado.ID_FILA = ?";		
		ArrayList<Chamado> lista = new ArrayList<>();
		
		try (Connection conn = ConnectionFactory.getConnection();
				PreparedStatement pst = conn.prepareStatement(sqlSelect);) {
				pst.setInt(1, fila.getId());
			
			try (ResultSet rs = pst.executeQuery();) {
				
				while(rs.next()) {
									
				Chamado chamado = new Chamado();
				chamado.setId(1);
				chamado.setStatus(rs.getString("STATUS"));
				chamado.setDescricao(rs.getString("DESCRICAO"));
				chamado.setDT_ABERTURA(rs.getDate("DT_ABERTURA"));
				chamado.setDT_FECHAMENTO(rs.getDate("DT_FECHAMENTO"));
				
				int id_fila = rs.getInt("ID_FILA");
				
				if(id_fila==1){
					FilaService fs = new FilaService();							
					fila = fs.carregar(id_fila);
					chamado.setFila(fila);
				}
				
				lista.add(chamado);
									
				}

			} catch (SQLException e) {
				throw new IOException(e);
			}
		} catch (SQLException e1) {
			System.out.print(e1.getStackTrace());
		}
		
		return lista;
		
	}
		

}
