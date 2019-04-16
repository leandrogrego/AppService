package br.com.appservice.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.appservice.project.bean.Cliente;
import br.com.appservice.project.repository.ClienteRepository;

@Service
public class ClienteService {
	@Autowired
	private ClienteRepository repository;

	public boolean create(Cliente cliente) {
		repository.saveAndFlush(cliente);
		return true;
	}

	public List<Cliente> read() {
		return repository.findAll();
	}

	public Cliente findOne(long id) {
		return repository.findOne(id);
	}

	public boolean delete(Cliente cliente) {
		repository.delete(cliente);
		return true;
	}
}
