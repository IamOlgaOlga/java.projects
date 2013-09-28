package builders;


import java.io.IOException;

import lab2.Document;

public class BuilderHTML extends Builder {

	@Override
	void buildHeader(boolean tooOld) throws IOException {
		if (tooOld){
			out.println("<font color=red>"+document.getTitle()+","+document.getAuthor()+","+document.getYear()+"(old)"+"</font>");}
			else{out.println("<font color=red>"+document.getTitle()+","+document.getAuthor()+","+document.getYear()+"</font>");}
		
	}

	@Override
	void buildBody(boolean tooSmart) throws IOException {
		if (tooSmart){
			out.println("<br><font color=yellow>"+document.getEntry()+"(SMART!)"+"</font></br>");}
		else{out.println("<br><font color=yellow>"+document.getEntry()+"</font></br>");}
			
		
	}

	@Override
	void buildFooter() throws IOException {
		out.println("<font color=green>"+"marks:"+document.getChars()+" ; words:"+document.getWords()+"</font>");
		
	}
	
	
}
