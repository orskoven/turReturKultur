package simon.turreturkultur.models;


import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Band {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "band")
    @ToString.Exclude/// modtager har allerde mapper over
    private Set<Event> event = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Band band = (Band) o;
        return id != null && Objects.equals(id, band.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
