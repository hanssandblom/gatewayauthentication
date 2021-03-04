package se.iths.authservice;

import org.springframework.data.jpa.repository.JpaRepository;
import se.iths.authservice.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
