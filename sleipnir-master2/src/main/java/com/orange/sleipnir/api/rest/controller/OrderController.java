package com.orange.sleipnir.api.rest.controller;

import java.math.BigDecimal;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.orange.sleipnir.repository.mapper.OrderMapper;
import com.orange.sleipnir.repository.model.Order;

@RestController
@RequestMapping("/master2/order")
public class OrderController {

    private final OrderMapper orderMapper;
    private final Random random = new Random();

    public OrderController(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    @GetMapping("/finderById")
    public Order findById(@RequestParam("id") Long id) {
        return orderMapper.findById(id);
    }

    @GetMapping("/finderByOrderNo")
    public Order findByOrderNo(@RequestParam("orderNo") String orderNo) {
        return orderMapper.findByOrderNo(orderNo);
    }

    @PostMapping("/insert")
    public void createOrder() {
        int nextInt = random.nextInt(100);
        Order order = new Order(null, 1L, "order-" + System.currentTimeMillis(), BigDecimal.valueOf(nextInt));
        orderMapper.insert(order);
    }

    @PostMapping("/update")
    public void updateOrder() {
        Order order = orderMapper.findById(1L);
        order.setAmount(BigDecimal.valueOf(random.nextInt(100)));
        orderMapper.update(order);
    }

    @PostMapping("/delete")
    public void deleteOrder() {
        orderMapper.delete(1L);
    }

}
