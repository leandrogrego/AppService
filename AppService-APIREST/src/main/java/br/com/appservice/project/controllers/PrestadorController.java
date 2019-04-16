package br.com.appservice.project.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.appservice.project.bean.Prestador;
import br.com.appservice.project.service.PrestadorService;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Prestador")
@CrossOrigin(origins = "*")// dominico de acesso
public class PrestadorController {
	@Autowired
	private PrestadorService crud;

	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Prestador de Serviço Retornado com sucesso"),
			@ApiResponse(code = 401, message = "Você não está autorizado a visualizar o recurso"),
			@ApiResponse(code = 403, message = "Acessar o recurso que você estava tentando acessar é proibido"),
			@ApiResponse(code = 404, message = "O recurso que você estava tentando acessar não foi encontrado") })
	@ApiOperation(value = "Retorna um Prestador de Serviço")
	@GetMapping("/prestador/{id}")
	public Prestador findById(@PathVariable("id") long id) {
		return crud.findOne(id);
	}

	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Prestadores de Serviço Retornado com sucesso"),
			@ApiResponse(code = 401, message = "Você não está autorizado a visualizar o recurso"),
			@ApiResponse(code = 403, message = "Acessar o recurso que você estava tentando acessar é proibido"),
			@ApiResponse(code = 404, message = "O recurso que você estava tentando acessar não foi encontrado") })
	@ApiOperation(value = "Retorna Lista de Prestadores de Serviço")
	@GetMapping("/prestadores")
	public List<Prestador> read() {
		return crud.read();
	}

	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Prestador de Serviço adicionado com sucesso"),
			@ApiResponse(code = 401, message = "Você não está autorizado a visualizar o recurso"),
			@ApiResponse(code = 403, message = "Acessar o recurso que você estava tentando acessar é proibido"),
			@ApiResponse(code = 404, message = "O recurso que você estava tentando acessar não foi encontrado") })
	@ApiOperation(value = "Adiciona Prestador de Serviço")
	@PostMapping("/prestador")
	public boolean create(@RequestBody Prestador prestador) {
		return crud.create(prestador);
	}

	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Prestador de Serviço Deletado com sucesso"),
			@ApiResponse(code = 401, message = "Você não está autorizado a visualizar o recurso"),
			@ApiResponse(code = 403, message = "Acessar o recurso que você estava tentando acessar é proibido"),
			@ApiResponse(code = 404, message = "O recurso que você estava tentando acessar não foi encontrado") })
	@ApiOperation(value = "Deleta Prestador de Serviço")
	@DeleteMapping("prestador/{id}")
	public boolean delete(@PathVariable("id") long id) {
		return crud.delete(crud.findOne(id));
	}

	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Prestador de Serviço Atualizado com sucesso"),
			@ApiResponse(code = 401, message = "Você não está autorizado a visualizar o recurso"),
			@ApiResponse(code = 403, message = "Acessar o recurso que você estava tentando acessar é proibido"),
			@ApiResponse(code = 404, message = "O recurso que você estava tentando acessar não foi encontrado") })
	@ApiOperation(value = "Atualiza Prestador de Serviço")
	@PutMapping("/prestador")
	public boolean update(@RequestBody Prestador prestador) {
		return crud.create(prestador);
	}
}
