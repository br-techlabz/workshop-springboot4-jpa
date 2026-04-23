package br.techlabz.curso_springboot_nelioalves.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.techlabz.curso_springboot_nelioalves.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
