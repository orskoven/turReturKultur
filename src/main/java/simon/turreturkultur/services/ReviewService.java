package simon.turreturkultur.services;


import org.springframework.stereotype.Service;
import simon.turreturkultur.models.Band;
import simon.turreturkultur.models.Review;
import simon.turreturkultur.repositories.ReviewRepository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class ReviewService implements IReviewService<Review, Long> {

    private ReviewRepository repository;

    public ReviewService(ReviewRepository repository) {
        this.repository = repository;
    }


    @Override
    public <S extends Review> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Review> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Review> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Set<Review> findAll() {
        return new HashSet<>(repository.findAll());
    }

    @Override
    public Set<Review> findAllById(Iterable<Long> longs) {
        Set<Review> set = new HashSet<Review>();
        repository.findAllById(longs).addAll(set);
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
    public void delete(Review entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Review> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
