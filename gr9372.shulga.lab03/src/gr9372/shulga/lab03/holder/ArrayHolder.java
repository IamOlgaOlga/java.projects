package gr9372.shulga.lab03.holder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import gr9372.shulga.lab03.holder.Processor;
import holderImpl.ColumnFormatter;
import holderImpl.ProcessorDiff;
import holderImpl.ProcessorSquare;
import holderImpl.RowFormatter;
import holderImpl.SelectorEven;
import holderImpl.SelectorOdd;

public class ArrayHolder {

	final private List<Integer> data = new ArrayList<Integer>();
	private List<Integer> result = new ArrayList<Integer>();

	private Selector selector;

	private Processor processor;

	private Formatter formatter;

	public ArrayHolder(List<Integer> data) {

		this.data.addAll(data);
	}

	public List<Integer> getData() {
		return Collections.unmodifiableList(this.data);
	}

	public void setSelector(Selector selector) {
		this.selector = selector;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	public void setFormatter(Formatter formatter) {
		this.formatter = formatter;
	}

	public void process() {
		
		selector.setIterator(data.iterator());
		while (selector.hasNext()) {
			int elem = selector.next();
			result.add(processor.process(elem));
		}

		formatter.out(result);
	}

}
