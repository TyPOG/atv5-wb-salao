package com.autobots.automanager.controles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.autobots.automanager.entidades.Endereco;
import com.autobots.automanager.repositorios.EnderecoRepositorio;

@RestController
@RequestMapping("/endereço")
public class EnderecoControle {
	@Autowired
	private EnderecoRepositorio repositorio;
	
	@GetMapping("/enderecos")
	public List<Endereco> obterEnderecos(){
		List<Endereco> endereco = repositorio.findAll();
		return endereco;
		}
}
