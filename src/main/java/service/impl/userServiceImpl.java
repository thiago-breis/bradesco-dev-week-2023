package service.impl;

import model.user;
import repository.userRepository;
import service.userService;
import service;

import java.util.NoSuchElementException;

@service
public class userServiceImpl implements userService {

    private final userRepository userRepository;

    public userServiceImpl(userRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public user findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public user create(user userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new IllegalArgumentException("This Account number already exists.");
        }
        return userRepository.save(userToCreate);
    }
}
