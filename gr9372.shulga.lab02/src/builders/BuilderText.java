package builders;

import java.io.IOException;

import lab2.Document;

public class BuilderText extends Builder{

	@Override
	void buildHeader(boolean tooOld) throws IOException {
		if (tooOld){
			out.println("!"+document.getTitle()+","+document.getAuthor()+","+document.getYear()+"(OLD!)"+"!");}
			else{out.println("!"+document.getTitle()+","+document.getAuthor()+","+document.getYear()+"!");}
		
		
	}

	@Override
	void buildBody(boolean tooSmart) throws IOException {
		if (tooSmart){
		out.println("!"+document.getEntry()+"(SMART!)"+"!");}
	else{out.println("!"+document.getEntry()+"!");}
		
	}

	@Override
	void buildFooter() throws IOException {
		out.println("!"+"marks:"+document.getChars()+" ; words:"+document.getWords()+"!");
		
	}



}
