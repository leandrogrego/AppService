package br.com.appservice.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.appservice.project.bean.NotaFiscal;

public interface NotaFiscalRepository extends JpaRepository<NotaFiscal, Long> {

}
