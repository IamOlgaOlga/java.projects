package holderImpl;

import java.util.Iterator;

import gr9372.shulga.lab03.holder.Selector;

/**
 * ����������� ����� � ����������� ������ setIterator.
 * ��������� ������� ����������� �� ����.
 */
 abstract class Decorator implements Selector{
	 protected Iterator<Integer> iterator;
	 
	 public  void setIterator(Iterator<Integer> iterator){
		 this.iterator=iterator;
		 
	 };
}
