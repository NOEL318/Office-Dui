package com.officedui.office;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class OrdersService {
    @Autowired
    private OrdersRepository ordersRepository;
    @Autowired
    private MongoTemplate mongoTemplate;

    public Orders createOrders(String status, String id) {
        Orders order = ordersRepository.insert(new Orders(status));
        mongoTemplate.update(Article.class).matching(Criteria.where("id").is(id)).apply(new Update().push("orderIds").value(order)).first();
        return order;
    }
}
