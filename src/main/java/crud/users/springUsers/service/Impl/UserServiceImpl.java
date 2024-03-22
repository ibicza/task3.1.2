package crud.users.springUsers.service.Impl;


import crud.users.springUsers.repository.UserRepository;
import crud.users.springUsers.model.User;
import crud.users.springUsers.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

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
    public Optional<User> getUserById(Long id) {
        return Optional.of(repository.getReferenceById(id));
    }

    @Override
    public void deleteUser(Long id) {
        repository.deleteById(id);
    }
}
