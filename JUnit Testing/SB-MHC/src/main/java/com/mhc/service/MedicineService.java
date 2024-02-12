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

    public Optional<Medicine> getMedicineById(int Id) {
        return repo.findById(Id);
    }

    public boolean createMedicine(Medicine medicine) {
        repo.save(medicine);
        return true;
    }

    public boolean updateMedicine(Medicine medicine) {
        repo.save(medicine);
        return true;
    }

    public boolean deleteMedicine(int Id) {
    	repo.deleteById(Id);
    	return true;
    }

}
