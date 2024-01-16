import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface artworkRepository extends JpaRepository<artwork, Long> {

    List<artwork> findByTitleContaining(String title);
}
