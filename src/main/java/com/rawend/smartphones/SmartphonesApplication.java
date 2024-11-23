package com.rawend.smartphones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.rawend.smartphones.entities.Smartphone;
import com.rawend.smartphones.entities.Type;

@SpringBootApplication 
public class SmartphonesApplication implements CommandLineRunner { 
@Autowired 
private RepositoryRestConfiguration repositoryRestConfiguration; 
public static void main(String[] args) { 
SpringApplication.run(SmartphonesApplication.class, args); 
} 

@Override
public void run(String... args) throws Exception {
repositoryRestConfiguration.exposeIdsFor(Smartphone.class,Type.class);
}
}