package com.example.demo.java6.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "PhieuGiamGia")
public class PhieuGiamGia {
    @Id
    @Column(name = "MaPhieu")
    private String ma;
    @Column(name = "TenPhieu")
    private String ten;
    @Column(name = "TrangThai")
    private Integer trangThai;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "NguoiSoHuu", referencedColumnName = "MaKhachHang")
    private KhachHang kh;
}
