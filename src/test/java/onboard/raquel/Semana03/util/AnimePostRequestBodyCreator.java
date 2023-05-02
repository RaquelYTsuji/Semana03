package onboard.raquel.Semana03.util;

import onboard.raquel.Semana03.domain.Anime;
import onboard.raquel.Semana03.requests.AnimePostRequestBody;

public class AnimePostRequestBodyCreator {
    public static AnimePostRequestBody createAnimePostRequestBody(){
        return AnimePostRequestBody.builder().name(AnimeCreator.createAnimeToBeSaved().getName()).build();
    }
}
