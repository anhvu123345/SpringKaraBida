package org.anhvu0.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class LoaiDichVu {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MaLoaiDV", nullable = false)
	private int maLoaiDV;

	@OneToMany(mappedBy = "loai_dich_vu", cascade = CascadeType.ALL)
	private List<DichVu> dich_vu;

	@Column(name = "TenLoaiDV", nullable = false)
	private String tenLoaiDV;

	public LoaiDichVu() {
		super();
	}

	public int getMaLoaiDV() {
		return maLoaiDV;
	}

	public void setMaLoaiDV(int maLoaiDV) {
		this.maLoaiDV = maLoaiDV;
	}

	public String getTenLoaiDV() {
		return tenLoaiDV;
	}

	public void setTenLoaiDV(String tenLoaiDV) {
		this.tenLoaiDV = tenLoaiDV;
	}

	public List<DichVu> getDich_vu() {
		return dich_vu;
	}

	public void setDich_vu(List<DichVu> dich_vu) {
		this.dich_vu = dich_vu;
	}

}
