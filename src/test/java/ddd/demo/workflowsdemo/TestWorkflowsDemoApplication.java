package ddd.demo.workflowsdemo;

import org.springframework.boot.SpringApplication;

public class TestWorkflowsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.from(WorkflowsDemoApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
