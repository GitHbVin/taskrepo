package com.company.project.assignment;

import java.io.File;

import org.beanio.BeanWriter;
import org.beanio.StreamFactory;
import org.beanio.builder.DelimitedParserBuilder;
import org.beanio.builder.StreamBuilder;

// Run this class to generate the file items.txt
public class BeanIOMain {
	public static void main(String[] args) {

		BeanWriter writer = null;
		try {
			StreamFactory factory = StreamFactory.newInstance();
			StreamBuilder builder = new StreamBuilder("items").format("delimited")
					.parser(new DelimitedParserBuilder(' ')).addRecord(Item.class).addRecord(ItemHeader.class)
					.addRecord(ItemTailer.class);
			factory.define(builder);
			writer = factory.createWriter("items", new File("items.txt"));

			// Code to populate the file content
			FileGenerator fileGenerator = new FileGenerator();
			fileGenerator.createHeader(Itemizable.FILETYPE, writer);
			fileGenerator.createBody(writer);
			fileGenerator.createTailer(Itemizable.FILETYPE, writer);

			// Logs are preferred
			System.out.println("items.txt file generated");

		} catch (Exception e) {
			// can trigger mails or store in the db
			e.printStackTrace();
		} finally {
			if (writer != null) {
				writer.flush();
				writer.close();
			}
		}

	}
}
