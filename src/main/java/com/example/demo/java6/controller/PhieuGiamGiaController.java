package com.example.demo.java6.controller;

import com.example.demo.java6.entity.KhachHang;
import com.example.demo.java6.entity.PhieuGiamGia;
import com.example.demo.java6.service.PhieuGiamGiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/phieu-giam-gia")
public class PhieuGiamGiaController {
    @Autowired
    private PhieuGiamGiaService phieuGiamGiaService;

    @GetMapping()
    private List<PhieuGiamGia> find() {
        return phieuGiamGiaService.getAll();
    }

    @PostMapping("/add")
    private PhieuGiamGia add(@RequestBody PhieuGiamGia phieu) {
        phieuGiamGiaService.add(phieu);
        return phieu;
    }
}
