package lab3.test;

import gr9372.shulga.lab03.holder.Selector;
import holderImpl.SelectorEven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class TestEvenSelector {
	@Test
	public void testOneCharEven(){
		List<Integer> data = Arrays.asList(1, 2);
		Selector selectorEven = new SelectorEven();
		List<Integer> dataEven = Arrays.asList(2);
		List<Integer> result = new ArrayList<Integer>();
		selectorEven.setIterator(data.iterator());
		while (selectorEven.hasNext()) {
			int element = selectorEven.next();
			result.add(element);
		}
		Assert.assertTrue(result.containsAll(dataEven));
	}
	
	@Test
	public void testSelectorEvenHasNext() {
		List<Integer> data = Arrays.asList(1, 2, 3, 4);
		Selector selectorEven = new SelectorEven();
		selectorEven.setIterator(data.iterator());
		Assert.assertTrue(selectorEven.hasNext());
	}
	
	@Test
	public void testSelectorEven() {
		List<Integer> data = Arrays.asList(1, 2, 3, 4);
		Selector selectorEven = new SelectorEven();
		List<Integer> dataEven = Arrays.asList(2, 4);
		List<Integer> result = new ArrayList<Integer>();
		selectorEven.setIterator(data.iterator());
		while (selectorEven.hasNext()) {
			int element = selectorEven.next();
			result.add(element);
		}
		Assert.assertTrue(result.containsAll(dataEven));
	}
}
