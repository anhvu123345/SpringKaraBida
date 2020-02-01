package org.anhvu0.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Phong {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MaPhong", nullable = false)
	private int maPhong;

	@ManyToOne
	@JoinColumn(name = "MaLoaiPhong")
	private LoaiPhong loai_phong;

	@OneToMany(mappedBy = "phong", cascade = CascadeType.ALL)
	private List<DonThanhToan> donThanhToan;
	
	@Column(name = "TenPhong", nullable = false)
	private String tenPhong;

	@Column(name = "TinhTrang")
	private String tinhTrang;

	public Phong() {
		super();
	}

	public int getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(int maPhong) {
		this.maPhong = maPhong;
	}

	public LoaiPhong getLoai_phong() {
		return loai_phong;
	}

	public void setLoai_phong(LoaiPhong loai_phong) {
		this.loai_phong = loai_phong;
	}

	public String getTenPhong() {
		return tenPhong;
	}

	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public List<DonThanhToan> getDonThanhToan() {
		return donThanhToan;
	}

	public void setDonThanhToan(List<DonThanhToan> donThanhToan) {
		this.donThanhToan = donThanhToan;
	}

}
