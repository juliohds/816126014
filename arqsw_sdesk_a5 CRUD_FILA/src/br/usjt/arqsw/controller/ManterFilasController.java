package br.usjt.arqsw.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.usjt.arqsw.entity.Chamado;
import br.usjt.arqsw.entity.Fila;
import br.usjt.arqsw.service.FilaService;

@Transactional
@Controller("/fila")
public class ManterFilasController {
	private FilaService filaService;

	@Autowired
	public ManterFilasController(FilaService fs) {
		filaService = fs;
	}

	@RequestMapping("index")
	public String inicio() {
		return "index";
	}

	private List<Fila> listarFilas() throws IOException {
		return filaService.listarFilas();
	}

	/**
	 * 
	 * @param model
	 *            Acesso à request http
	 * @return JSP de Listar Chamados
	 */
	@RequestMapping("/listar_filas")
	public String listarFilasExibir(Model model) {
		try {
			model.addAttribute("filas", listarFilas());
			return "FilaListar";
		} catch (IOException e) {
			e.printStackTrace();
			return "Erro";
		}
	}

	@RequestMapping("/novaFila")
	public String novoChamado(Model model) {
		return "NovaFila";
	}

	@RequestMapping("/salvarFila")
	public String salvarChamado(Fila fila, BindingResult result, Model model) {

		try {
			System.out.println(fila.getNome());
			filaService.novaFila(fila);
			model.addAttribute("filas", listarFilas());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "FilaListar";
	}
		
	@RequestMapping("/editar_fila")
	public String editar_fila(int id, Model model) {
		try {							
			model.addAttribute("fila", filaService.carregar(id));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "FilaEditar"; 
	}
	
	
	@RequestMapping("/excluir_fila")
	public String excluirChamado(int id, Model model) {
		try {
			Fila fila = new Fila();			
			fila = filaService.carregar(id);
			filaService.excluirFila(fila);
			model.addAttribute("filas", listarFilas());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "FilaListar"; 
	}
	
	@RequestMapping("/modificarFila")
	public String modificarFila(Fila fila, Model model) {
		try {			
			int id = fila.getId();
			fila = filaService.carregar(id);
			filaService.editarFila(fila);
			model.addAttribute("filas", listarFilas());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "FilaListar"; 
	}
	
	@RequestMapping("/exibir_fila")
	public String exibir_fila(int id, Model model) {
		try {									
			model.addAttribute("fila", filaService.carregar(id));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "FilaDetalhes"; 
	}
	
	
	
}
