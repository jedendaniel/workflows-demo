package ddd.demo.workflowsdemo.repository;

import ddd.demo.workflowsdemo.model.Home;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeRepository extends JpaRepository<Home, Long> {
}
