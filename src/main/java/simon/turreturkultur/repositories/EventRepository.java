package simon.turreturkultur.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import simon.turreturkultur.models.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
}
