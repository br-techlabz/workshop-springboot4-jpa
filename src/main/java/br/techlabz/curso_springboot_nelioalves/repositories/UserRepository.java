package br.techlabz.curso_springboot_nelioalves.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.techlabz.curso_springboot_nelioalves.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
