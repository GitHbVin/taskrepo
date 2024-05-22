package com.company.project.assignment;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JasperItem {

	private String date;
	private String referenceNo;
	private BigDecimal amount;
	private String status;
	private String remark;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public JasperItem() {
		// TODO Auto-generated constructor stub
	}

	public JasperItem(String date, String referenceNo, BigDecimal amount, String status, String remark) {
		super();
		this.date = date;
		this.referenceNo = referenceNo;
		this.amount = amount;
		this.status = status;
		this.remark = remark;
	}

	public static List<JasperItem> getList() {
		JasperItem s = new JasperItem("2024-05-11", "20392295240001", new BigDecimal("15.50"), "OK", "Item Added");
		List<JasperItem> items = new ArrayList<JasperItem>();
		items.add(s);
		return items;
	}

}
