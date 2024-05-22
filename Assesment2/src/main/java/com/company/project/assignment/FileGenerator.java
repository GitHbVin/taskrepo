package com.company.project.assignment;

import java.util.ArrayList;
import java.util.List;

import org.beanio.BeanWriter;

// This class has methods for generating the header,body and the footer , then writes them to the file
public class FileGenerator {

	// create the file header and writes to the beanwriter
	public Itemizable createHeader(String fileType, BeanWriter writer) {
		ItemHeader header = new ItemHeader();
		header.setFileType(fileType);
		if (writer != null) {
			writer.write(header);
		}
		return header;
	}

	// create the file footer and writes to the beanwriter
	public Itemizable createTailer(String fileType, BeanWriter writer) {
		ItemTailer tailer = new ItemTailer();
		tailer.setFileType(fileType);
		if (writer != null) {
			writer.write(tailer);
		}
		return tailer;
	}

	// create a single item , that will be part of the body
	public Item createItem(String refNo, String amount) {
		return new Item(refNo, amount);
	}

	// populate all items
	public List<Item> collectItems() {
		List<Item> items = new ArrayList<>();
		items.add(createItem("20392295240001", "RM2.00"));
		items.add(createItem("20392295240002", "RM10.00"));
		items.add(createItem("20392295240003", "RM5.00"));
		return items;
	}

	// create the file body and writes to the beanwriter
	public List<Item> createBody(BeanWriter out) {
		List<Item> items = collectItems();
		if (out != null && !items.isEmpty()) {
			for (Item item : items) {
				if (item != null) {
					out.write(item);
				}
			}
		}
		return items;
	}

}
