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

import br.com.appservice.project.bean.Servico;
import br.com.appservice.project.service.ServicoService;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Serviço")
@CrossOrigin(origins="*") //Dominio de acesso
public class ServicoController {
	@Autowired
	private ServicoService crud;
 
	 @ApiResponses(value={
	    		@ApiResponse(code = 200, message = "Serviço Retornado com sucesso"),
				@ApiResponse(code = 401, message = "Você não está autorizado a visualizar o recurso"),
			    @ApiResponse(code = 403, message = "Acessar o recurso que você estava tentando acessar é proibido"),
			    @ApiResponse(code = 404, message = "O recurso que você estava tentando acessar não foi encontrado")
	    })
	@ApiOperation(value="Retorna Serviço")
	@GetMapping("/servico/{id}")
	public Servico findByIdServico(@PathVariable("id") long id) {
		return crud.findOne(id);
	}
	 
	 @ApiResponses(value={
	    		@ApiResponse(code = 200, message = "Serviços Retornados com sucesso"),
				@ApiResponse(code = 401, message = "Você não está autorizado a visualizar o recurso"),
			    @ApiResponse(code = 403, message = "Acessar o recurso que você estava tentando acessar é proibido"),
			    @ApiResponse(code = 404, message = "O recurso que você estava tentando acessar não foi encontrado")
	    })
    @ApiOperation(value="Retorna Lista Serviços")
	@GetMapping("/servicos")
	public List<Servico> read() {
		return crud.read();
	}
	
	 @ApiResponses(value={
	    		@ApiResponse(code = 200, message = "Serviço Adicionado com sucesso"),
				@ApiResponse(code = 401, message = "Você não está autorizado a visualizar o recurso"),
			    @ApiResponse(code = 403, message = "Acessar o recurso que você estava tentando acessar é proibido"),
			    @ApiResponse(code = 404, message = "O recurso que você estava tentando acessar não foi encontrado")
	    })
    @ApiOperation(value="Adiciona Servico")
	@PostMapping("/servico")
	public boolean create(@RequestBody Servico servico) {
		return crud.create(servico);
	}
	 
	 @ApiResponses(value={
	    		@ApiResponse(code = 200, message = "Serviço Deletado com sucesso"),
				@ApiResponse(code = 401, message = "Você não está autorizado a visualizar o recurso"),
			    @ApiResponse(code = 403, message = "Acessar o recurso que você estava tentando acessar é proibido"),
			    @ApiResponse(code = 404, message = "O recurso que você estava tentando acessar não foi encontrado")
	    })
	 @ApiOperation(value="Deleta Serviço")
	@DeleteMapping("servico/{id}")
	public boolean delete(@PathVariable("id") long id) {
		return crud.delete(crud.findOne(id));
	}
	 
	 @ApiResponses(value={
	    		@ApiResponse(code = 200, message = "Serviço Atualizado com sucesso"),
				@ApiResponse(code = 401, message = "Você não está autorizado a visualizar o recurso"),
			    @ApiResponse(code = 403, message = "Acessar o recurso que você estava tentando acessar é proibido"),
			    @ApiResponse(code = 404, message = "O recurso que você estava tentando acessar não foi encontrado")
	    })
    @ApiOperation(value="Atualiza Serviço")
	@PutMapping("/servico")
	public boolean update(@RequestBody Servico servico) {
		return crud.create(servico);
	}
}
