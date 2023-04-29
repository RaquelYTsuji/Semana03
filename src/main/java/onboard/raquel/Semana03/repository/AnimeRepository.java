package onboard.raquel.Semana03.repository;

import onboard.raquel.Semana03.domain.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//conexão direta com o banco de dados
public interface AnimeRepository extends JpaRepository<Anime, Long> {

}
