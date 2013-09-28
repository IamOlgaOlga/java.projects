package lab2;

import java.text.BreakIterator;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Document {

	private String author;
	private String title;
	private int year;
	private String entry;
	private int chars;
	private int words;
	private boolean tooOld=false;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		Date date=new Date(year-1900,00,01);
		Calendar calendar = Calendar.getInstance();
		int currentYear = calendar.get(Calendar.YEAR);		
		calendar.setTime(date);
		this.tooOld=(currentYear>calendar.get(Calendar.YEAR));		
		this.year = calendar.get(Calendar.YEAR);
		
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		
		
	}

	public Boolean getTooOld() {
		return tooOld;
	}

	public String getEntry() {
		return entry;
	}

	public void setEntry(String entry) {
		this.entry = entry;
	}

	public int getWords() {
		int counter =0;
		BreakIterator wordIterator = BreakIterator.getWordInstance();
		wordIterator.setText(this.entry);
		int start = wordIterator.first();
		int end = wordIterator.next();
		while (end != BreakIterator.DONE) {
			String word = this.entry.substring(start, end);
			if (Character.isLetterOrDigit(word.charAt(0))) {
				counter++;			
			}
			start = end;
			end = wordIterator.next();
		}
		this.words = counter;
		return words;
	}

	public int getChars() {
		String setWords = this.entry.replaceAll("[^a-zA-zА-Яа-яёЁ]", "");
		this.chars = setWords.length();
		return chars;
	}

}
