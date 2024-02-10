package com.mhc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mhc.Repository.MedicineRepo;
import com.mhc.bean.Medicine;

@Service
public class CartService {

	@Autowired
	private MedicineRepo repo;
	
	public void addToCart(Medicine medicine) {
		repo.save(medicine);
	}

	public List<Medicine> getAllMedicines() {
		return repo.findAll();
	}

//	public Optional<Address> getAddressById(Long userId) {
//		return repo.findById(userId);
//	}
//
//	public Address createAddress(Address address) {
//		return repo.save(address);
//	}
//
//	public Address updateAddress(Address address) {
//		return repo.save(address);
//	}
//
//	public void deleteAddress(Long userId) {
//		repo.deleteById(userId);
//	}

}