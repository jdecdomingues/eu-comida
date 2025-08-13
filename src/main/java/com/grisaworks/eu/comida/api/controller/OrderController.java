package com.grisaworks.eu.comida.api.controller;

import com.grisaworks.eu.comida.domain.model.Order;
import com.grisaworks.eu.comida.domain.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
@RequestMapping("/orders")
public class OrderController {

private final OrderService orderService;

@PostMapping
@ResponseStatus(HttpStatus.CREATED)
public Order create(@RequestBody Order order){
    return orderService.save(order);
}

}
