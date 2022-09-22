package simon.turreturkultur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import simon.turreturkultur.models.Band;

public interface BandRepository extends JpaRepository<Band, Long> {
}
