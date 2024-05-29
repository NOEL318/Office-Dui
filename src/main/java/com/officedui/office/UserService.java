package com.officedui.office;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private MongoTemplate mongoTemplate;

    public User createUser(ObjectId _id,  String name, String email, String password, String age, String image_url, String role, String address) {
        System.out.println("Service");
        User user = userRepository.insert(new User(_id, name, email, password, age, image_url, role, address));
        return user;
    }
    public User signUser(String email){
        return userRepository.findByEmail(email);
    }
}
