package com.orange.sleipnir.api.rest.controller;

import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.orange.sleipnir.repository.entity.Order;
import com.orange.sleipnir.repository.mapper.OrderMapper;

@RestController
@RequestMapping("/master2/order")
public class OrderController {

    private final OrderMapper orderMapper;
    private final Random random = new Random();

    public OrderController(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    @GetMapping("/get")
    public List<Order> getOrder(@RequestParam Integer userId,
            @RequestParam Integer accountId) {
        return orderMapper.selectUserIdAndAccountId(userId, accountId);
    }

    /**
     * java.sql.SQLException: Not allow DML operation without sharding conditions
     * plz check your sharding conditions or check your auditStrategy
     */
    @GetMapping("/getbyOrderId")
    public Order getMethodName(@RequestParam Long orderId) {
        return orderMapper.selectByOrderId(orderId);
    }

    @PostMapping("/create")
    public Long createOrder(@RequestBody Order order) {
        orderMapper.insert(order);
        return order.getOrderId();
    }

    @PostMapping("/update")
    public void updateOrder(@RequestBody Order order) {
        orderMapper.update(order);
    }

    public Order random() {
        Order order = new Order();
        order.setAccountId(random.nextInt(Integer.MAX_VALUE));
        order.setUserId(random.nextInt(Integer.MAX_VALUE));
        return order;
    }

}
