package com.autobots.automanager.controles;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autobots.automanager.entidades.Documento;
import com.autobots.automanager.entidades.Endereco;
import com.autobots.automanager.modelo.ClienteSelecionador;
import com.autobots.automanager.repositorios.ClienteRepositorio;
import com.autobots.automanager.repositorios.DocumentosRepositorio;

@RestController
@RequestMapping("/documento")
public class DocumentoControle {
	@Autowired
	private DocumentosRepositorio repositorio;

	@GetMapping("/documentos")
	public List<Documento> obterDocs(){
		List<Documento> documento = repositorio.findAll();
		return documento;
	}
}
