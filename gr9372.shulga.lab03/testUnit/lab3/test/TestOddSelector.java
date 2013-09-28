package lab3.test;

import gr9372.shulga.lab03.holder.Selector;
import holderImpl.SelectorOdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

public class TestOddSelector {
	
	@Test
	public void testOneCharOdd(){
		List<Integer> data = Arrays.asList(1, 2);
		Selector selectorOdd = new SelectorOdd();
		List<Integer> dataOdd = Arrays.asList(1);
		List<Integer> result = new ArrayList<Integer>();
		selectorOdd.setIterator(data.iterator());
		while (selectorOdd.hasNext()) {
			int element = selectorOdd.next();
			result.add(element);
		}
		Assert.assertTrue(result.containsAll(dataOdd));
	}
	

	@Test
	public void testSelectorOddHasNext() {
		List<Integer> data = Arrays.asList(1, 2, 3, 4);
		Selector selectorOdd = new SelectorOdd();
		selectorOdd.setIterator(data.iterator());
		Assert.assertTrue(selectorOdd.hasNext());
	}

	

	@Test
	public void testSelectorOdd() {
		List<Integer> data = Arrays.asList(1, 2, 3, 4);
		Selector selectorOdd = new SelectorOdd();
		List<Integer> dataOdd = Arrays.asList(1, 3);
		List<Integer> result = new ArrayList<Integer>();
		selectorOdd.setIterator(data.iterator());
		while (selectorOdd.hasNext()) {
			int element = selectorOdd.next();
			result.add(element);
		}
		Assert.assertTrue(result.containsAll(dataOdd));
	}
}
