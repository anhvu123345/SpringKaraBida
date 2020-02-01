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
@Table(name = "nhan_vien")
public class NhanVien {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MaNV", nullable = false)
	private int maNV;

	@OneToMany(mappedBy = "nhan_vien", cascade = CascadeType.ALL)
	private List<TaiKhoan> tai_khoan;

	@OneToMany(mappedBy = "nhan_vien", cascade = CascadeType.ALL)
	private List<DonThanhToan> donThanhToan;

	@Column(name = "HoTen", nullable = false)
	private String hoTen;

	@Column(name = "GioiTinh", nullable = false)
	private String gioiTinh;

	@Column(name = "NgaySinh")
	private Date ngaySinh;

	@Column(name = "DiaChi")
	private String diaChi;

	@Column(name = "cmnd")
	private String cmnd;

	@Column(name = "SoDienThoai")
	private String soDienThoai;

	@Column(name = "Luong", nullable = false)
	private int luong;

	public NhanVien() {
		super();
	}

	public int getMaNV() {
		return maNV;
	}

	public void setMaNV(int maNV) {
		this.maNV = maNV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public int getLuong() {
		return luong;
	}

	public void setLuong(int luong) {
		this.luong = luong;
	}

	public List<TaiKhoan> getTai_khoan() {
		return tai_khoan;
	}

	public void setTai_khoan(List<TaiKhoan> tai_khoan) {
		this.tai_khoan = tai_khoan;
	}

	public List<DonThanhToan> getDonThanhToan() {
		return donThanhToan;
	}

	public void setDonThanhToan(List<DonThanhToan> donThanhToan) {
		this.donThanhToan = donThanhToan;
	}

}
