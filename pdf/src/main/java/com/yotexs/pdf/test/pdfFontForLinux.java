package com.yotexs.pdf.test;

import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.tool.xml.XMLWorkerFontProvider;

public class pdfFontForLinux extends XMLWorkerFontProvider {
	public pdfFontForLinux() {
		super(null, null);
	}

	@Override
	public Font getFont(final String fontname, String encoding, float size, final int style) {

		Font FontChinese = null;
		try {
			BaseFont bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
			FontChinese = new Font(bfChinese, 12, Font.NORMAL);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (FontChinese == null)
			FontChinese = super.getFont(fontname, encoding, size, style);
		return FontChinese;

	}
}
