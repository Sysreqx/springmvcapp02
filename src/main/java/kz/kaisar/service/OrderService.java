package kz.kaisar.service;

import kz.kaisar.domain.Order;

import java.util.List;

public interface OrderService {

    void save(Order order);

    void delete(Order order);

    List<Order> getAll();

    Order getById(Integer id);
}