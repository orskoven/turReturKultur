package simon.turreturkultur.services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.validation.ObjectError;
import simon.turreturkultur.models.Review;

import java.util.Optional;
import java.util.Set;


public interface ICrudService<T,Long> extends CrudRepository<T,Long> {
}
