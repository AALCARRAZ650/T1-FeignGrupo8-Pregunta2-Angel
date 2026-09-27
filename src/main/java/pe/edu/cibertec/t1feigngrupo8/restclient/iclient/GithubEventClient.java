package pe.edu.cibertec.t1feigngrupo8.restclient.iclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.t1feigngrupo8.model.GithubEventDto;

import java.util.List;

@FeignClient(
        name = "githubEventClient",
        url = "https://api.github.com"
)
public interface GithubEventClient {

    @GetMapping("/events")
    List<GithubEventDto> getEvents();
}
