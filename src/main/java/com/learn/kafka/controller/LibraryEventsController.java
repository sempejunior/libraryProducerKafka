package com.learn.kafka.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.kafka.domain.LibraryEvent;

@RestController
public class LibraryEventsController {

	
	@PostMapping("/v1/libraryevent")
	public ResponseEntity<LibraryEvent> postLibraryEvent(@RequestBody LibraryEvent libraryEvent){
		System.out.println("Teste");
		//invoke kafka producer
		
		return ResponseEntity.status(HttpStatus.CREATED).body(libraryEvent);
	}
}