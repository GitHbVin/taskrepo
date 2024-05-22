package com.company.project.assignment;

import org.beanio.annotation.Field;
import org.beanio.annotation.Fields;
import org.beanio.annotation.Record;

@Record(minOccurs = 0, maxOccurs = -1)
@Fields({ @Field(at = 0, name = "recordType", rid = true, literal = "H") })
public class ItemHeader implements Itemizable {

	@Field(at = 12, maxLength = 15)
	private String fileType;

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

}