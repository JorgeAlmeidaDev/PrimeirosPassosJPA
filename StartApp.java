package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
/// criando um componente que vai executar o container
@Component
public class StartApp implements CommandLineRunner {
    /// vamos injetar o nosso repositori
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {

        User user = new User();
        user.setName("Jorge");
        user.setUsername("jorginho");
        user.setPassword("12345");
        /// nosso repositorio realiza o save da aplicação
        repository.save(user);

        /// vamos deixar bem estruturado com for
        /// vamos criar um for para percorer e trazer todos os findAll()

        for(User u: repository.findAll()){
            System.out.println(u);
        }


    }
}
