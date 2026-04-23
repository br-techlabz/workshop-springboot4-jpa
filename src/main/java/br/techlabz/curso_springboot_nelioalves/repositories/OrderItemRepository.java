package br.techlabz.curso_springboot_nelioalves.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.techlabz.curso_springboot_nelioalves.entities.OrderItem;
import br.techlabz.curso_springboot_nelioalves.entities.pk.OrderItemPK;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
