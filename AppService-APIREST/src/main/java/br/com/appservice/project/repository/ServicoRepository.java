package br.com.appservice.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.appservice.project.bean.Servico;

public interface ServicoRepository extends JpaRepository<Servico,Long>{

}
