package com.company.project.assignment;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

@Record(minOccurs = 0, maxOccurs = -1)
@Fields({ @Field(at = 0, name = "recordType", rid = true, literal = " ") })
public class Item implements Itemizable {

	@Field(at = 18, required = true, maxLength = 14)
	private String referenceNumber;

	@Field(at = 34, required = true, maxLength = 16)
	private String amount;

	public Item() {

	}

	public Item(String refNo, String amount) {
		referenceNumber = refNo;
		this.amount = amount;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Item [referenceNumber=" + referenceNumber + ", amount=" + amount + "]";
	}

}