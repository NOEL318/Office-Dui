package com.officedui.article;

import com.officedui.orders.Orders;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "articles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article
{
    @Id
    private ObjectId _id;
    private String id;
    private String title;
    private Double price;
    private String description;
    private List<String> images;
    private Integer category_id;
    @DocumentReference
    private List<Orders> ordersIds;
}
