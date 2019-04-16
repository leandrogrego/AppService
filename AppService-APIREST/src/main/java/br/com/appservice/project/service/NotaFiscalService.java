package br.com.appservice.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.appservice.project.bean.NotaFiscal;
import br.com.appservice.project.repository.NotaFiscalRepository;

@Service
public class NotaFiscalService {

	@Autowired
	private NotaFiscalRepository repository;

	public List<NotaFiscal> read() {
		return repository.findAll();
	}

	public boolean create(NotaFiscal notaFiscal) {
		repository.saveAndFlush(notaFiscal);
		return true;
	}

	public NotaFiscal findOne(long id) {
		return repository.getOne(id);
	}

	public boolean delete(NotaFiscal notaFiscal) {
		repository.delete(notaFiscal);
		return true;
	}
}
