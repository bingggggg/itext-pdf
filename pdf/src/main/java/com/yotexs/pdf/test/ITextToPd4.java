package com.yotexs.pdf.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

/**
 * linux可用
 * 
 * @author asus
 *
 */
public class ITextToPd4 {
	public static void main(String[] args) throws DocumentException, IOException {
		String pdfFile = "d:/eee.pdf";
		String htmlFile = "c:/Users/asus/Desktop/fff.html";
		InputStream in = new FileInputStream(new File(htmlFile));
		Document document = new Document();
		PdfWriter pdfwriter = PdfWriter.getInstance(document, new FileOutputStream(pdfFile));
		pdfwriter.setViewerPreferences(PdfWriter.HideToolbar);
		document.open();
		XMLWorkerHelper.getInstance().parseXHtml(pdfwriter, document, in, Charset.forName("utf-8"),
				new pdfFontForLinux());
		document.close();

	}
}
