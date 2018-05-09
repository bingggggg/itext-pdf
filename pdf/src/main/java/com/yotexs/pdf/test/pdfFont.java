package com.yotexs.pdf.test;

import com.itextpdf.text.Font;
import com.itextpdf.tool.xml.XMLWorkerFontProvider;

public class pdfFont extends XMLWorkerFontProvider {
	public pdfFont() {
        super(null,null);
    }

	@Override
	public Font getFont(final String fontname, String encoding, float size, final int style) {

		String fntname = fontname;
		if (fntname == null) {
			fntname = "宋体";
		}
		return super.getFont(fntname, encoding, size, style);
	}
}
