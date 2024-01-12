package com.example.demo.java6.repository;

import com.example.demo.java6.entity.PhieuGiamGia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhieuGiamGiaRepo extends JpaRepository<PhieuGiamGia,String> {
}
