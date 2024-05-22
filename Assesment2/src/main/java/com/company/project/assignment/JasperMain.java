package com.company.project.assignment;

import java.util.HashMap;
import java.util.List;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRSaver;
	
public class JasperMain {

	public static void main(String args[]) {
		try {
			JasperReport jasperReport = JasperCompileManager
					.compileReport(JasperMain.class.getResourceAsStream("/items.jrxml"));
			JRSaver.saveObject(jasperReport, "items.jasper");
			System.out.println("japser file created");

			List<JasperItem> dataList = JasperItem.getList();
			String printFileName = JasperFillManager.fillReportToFile("items.jasper", new HashMap(),
					new JRBeanCollectionDataSource(dataList));
			JasperExportManager.exportReportToPdfFile(printFileName, "items.pdf");
			System.out.println("pdf file created");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}