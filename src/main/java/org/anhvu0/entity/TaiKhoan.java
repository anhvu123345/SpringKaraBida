package org.anhvu0.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tai_khoan")
public class TaiKhoan {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@ManyToOne
	@JoinColumn(name = "MaNV")
	private NhanVien nhan_vien;

	@Column(name = "TenTK", nullable = false)
	private String tenTK;

	@Column(name = "MatKhau")
	private String matKhau;

	@Column(name = "Khoa")
	private boolean khoa;

	public TaiKhoan() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public NhanVien getNhan_vien() {
		return nhan_vien;
	}

	public void setNhan_vien(NhanVien nhan_vien) {
		this.nhan_vien = nhan_vien;
	}

	public String getTenTK() {
		return tenTK;
	}

	public void setTenTK(String tenTK) {
		this.tenTK = tenTK;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public boolean isKhoa() {
		return khoa;
	}

	public void setKhoa(boolean khoa) {
		this.khoa = khoa;
	}

}
