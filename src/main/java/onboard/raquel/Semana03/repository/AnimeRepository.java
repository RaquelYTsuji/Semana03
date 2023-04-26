package onboard.raquel.Semana03.repository;

import onboard.raquel.Semana03.domain.Anime;

import java.util.List;

//conexão direta com o banco de dados
public interface AnimeRepository {
    List<Anime> listAll();
}
