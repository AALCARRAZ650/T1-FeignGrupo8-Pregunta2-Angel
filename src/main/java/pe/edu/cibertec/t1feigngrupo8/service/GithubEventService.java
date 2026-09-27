package pe.edu.cibertec.t1feigngrupo8.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.t1feigngrupo8.model.GithubEventDto;
import pe.edu.cibertec.t1feigngrupo8.restclient.iclient.GithubEventClient;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class GithubEventService {

    private final GithubEventClient githubEventClient;

    public List<GithubEventDto> getFilteredEvents() {
        return githubEventClient.getEvents().stream()
                .filter(event -> "PushEvent".equals(event.getType()))
                .filter(event -> event.getActor() != null && event.getActor().getId() % 2 != 0)
                .collect(Collectors.toList());
    }
}
