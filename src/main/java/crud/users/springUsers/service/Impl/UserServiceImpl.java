package crud.users.springUsers.service.Impl;


import crud.users.springUsers.Repository.UserRepository;
import crud.users.springUsers.model.User;
import crud.users.springUsers.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public void saveUser(User user) {
        repository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return repository.getReferenceById(id);
    }

    @Override
    public void deleteUser(Long id) {
        repository.deleteById(id);
    }
}
