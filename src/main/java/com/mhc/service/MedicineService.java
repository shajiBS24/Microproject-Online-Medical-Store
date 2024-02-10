package com.mhc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhc.Repository.MedicineRepo;
import com.mhc.bean.Medicine;

import java.util.List;
import java.util.Optional;

@Service
public class MedicineService {
	
	@Autowired
    private MedicineRepo repo;

    public List<Medicine> getAllMedicines() {
        return repo.findAll();
    }

    public Optional<Medicine> getMedicineById(int medicineId) {
        return repo.findById(medicineId);
    }

    public Medicine createMedicine(Medicine medicine) {
        return repo.save(medicine);
    }

    public Medicine updateMedicine(Medicine medicine) {
        return repo.save(medicine);
    }

    public void deleteMedicine(int medicineId) {
    	repo.deleteById(medicineId);
    }

}
