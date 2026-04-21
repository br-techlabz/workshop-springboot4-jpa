package br.techlabz.curso_springboot_nelioalves.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.techlabz.curso_springboot_nelioalves.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
