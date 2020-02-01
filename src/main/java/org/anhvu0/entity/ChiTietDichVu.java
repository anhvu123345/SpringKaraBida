package org.anhvu0.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name= "chi_tiet_dich_vu")
public class ChiTietDichVu {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int stt;

	@ManyToOne
	@JoinColumn(name = "MaDon")
	private DonThanhToan don_thanh_toan;

	@ManyToOne
	@JoinColumn(name = "maDV")
	private DichVu dich_vu;

	private int donGia;

	private int soLuong;

	public ChiTietDichVu() {
		super();
	}

	public int getStt() {
		return stt;
	}

	public void setStt(int stt) {
		this.stt = stt;
	}


	public DichVu getDich_vu() {
		return dich_vu;
	}

	public void setDich_vu(DichVu dich_vu) {
		this.dich_vu = dich_vu;
	}

	public int getDonGia() {
		return donGia;
	}

	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public DonThanhToan getDon_thanh_toan() {
		return don_thanh_toan;
	}

	public void setDon_thanh_toan(DonThanhToan don_thanh_toan) {
		this.don_thanh_toan = don_thanh_toan;
	}

}
