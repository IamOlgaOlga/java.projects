package lab3.test;

import gr9372.shulga.lab03.holder.ArrayHolder;
import gr9372.shulga.lab03.holder.Selector;
import holderImpl.SelectorEven;
import holderImpl.SelectorOdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import junit.framework.Assert;
import org.junit.Test;

public class TestSelector {	
	
	@Test
	public void testSelectorNull(){
		List<Integer> data = Arrays.asList();
		Selector selectorOdd = new SelectorOdd();
		Selector selectorEven = new SelectorEven();
		selectorOdd.setIterator(data.iterator());
		selectorEven.setIterator(data.iterator());
		Assert.assertFalse(selectorOdd.hasNext());
		Assert.assertFalse(selectorEven.hasNext());
	}
}

