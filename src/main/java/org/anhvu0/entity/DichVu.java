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
import javax.persistence.Table;

@Entity
@Table(name = "dich_vu")
public class DichVu {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MaDV", nullable = false)
	private int maDV;

	@ManyToOne
	@JoinColumn(name = "MaLoaiDV")
	private LoaiDichVu loai_dich_vu;

	@OneToMany(mappedBy = "dich_vu", cascade = CascadeType.ALL)
	private List<ChiTietDichVu> chiTietDichVu;
	
	@Column(name = "TenDV", nullable = false)
	private String tenDV;

	@Column(name = "DonViTinh", nullable = false)
	private String donViTinh;

	@Column(name = "DonGia", nullable = false)
	private int donGia;

	public DichVu() {
		super();
	}

	public int getMaDV() {
		return maDV;
	}

	public void setMaDV(int maDV) {
		this.maDV = maDV;
	}

	public LoaiDichVu getLoai_dich_vu() {
		return loai_dich_vu;
	}

	public void setLoai_dich_vu(LoaiDichVu loai_dich_vu) {
		this.loai_dich_vu = loai_dich_vu;
	}

	public String getTenDV() {
		return tenDV;
	}

	public void setTenDV(String tenDV) {
		this.tenDV = tenDV;
	}

	public String getDonViTinh() {
		return donViTinh;
	}

	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}

	public int getDonGia() {
		return donGia;
	}

	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}

}
