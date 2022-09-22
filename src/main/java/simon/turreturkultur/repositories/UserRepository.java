package simon.turreturkultur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import simon.turreturkultur.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
