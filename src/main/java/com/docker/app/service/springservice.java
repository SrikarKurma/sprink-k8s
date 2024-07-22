
package com.docker.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.docker.app.model.onepluse;
import com.docker.app.repo.springrepo;


@Service
public class springservice {

	@Autowired
	public springrepo mobrepo;

	public ResponseEntity<onepluse> add(onepluse mob) {
		onepluse save = mobrepo.save(mob);
		return ResponseEntity.ok(save);
	}

	public ResponseEntity<List<onepluse>> getall() {
		List<onepluse> all = mobrepo.findAll();
		return ResponseEntity.ok(all);
	}

}
