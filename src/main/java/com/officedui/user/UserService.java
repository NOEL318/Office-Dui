package com.officedui.user;

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

    public User createUser(ObjectId _id, String name, String email, String password, String age, String image_url, String role, String address) {
        User user = userRepository.insert(new User(_id, name, email, password, age, image_url, role, address));
        return user;
    }

    public User signUser(String email, String password) {
        User user = userRepository.findByEmail(email);
        boolean result = user.getPasswordConfirmation(password);
        System.out.println("result" + result);
        if (result) {
            return user;
        } else {
            user = null;
            System.out.println(user + "user");
            return user;
        }
    }
}
