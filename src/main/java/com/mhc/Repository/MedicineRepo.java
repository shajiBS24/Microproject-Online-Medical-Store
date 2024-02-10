package com.mhc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mhc.bean.Medicine;

@Repository
public interface MedicineRepo extends JpaRepository<Medicine, Integer> {

}
