package br.techlabz.curso_springboot_nelioalves.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.techlabz.curso_springboot_nelioalves.entities.Order;
import br.techlabz.curso_springboot_nelioalves.entities.User;
import br.techlabz.curso_springboot_nelioalves.repositories.OrderRepository;
import br.techlabz.curso_springboot_nelioalves.repositories.UserRepository;


@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		
		return obj.get();
	}

}
