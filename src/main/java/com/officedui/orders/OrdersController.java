package com.officedui.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;
    @PostMapping("createOrder")
    public ResponseEntity<Orders> createOrder(@RequestBody Map<String, String> payload){
        return new ResponseEntity<Orders>(ordersService.createOrders(payload.get("status"), payload.get("id")), HttpStatus.CREATED);
    }

    @PostMapping("welcomeOrders")
    public String welcomeOrders(){
        return "Welcome from secure endpoint";
    }
}
