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

import br.com.appservice.project.bean.Cliente;
import br.com.appservice.project.service.ClienteService;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Cliente")
@CrossOrigin(origins="*") //Dominio de acesso.
public class ClienteController {

	@Autowired
	private ClienteService crud;

    @ApiResponses(value={
    		@ApiResponse(code = 200, message = "Cliente Retornado com sucesso"),
			@ApiResponse(code = 401, message = "Você não está autorizado a visualizar o recurso"),
		    @ApiResponse(code = 403, message = "Acessar o recurso que você estava tentando acessar é proibido"),
		    @ApiResponse(code = 404, message = "O recurso que você estava tentando acessar não foi encontrado")
    })
    @ApiOperation(value="Retorna um Cliente")
	@GetMapping("/cliente/{id}")
	public Cliente findById(@PathVariable("id") long id) {
		return crud.findOne(id);
	}
    
    @ApiResponses(value={
    		@ApiResponse(code = 200, message = "Clientes Retornado com sucesso"),
			@ApiResponse(code = 401, message = "Você não está autorizado a visualizar o recurso"),
		    @ApiResponse(code = 403, message = "Acessar o recurso que você estava tentando acessar é proibido"),
		    @ApiResponse(code = 404, message = "O recurso que você estava tentando acessar não foi encontrado")
    })
	@ApiOperation(value="Retorna Lista de Clientes")
    @GetMapping("/clientes")
	public List<Cliente> read() {
		return crud.read();
	}

    @ApiResponses(value={
    		@ApiResponse(code = 200, message = "Clientes Adiconado com sucesso"),
			@ApiResponse(code = 401, message = "Você não está autorizado a visualizar o recurso"),
		    @ApiResponse(code = 403, message = "Acessar o recurso que você estava tentando acessar é proibido"),
		    @ApiResponse(code = 404, message = "O recurso que você estava tentando acessar não foi encontrado")
    })
	@ApiOperation(value="Adiciona Cliente")
	@PostMapping("/cliente")
	public boolean create(@RequestBody Cliente cliente) {
		return crud.create(cliente);
	}

    @ApiResponses(value={
    		@ApiResponse(code = 200, message = "Cliente deletado com sucesso"),
			@ApiResponse(code = 401, message = "Você não está autorizado a visualizar o recurso"),
		    @ApiResponse(code = 403, message = "Acessar o recurso que você estava tentando acessar é proibido"),
		    @ApiResponse(code = 404, message = "O recurso que você estava tentando acessar não foi encontrado")
    })
	@ApiOperation(value="Deleta Cliente")
	@DeleteMapping("cliente/{id}")
	public boolean delete(@PathVariable("id") long id) {
		return crud.delete(crud.findOne(id));
	}
    @ApiResponses(value={
    		@ApiResponse(code = 200, message = "Cliente atualizado com sucesso"),
			@ApiResponse(code = 401, message = "Você não está autorizado a visualizar o recurso"),
		    @ApiResponse(code = 403, message = "Acessar o recurso que você estava tentando acessar é proibido"),
		    @ApiResponse(code = 404, message = "O recurso que você estava tentando acessar não foi encontrado")
    })
	@ApiOperation(value="Atualizar Cliente")
	@PutMapping("/cliente")
	public boolean update(@RequestBody Cliente cliente) {
		return crud.create(cliente);
	}
}
