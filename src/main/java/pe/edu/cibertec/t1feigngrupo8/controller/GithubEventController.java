package pe.edu.cibertec.t1feigngrupo8.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.t1feigngrupo8.model.GithubEventDto;
import pe.edu.cibertec.t1feigngrupo8.service.GithubEventService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/github-events")
public class GithubEventController {

    private final GithubEventService githubEventService;

    @GetMapping
    public ResponseEntity<List<GithubEventDto>> getFilteredEvents() {
        return ResponseEntity.ok(githubEventService.getFilteredEvents());
    }
}
