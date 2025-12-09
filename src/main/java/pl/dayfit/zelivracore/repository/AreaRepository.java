package pl.dayfit.zelivracore.repository;

import org.jspecify.annotations.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.dayfit.zelivracore.model.Area;

import java.util.UUID;

public interface AreaRepository extends JpaRepository<@NonNull Area, @NonNull UUID> {
}
