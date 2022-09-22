package simon.turreturkultur.services;

import org.springframework.stereotype.Service;
import simon.turreturkultur.models.Band;
import simon.turreturkultur.repositories.BandRepository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class BandService implements IBandService<Band, Long> {

    private BandRepository bandRepository;

    public BandService(BandRepository bandRepository) {
        this.bandRepository = bandRepository;
    }


    @Override
    public <S extends Band> S save(S entity) {
        return bandRepository.save(entity);
    }

    @Override
    public <S extends Band> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Band> findById(Long aLong) {
        return bandRepository.findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Set<Band> findAll() {
        return new HashSet<>(bandRepository.findAll());
    }

    @Override
    public Set<Band> findAllById(Iterable<Long> longs) {
        Set<Band> set = new HashSet<Band>();
        bandRepository.findAllById(longs).addAll(set);
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
    public void delete(Band entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Band> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
