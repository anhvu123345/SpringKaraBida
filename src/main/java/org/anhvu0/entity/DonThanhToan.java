package org.anhvu0.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "don_thanh_toan")
public class DonThanhToan {

	@Id
	@Column(name = "MaDon", nullable = false)
	private String maDon;

	@ManyToOne
	@JoinColumn(name = "MaNV")
	private NhanVien nhan_vien;

	@ManyToOne
	@JoinColumn(name = "MaKH")
	private KhachHang khach_hang;

	@ManyToOne
	@JoinColumn(name = "MaPhong")
	private Phong phong;

	@ManyToOne
	@JoinColumn(name = "MaKM")
	private KhuyenMai khuyen_mai;

	@OneToMany(mappedBy = "don_thanh_toan", cascade = CascadeType.ALL)
	private List<ChiTietDichVu> chi_tiet_dich_vu;

	@Column(name = "TongTien", nullable = false)
	private int tongTien;

	@Column(name = "ThoiGianBD", nullable = false)
	private Date thoiGianBD;

	@Column(name = "ThoiGianKt")
	private Date thoiGianKT;

	@Column(name = "TinhTrang")
	private String tinhTrang;

	public DonThanhToan() {
		super();
	}

	public String getMaDon() {
		return maDon;
	}

	public void setMaDon(String maDon) {
		this.maDon = maDon;
	}

	public NhanVien getNhan_vien() {
		return nhan_vien;
	}

	public void setNhan_vien(NhanVien nhan_vien) {
		this.nhan_vien = nhan_vien;
	}

	public KhachHang getKhach_hang() {
		return khach_hang;
	}

	public void setKhach_hang(KhachHang khach_hang) {
		this.khach_hang = khach_hang;
	}

	public Phong getPhong() {
		return phong;
	}

	public void setPhong(Phong phong) {
		this.phong = phong;
	}

	public KhuyenMai getKhuyen_mai() {
		return khuyen_mai;
	}

	public void setKhuyen_mai(KhuyenMai khuyen_mai) {
		this.khuyen_mai = khuyen_mai;
	}

	public int getTongTien() {
		return tongTien;
	}

	public void setTongTien(int tongTien) {
		this.tongTien = tongTien;
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

	public String getTinhTrang() {
		return tinhTrang;
	}

	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}

	public List<ChiTietDichVu> getChi_tiet_dich_vu() {
		return chi_tiet_dich_vu;
	}

	public void setChi_tiet_dich_vu(List<ChiTietDichVu> chi_tiet_dich_vu) {
		this.chi_tiet_dich_vu = chi_tiet_dich_vu;
	}

	
}
