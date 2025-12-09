package pl.dayfit.zelivracore.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import org.jspecify.annotations.NullMarked;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

@Entity
@NullMarked
public record Area(
        @Id
        @GeneratedValue(strategy = GenerationType.UUID)
        UUID id,
        @Column(nullable = false)
        String name,
        @Size(min = 1)
        List<Coordinates> coordinates,
        Float radius,
        @Column(nullable = false)
        Instant modifiedAt
) {
    public record Coordinates(int lat, int lng) {}
}
