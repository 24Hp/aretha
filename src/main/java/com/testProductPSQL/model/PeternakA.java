package com.testProductPSQL.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ar_user")
//ini untuk peternak
public class PeternakA {
	private long id;
	private String name;
	private String usercode;
	private String email;
	private String phone_number;
	private String address;
	private String ttl;
	private String work;
	private String ktp_number;
	private String position;
	private PeternakB keluarga;
	
	public PeternakA() {}

	public PeternakA(long id) {
		// TODO Auto-generated constructor stub
		this.id = id;
	}
	
	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	public String getUsercode() {
		return usercode;
	}
	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}

	@OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "parent_id")
	public PeternakB getKeluarga() {
		return keluarga;
	}

	public void setKeluarga(PeternakB keluarga) {
		this.keluarga = keluarga;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getTtl() {
		return ttl;
	}

	public void setTtl(String ttl) {
		this.ttl = ttl;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getKtp_number() {
		return ktp_number;
	}

	public void setKtp_number(String ktp_number) {
		this.ktp_number = ktp_number;
	}
	
	
//	
//	@OneToOne(mappedBy = "peternak")
//	public PeternakB getKeluarga() {
//		return keluarga;
//	}
//
//	public void setKeluarga(PeternakB keluarga) {
//		this.keluarga = keluarga;
//	}
}
