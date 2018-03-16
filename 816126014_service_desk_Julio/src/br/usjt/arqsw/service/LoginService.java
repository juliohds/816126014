package br.usjt.arqsw.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.arqsw.dao.LoginDAO;
import br.usjt.arqsw.entity.Login;

/***
 * 
 * @author 816126014 Julio Henrique dos Santos SIN3AN-MCA | USJT MOOCA
 */


@Service
public class LoginService {
	private LoginDAO dao;
	
	@Autowired
	public LoginService(LoginDAO dao){
		this.dao = dao;
	}
	
	public boolean validarLogin(Login login) throws IOException{
		return dao.validarLogin(login);
	}
}
