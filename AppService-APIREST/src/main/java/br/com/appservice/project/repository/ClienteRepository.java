package br.com.appservice.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.appservice.project.bean.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {

}
