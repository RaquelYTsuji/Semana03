package onboard.raquel.Semana03.util;

import onboard.raquel.Semana03.domain.Anime;

public class AnimeCreator {
    public static Anime createAnimeToBeSaved(){
        return Anime.builder().name("Hajime no Ippo").build();
    }

    public static Anime createValidAnime(){
        return Anime.builder().name("Hajime no Ippo").id(1L).build();
    }

    public static Anime createValidUpdatedAnime(){
        return Anime.builder().name("Hajime no Ippo 2").id(1L).build();
    }
}
