package es.davidabellannavarro.springbooth2;

/**
 * @author David Abellán Navarro
 * @project SpringBootH2
 * @course 2ºD.A.M.
 * @date 18/01/2022
 */

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootH2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootH2Application.class, args);
    }

    @Bean
    public CommandLineRunner run(PersonajeRepository repository) {
        return (args -> {
            //deleteJavaAdvocates(repository);
            //insertJavaAdvocates(repository);
            System.out.println(repository.findAll());
        });
    }

    private void insertJavaAdvocates(PersonajeRepository repository) {
        repository.save(new Personaje("David", "programador", 100, 100, 40, 60, 7));
        repository.save(new Personaje("Javier", "profesor", 100, 100, 85, 100, 100));
        repository.save(new Personaje("JuanCarlos", "programador", 100, 100, 70, 50, 8));
    }

    private void deleteJavaAdvocates(PersonajeRepository repository) {
        repository.deleteAll();
    }
}
