package br.com.appservice.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.appservice.project.bean.Prestador;
import br.com.appservice.project.repository.PrestadorRepository;

@Service
public class PrestadorService {

	@Autowired
	private PrestadorRepository repository;

	public boolean create(Prestador prestador) {
		repository.saveAndFlush(prestador);
		return true;
	}

	public List<Prestador> read() {
		return repository.findAll();
	}

	public Prestador findOne(long id) {
		return repository.findOne(id);
	}

	public boolean delete(Prestador prestador) {
		repository.delete(prestador);
		return true;
	}
}
