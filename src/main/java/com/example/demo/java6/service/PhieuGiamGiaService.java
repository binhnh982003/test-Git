package com.example.demo.java6.service;

import com.example.demo.java6.entity.PhieuGiamGia;
import org.springframework.data.domain.Page;

import java.util.List;

public interface PhieuGiamGiaService {
    List<PhieuGiamGia> getAll();
    void add(PhieuGiamGia phieu);
    void update(PhieuGiamGia phieu);
    void delete(PhieuGiamGia phieu);
    Page<PhieuGiamGia> finAll(int p);
}
