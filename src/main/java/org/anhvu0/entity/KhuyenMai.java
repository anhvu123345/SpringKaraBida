package org.anhvu0.entity;

import javax.persistence.Table;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Table(name = "khuyen_mai")
public class KhuyenMai {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MaKM", nullable = false)
	private String maKM;

	@OneToMany(mappedBy = "khuyen_mai", cascade = CascadeType.ALL)
	private List<DonThanhToan> donThanhToan;

	@Column(name = "TenKM", nullable = false)
	private String tenKM;

	@Column(name = "GiaTriKM", nullable = false)
	private int giaTriKM;

	@Column(name = "ThoiGianBD")
	private Date thoiGianBD;

	@Column(name = "ThoiGianKT")
	private Date thoiGianKT;

	public KhuyenMai() {
		super();
	}

	public String getMaKM() {
		return maKM;
	}

	public void setMaKM(String maKM) {
		this.maKM = maKM;
	}

	public String getTenKM() {
		return tenKM;
	}

	public void setTenKM(String tenKM) {
		this.tenKM = tenKM;
	}

	public int getGiaTriKM() {
		return giaTriKM;
	}

	public void setGiaTriKM(int giaTriKM) {
		this.giaTriKM = giaTriKM;
	}

	public Date getThoiGianBD() {
		return thoiGianBD;
	}

	public void setThoiGianBD(Date thoiGianBD) {
		this.thoiGianBD = thoiGianBD;
	}

	public Date getThoiGianKT() {
		return thoiGianKT;
	}

	public void setThoiGianKT(Date thoiGianKT) {
		this.thoiGianKT = thoiGianKT;
	}

	public List<DonThanhToan> getDonThanhToan() {
		return donThanhToan;
	}

	public void setDonThanhToan(List<DonThanhToan> donThanhToan) {
		this.donThanhToan = donThanhToan;
	}

}
