package builders;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Date;

import lab2.Document;

public abstract class Builder {

	Document document = new Document();
	PrintWriter out = null;
	

	abstract void buildHeader(boolean tooOld) throws IOException;

	abstract void buildBody(boolean tooSmart) throws IOException;

	abstract void buildFooter() throws IOException;

	public void build(Document document, PrintWriter out) throws IOException {
		this.document = document;
		this.out=out;	
		buildHeader(document.getTooOld());
		buildBody((document.getChars() / document.getWords()) > 7);
		buildFooter();

	}

}
