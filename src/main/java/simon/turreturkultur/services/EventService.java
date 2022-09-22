package simon.turreturkultur.services;

import org.springframework.stereotype.Service;
import simon.turreturkultur.models.Band;
import simon.turreturkultur.models.Event;
import simon.turreturkultur.repositories.EventRepository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class EventService implements IEventService<Event, Long> {


    private EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }


    @Override
    public <S extends Event> S save(S entity) {
        return eventRepository.save(entity);
    }

    @Override
    public <S extends Event> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Event> findById(Long aLong) {
        return eventRepository.findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Set<Event> findAll() {
        return new HashSet<>(eventRepository.findAll());
    }

    @Override
    public Set<Event> findAllById(Iterable<Long> longs) {
        Set<Event> set = new HashSet<Event>();
        eventRepository.findAllById(longs).addAll(set);
        return set;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Event entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Event> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
