package com.mhc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.mhc.bean.Medicine;
import com.mhc.service.MedicineService;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/medicines")
public class MedicineController {

	@Autowired
	private MedicineService service;

	@GetMapping
	public ResponseEntity<List<Medicine>> getAllMedicines() {
		List<Medicine> medicines = service.getAllMedicines();
		return ResponseEntity.ok(medicines);
	}

}