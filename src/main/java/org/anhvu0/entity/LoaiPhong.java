package org.anhvu0.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "loai_phong")
public class LoaiPhong {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MaLoaiPhong", nullable = false)
	private int maLoaiPhong;
	
	@OneToMany(mappedBy = "loai_phong", cascade = CascadeType.ALL)
	private List<Phong> phong;
	
	@Column(name = "MoTa", nullable = false)
	private String moTa;
	
	@Column(name = "SucChuc")
	private int sucChua;
	
	@Column(name = "TenLoai", nullable = false)
	private String tenLoai;

	public LoaiPhong() {
		super();
	}

	public int getMaLoaiPhong() {
		return maLoaiPhong;
	}

	public void setMaLoaiPhong(int maLoaiPhong) {
		this.maLoaiPhong = maLoaiPhong;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public int getSucChua() {
		return sucChua;
	}

	public void setSucChua(int sucChua) {
		this.sucChua = sucChua;
	}

	public String getTenLoai() {
		return tenLoai;
	}

	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}

}
