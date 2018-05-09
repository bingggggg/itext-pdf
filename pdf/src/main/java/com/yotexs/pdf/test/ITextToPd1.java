package com.yotexs.pdf.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

/**
 * windows可用，linux不可用 必须设置字体为SimSun
 * 
 * @author asus
 *
 */
public class ITextToPd1 {

	public static void main(String[] args) throws DocumentException, IOException {
		String pdfFile = "d:/eee.pdf";
		String htmlFile = "c:/Users/asus/Desktop/fff.html";
		InputStream in = new FileInputStream(new File(htmlFile));

		Document document = new Document();
		PdfWriter pdfwriter = PdfWriter.getInstance(document, new FileOutputStream(pdfFile));
		pdfwriter.setViewerPreferences(PdfWriter.HideToolbar);
		document.open();
		BaseFont baseFont = BaseFont.createFont("STSongStd-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
		Font f = new Font(baseFont);
		document.add(new Paragraph("", f));
		XMLWorkerHelper.getInstance().parseXHtml(pdfwriter, document, in, Charset.forName("UTF-8"));
		document.close();

	}
}
