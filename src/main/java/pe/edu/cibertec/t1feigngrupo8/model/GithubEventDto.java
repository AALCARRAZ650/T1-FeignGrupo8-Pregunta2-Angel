package pe.edu.cibertec.t1feigngrupo8.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GithubEventDto {
    private String type;
    private ActorDto actor;
}
