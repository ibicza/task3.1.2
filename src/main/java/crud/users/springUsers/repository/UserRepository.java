package crud.users.springUsers.repository;

import crud.users.springUsers.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
