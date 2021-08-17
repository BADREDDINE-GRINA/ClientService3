package com.transformation.clientservice3;

import com.transformation.clientservice3.dao.ClientRepository;
import com.transformation.clientservice3.entities.Client;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientService3Application {

    public static void main(String[] args) {
        SpringApplication.run(ClientService3Application.class, args);
    }

    @Bean
    CommandLineRunner start(ClientRepository clientRepository){
        return args -> {
            clientRepository.save(new Client(null,"11","first","client","first@gmail.com","065855","zefz","fezfz"));
            clientRepository.findAll().forEach(client -> {
                System.out.println(client.toString());
            });
        };
    }

}
