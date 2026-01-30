package ddd.demo.workflowsdemo.controller;

import ddd.demo.workflowsdemo.model.Home;
import ddd.demo.workflowsdemo.repository.HomeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("home")
@RestController
public class HomeController {

    private final HomeRepository homeRepository;

    public HomeController(HomeRepository homeRepository) {
        this.homeRepository = homeRepository;
    }

    @GetMapping
    public List<Home> getAll() {
        return homeRepository.findAll();
    }
}
