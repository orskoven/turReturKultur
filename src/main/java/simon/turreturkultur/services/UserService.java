package simon.turreturkultur.services;

import org.springframework.stereotype.Service;
import simon.turreturkultur.models.Band;
import simon.turreturkultur.models.User;
import simon.turreturkultur.repositories.UserRepository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class UserService implements IUserService<User, Long>{

    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public <S extends User> S save(S entity) {
        return repository.save(entity);
    }

    @Override
    public <S extends User> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<User> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Set<User> findAll() {
        return new HashSet<>(repository.findAll());
    }

    @Override
    public Set<User> findAllById(Iterable<Long> longs) {
        Set<User> set = new HashSet<User>();
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
    public void delete(User entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends User> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
