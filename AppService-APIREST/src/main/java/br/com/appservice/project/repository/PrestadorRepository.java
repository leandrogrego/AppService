package br.com.appservice.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.appservice.project.bean.Prestador;

public interface PrestadorRepository extends JpaRepository<Prestador,Long> {

}
