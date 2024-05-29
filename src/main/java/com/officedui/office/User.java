package com.officedui.office;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private ObjectId _id;
    private String name;
    private String email;
    private String password;
    private String age;
    private String image_url;
    private String role;
    private String address;
    @DocumentReference
    private List<Orders> ordersIds;

    public User(ObjectId _id, String name, String email, String password, String age, String image_url, String role, String address) {
        this._id = _id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.age = age;
        this.image_url = image_url;
        this.role = role;
        this.address = address;
        System.out.println("User");
    }
}
