package br.techlabz.curso_springboot_nelioalves.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.techlabz.curso_springboot_nelioalves.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
