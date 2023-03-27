package program.randit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import program.randit.entity.Chat;

public interface chatRepository extends JpaRepository<Chat,Long> {

}
