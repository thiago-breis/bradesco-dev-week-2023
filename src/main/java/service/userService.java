package service;

import model.user;

public interface userService {

    user findById(Long id);

    user create(user userToCreate);
}
