package simon.turreturkultur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import simon.turreturkultur.models.Review;

public interface ReviewRepository extends JpaRepository<Review,Long> {
}
