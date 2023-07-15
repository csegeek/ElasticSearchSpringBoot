package com.example.ElasticSearch.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ElasticSearch.entity.User;
import com.example.ElasticSearch.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private  UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(UUID id) {
        return userRepository.findById(id).orElse(null);
    }

    public void deleteUser(UUID id) {
        userRepository.deleteById(id);
    }

    public List<User> getAllUsers(){
        Iterable<User> iterableUsers =userRepository.findAll();  
        List<User> userList = new ArrayList<>();
        iterableUsers.forEach(userList::add);
        return userList;
    }

}
