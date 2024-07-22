package com.docker.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.app.model.onepluse;
import com.docker.app.service.springservice;


@RestController
@RequestMapping("/springk")
public class springcontroller {

	@Autowired
	public springservice mser;

	@PostMapping("/madd")
	public ResponseEntity<onepluse> add(@RequestBody onepluse mbs) {
		return mser.add(mbs);
	}

	@GetMapping("/getall")
	public ResponseEntity<List<onepluse>> finndall() {
		return mser.getall();
	}

	@GetMapping("/testapi")
	public String testdemo() {
		return "i am working";
	}
}
