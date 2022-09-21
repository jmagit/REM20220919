package com.example;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.example.domains.contracts.repositories.ActorRepository;
import com.example.domains.entities.Actor;
import com.example.domains.entities.dtos.ActorDto;
import com.example.domains.entities.dtos.ActorName;

import lombok.Data;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	ActorRepository dao;
	
	@Override
//	@Transactional
	public void run(String... args) throws Exception {
//		System.out.println("Hola mundo");
//		dao.save(new Actor(0, "Pepito", "Grillo"));
//		var item = dao.findById(202);
//		if(item.isPresent()) {
//			var actor = item.get();
//			actor.setLastName(actor.getLastName().toUpperCase());
//			dao.save(actor);
//		}
//		dao.deleteById(202);
//		dao.findAll().forEach(System.out::println);
//		dao.findTop5ByFirstNameStartingWithOrderByLastNameDesc("P").forEach(System.out::println);
//		dao.findTop5ByFirstNameStartingWith("P", Sort.by("actorId").descending()).forEach(System.out::println);
//		dao.nuevos(200).forEach(System.out::println);
//		dao.nuevosSQL(190).forEach(System.out::println);
//		dao.findAll((root, query, builder) -> builder.lessThan(root.get("actorId"), 10)).forEach(System.out::println);
//		dao.findAll(Sort.by("lastName")).forEach(System.out::println);
//		dao.findAll(PageRequest.of(1, 10, Sort.by("actorId"))).getContent().forEach(System.out::println);
//		var item = dao.findById(1);
//		if(item.isPresent()) {
//			var actor = item.get();
////			System.out.println(actor.getClass().getName());
//			actor.getFilmActors().forEach(fa -> System.out.println(fa.getFilm().getTitle()));
//		}
		
//		var actor = new Actor(0, "algo", "12345678z");
//		if(actor.isInvalid()) {
//			System.out.println(actor.getErrorsMessage());
//		} else {
//			System.out.println("Es valido");
//		}
//		dao.save(actor);
//		dao.findAll().forEach(item -> System.out.println(ActorDto.from(item)));
//		System.out.println(ActorDto.from(new ActorDto(1, "kk", "AA")));
//		dao.nuevos(200).forEach(item -> System.out.println(item.getNombre()));
//		dao.nuevos(200).forEach(System.out::println);
		
//		dao.findByActorIdIsNotNull(ActorDto.class).forEach(System.out::println);
		dao.findByActorIdIsNotNull(ActorName.class).forEach(item -> System.out.println(item.getNombre()));
	}

}
