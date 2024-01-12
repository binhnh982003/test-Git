package com.example.demo.java6.service.impl;

import com.example.demo.java6.entity.PhieuGiamGia;
import com.example.demo.java6.service.PhieuGiamGiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhieuGiamGiaServiceImpl implements PhieuGiamGiaService {
    @Autowired
    private com.example.demo.java6.repository.PhieuGiamGiaRepo phieuGiamGiarepo;

    @Override
    public List<PhieuGiamGia> getAll() {
        return phieuGiamGiarepo.findAll();
    }

    @Override
    public void add(PhieuGiamGia phieu) {
        phieuGiamGiarepo.save(phieu);
    }

    @Override
    public void update(PhieuGiamGia phieu) {
        phieuGiamGiarepo.save(phieu);

    }

    @Override
    public void delete(PhieuGiamGia phieu) {
        phieuGiamGiarepo.delete(phieu);
    }

    @Override
    public Page<PhieuGiamGia> finAll(int p) {
        Pageable pageable = PageRequest.of(p,5);
        Page<PhieuGiamGia> page = phieuGiamGiarepo.findAll(pageable);
        return page;
    }
}
