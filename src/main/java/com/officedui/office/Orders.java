package com.officedui.office;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
    @Id
    private ObjectId id;
    private String order_date;
    private List<String>  client;
    private List<String> items;
    private List<String> pay_method;
    private List<String> shipment;
    private Double total;
    private String status;

    public Orders(String status) {
        this.status = status;
    }

}
