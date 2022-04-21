package com.msic.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
	
	@GetMapping(value="/api/contact/v1",produces = MediaType.APPLICATION_JSON_VALUE)
	public Contact getContact() {
		return new Contact("Tom",12435);
	}
	
	@GetMapping(value="/api/contact/v2",produces = MediaType.APPLICATION_JSON_VALUE)
	public Contactv2 getContact2() {
		return new Contactv2("Tom",12435);
	}
	
	@GetMapping(value="/api/contact",produces = MediaType.APPLICATION_JSON_VALUE,params="version=v1")
	public Contact getContactQueyV1() {
		return new Contact("Tom",12435);
	}
	
	@GetMapping(value="/api/contact",produces = MediaType.APPLICATION_JSON_VALUE,params="version=v2")
	public Contactv2 getContactQueryV2() {
		return new Contactv2("Tom",12435);
	}
	
	@GetMapping(value="/api/contact",produces = MediaType.APPLICATION_JSON_VALUE,headers="version=v1")
	public Contact getContactHeaderV1() {
		return new Contact("Tom",12435);
	}
	
	@GetMapping(value="/api/contact",produces = MediaType.APPLICATION_JSON_VALUE,headers="version=v2")
	public Contactv2 getContactHeaderV2() {
		return new Contactv2("Tom",12435);
	}
	
	@GetMapping(value="/api/contact",produces = "application/contact.v1+json")
	public Contact getContactContentNegoV1() {
		return new Contact("Tom",12435);
	}
	
	@GetMapping(value="/api/contact",produces = "application/contact.v2+json")
	public Contactv2 getContactContentNegoV2() {
		return new Contactv2("Tom",12435);
	}
	

}

class Contact {
	private String name;
	private int mobile;
	public Contact(String name, int mobile) {
		super();
		this.name = name;
		this.mobile = mobile;
	}
	public Contact() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", mobile=" + mobile + "]";
	}
}
	
class Contactv2 {
		private String name;
		private int mobileNo;
		public Contactv2(String name, int mobileNo) {
			super();
			this.name = name;
			this.mobileNo = mobileNo;
		}
		public Contactv2() {
			super();
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getMobileNo() {
			return mobileNo;
		}
		public void setMobile(int mobileNo) {
			this.mobileNo = mobileNo;
		}
		@Override
		public String toString() {
			return "Contact [name=" + name + ", mobileNo=" + mobileNo + "]";
		}
	
	
}
