package br.com.appservice.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.appservice.project.bean.Servico;
import br.com.appservice.project.repository.ServicoRepository;

@Service
public class ServicoService {
	
	@Autowired
	private ServicoRepository repository;

	public boolean create(Servico servico) {
		repository.saveAndFlush(servico);
		return true;
	}

	public List<Servico> read() {
		return repository.findAll();
	}

	public Servico findOne(long id) {
		return repository.findOne(id);
	}

	public boolean delete(Servico servico) {
		repository.delete(servico);
		return true;
	}
}
