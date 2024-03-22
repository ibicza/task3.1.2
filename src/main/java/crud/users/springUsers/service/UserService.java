package crud.users.springUsers.service;

import crud.users.springUsers.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    Optional<User> getUserById(Long id);

    void deleteUser(Long id);
}
