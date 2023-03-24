package program.randit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import program.randit.entity.Diet;

public interface DietRepository extends JpaRepository<Diet,Long> {
}
