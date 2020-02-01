package org.anhvu0.entity;

import java.util.Date;
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
@Table(name = "khach_hang")
public class KhachHang {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MaKH", nullable = false)
	private int maKH;
	
	@OneToMany(mappedBy = "khach_hang", cascade = CascadeType.ALL)
	private List<DonThanhToan> donThanhToan;
	
	@Column(name = "HoTen")
	private String hoTen;
	
	@Column(name = "GioiTinh")
	private String gioiTinh;
	
	@Column(name = "NgaySinh")
	private Date ngaySinh;
	
	@Column(name = "DiaChi")
	private String diaChi;
	
	@Column(name = "cmnd")
	private String cmnd;
	
	@Column(name = "SoDienThoai")
	private String soDienThoai;

	public KhachHang() {
		super();
	}

	public int getMaKH() {
		return maKH;
	}

	public String getHoTen() {
		return hoTen;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public String getCmnd() {
		return cmnd;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}
	
	

}
