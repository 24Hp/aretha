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
//ini untuk data keluarga
public class PeternakB {
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
//	private long parent_id;
	
//	private PeternakA keluarga;

	public PeternakB() {
		
	}
	public PeternakB(long id) {
		super();
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
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getUsercode() {
		return usercode;
	}
	
	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	
//	public long getParent_id() {
//		return parent_id;
//	}
//	public void setParent_id(long parent_id) {
//		this.parent_id = parent_id;
//	}
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "user_id")
//	public PeternakA getKeluarga() {
//		return keluarga;
//	}
//	public void setKeluarga(PeternakA keluarga) {
//		this.keluarga = keluarga;
//	}
	
	
	
}
