package onboard.raquel.Semana03.mapper;

import onboard.raquel.Semana03.domain.Anime;
import onboard.raquel.Semana03.requests.AnimePostRequestBody;
import onboard.raquel.Semana03.requests.AnimePutRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class AnimeMapper {
    public static final AnimeMapper INSTANCE = Mappers.getMapper(AnimeMapper.class);
    public abstract Anime toAnime(AnimePostRequestBody animePostRequestBody);
    public abstract Anime toAnime(AnimePutRequestBody animePostRequestBody);
}
