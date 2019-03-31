package com.empmang.servlet;
import java.io.Serializable;


public class employee {
	    
	    private String ename;
	    private int eid;
	    private int eage;
	    private String edes;
	    private String edept;
	    private Double  esalary;
	    public employee() {}
	    public employee(String ename,int eid,int eage, String edes, String edept,Double esalary) {
	    	super();
	    	this.ename=ename;
	    	this.eid=eid;
	    	this.eage=eage;
	    	this.edes=edes;
	    	this.edept=edept;
	    	this.esalary=esalary;
	    	}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public int getEid() {
			return eid;
		}
		public void setEid(int eid) {
			this.eid = eid;
		}
		public int getEage() {
			return eage;
		}
		public void setEage(int eage) {
			this.eage = eage;
		}
		public String getEdes() {
			return edes;
		}
		public void setEdes(String edes) {
			this.edes = edes;
		}
		public String getEdept() {
			return edept;
		}
		public void setEdept(String edept) {
			this.edept = edept;
		}
		public Double getEsalary() {
			return esalary;
		}
		public void setEsalary(Double esalary) {
			this.esalary = esalary;
		}
		
	    
	

		


	}


