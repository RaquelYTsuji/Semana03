package onboard.raquel.Semana03.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
//o que tem no banco de dados
public class Anime {
    private Long id;
    private String name;
}
