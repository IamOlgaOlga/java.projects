package builders;

import java.io.IOException;

import lab2.Document;

public class BuilderXML extends Builder {

	
	@Override
	void buildHeader(boolean tooOld) throws IOException {	
		out.println("<book>");
		if (tooOld){
		out.println("<head>"+document.getTitle()+","+document.getAuthor()+","+document.getYear()+"(old)"+"</head>");}
		else{out.println("<head>"+document.getTitle()+","+document.getAuthor()+","+document.getYear()+"</head>");}
	}

	@Override
	void buildBody(boolean tooSmart) throws IOException {
		if (tooSmart){
		out.println("<body>"+document.getEntry()+"(smart)"+"</body>");}
		else{
			out.println("<body>"+document.getEntry()+"</body>");
		}
	}

	@Override
	void buildFooter() throws IOException {
		out.println("<footer>"+"marks:"+document.getChars()+" ; words:"+document.getWords()+"</footer>");
		out.println("</book>");
	}
	

	
}
