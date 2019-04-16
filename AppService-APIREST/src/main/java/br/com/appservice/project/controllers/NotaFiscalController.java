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

import br.com.appservice.project.bean.NotaFiscal;
import br.com.appservice.project.service.NotaFiscalService;

@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Nota Fiscal")
@CrossOrigin(origins = "*")
// Dominio de acesso
public class NotaFiscalController {
	@Autowired
	private NotaFiscalService crud;

	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "NotaFiscal Retornada com sucesso"),
			@ApiResponse(code = 401, message = "Você não está autorizado a visualizar o recurso"),
			@ApiResponse(code = 403, message = "Acessar o recurso que você estava tentando acessar é proibido"),
			@ApiResponse(code = 404, message = "O recurso que você estava tentando acessar não foi encontrado") })
	@ApiOperation(value = "Retorna NotaFiscal")
	@GetMapping("/notafiscal/{id}")
	public NotaFiscal findById(@PathVariable("id") long id) {
		return crud.findOne(id);
	}

	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Notas Fiscas Retornadas com sucesso"),
			@ApiResponse(code = 401, message = "Você não está autorizado a visualizar o recurso"),
			@ApiResponse(code = 403, message = "Acessar o recurso que você estava tentando acessar é proibido"),
			@ApiResponse(code = 404, message = "O recurso que você estava tentando acessar não foi encontrado") })
	@ApiOperation(value = "Retorna Lista de Notas Fiscais")
	@GetMapping("/notasfiscais")
	public List<NotaFiscal> read() {
		return crud.read();
	}

	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Nota Fiscal Adiconada com sucesso"),
			@ApiResponse(code = 401, message = "Você não está autorizado a visualizar o recurso"),
			@ApiResponse(code = 403, message = "Acessar o recurso que você estava tentando acessar é proibido"),
			@ApiResponse(code = 404, message = "O recurso que você estava tentando acessar não foi encontrado") })
	@ApiOperation(value = "Adiciona Nota Fiscal")
	@PostMapping("/notafiscal")
	public boolean create(@RequestBody NotaFiscal notaFiscal) {
		return crud.create(notaFiscal);
	}

	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "NotaFiscal Deletada com sucesso"),
			@ApiResponse(code = 401, message = "Você não está autorizado a visualizar o recurso"),
			@ApiResponse(code = 403, message = "Acessar o recurso que você estava tentando acessar é proibido"),
			@ApiResponse(code = 404, message = "O recurso que você estava tentando acessar não foi encontrado") })
	@ApiOperation(value = "Deleta Nota Fiscal")
	@DeleteMapping("notafiscal/{id}")
	public boolean delete(@PathVariable("id") long id) {
		return crud.delete(crud.findOne(id));
	}

	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Nota Fiscal Atualizada com sucesso"),
			@ApiResponse(code = 401, message = "Você não está autorizado a visualizar o recurso"),
			@ApiResponse(code = 403, message = "Acessar o recurso que você estava tentando acessar é proibido"),
			@ApiResponse(code = 404, message = "O recurso que você estava tentando acessar não foi encontrado") })
	@ApiOperation(value = "Atualiza notaFiscal")
	@PutMapping("/notafiscal")
	public boolean restUpdate(@RequestBody NotaFiscal notaFiscal) {
		return crud.create(notaFiscal);
	}
}
