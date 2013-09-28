package lab2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import builders.Builder;
import builders.BuilderXML;
import builders.BuilderHTML;
import builders.BuilderText;

public class Run {

	public static void main(String[] args) throws IOException {
		Document document = new Document();
		//InputStreamReader reader = null;
		PrintWriter outPlace= null;
		Scanner scanner = new Scanner(System.in);
		
		Builder builder=null;
		try {
			System.out.println("Put in name of file with document.");
			String nameFileIn = scanner.next();
			Scanner reader=new Scanner(new FileReader(nameFileIn));
			//reader = new InputStreamReader(new FileReader(nameFileIn));			
			String place = null;
			document.setAuthor(reader.nextLine());
			System.out.println(document.getAuthor());
			document.setTitle(reader.nextLine());
			System.out.println(document.getTitle());
			document.setYear(reader.nextInt());
			System.out.println(document.getYear());
			String s=reader.nextLine();
			document.setEntry(reader.nextLine());
			System.out.println(document.getEntry());
			System.out.println("Select data format:");
			System.out.println("1-text;");
			System.out.println("2-HTML;");
			System.out.println("3-XML");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				builder = new BuilderText();
				break;
			case 2:
				builder = new BuilderHTML();				
				break;
			case 3:
				builder = new BuilderXML();
				break;
			}
			System.out
			.println("Where do you want to put out the result?(console/file)");
			place = scanner.next();
			if(place.equals("console")){
				outPlace=new PrintWriter(System.out);
			}else{
				outPlace=new PrintWriter(new FileWriter(
				"formatDocument.xml"));
			}
	
			builder.build(document, outPlace);
		} finally {
			/*if (reader != null) {
				reader.close();
			}**/
			if (outPlace != null) {
				outPlace.close();
			}
			
		}

	}
}
