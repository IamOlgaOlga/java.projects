package gr9372.shulga.lab03.holder;

import java.util.Iterator;
/**
 *  Selector ��������� ��������� Iterator. ���������� ���������� ������ ������
 *  ��������� �� ����������� ��������� �������������� �������� ��������. 
 */
public interface Selector extends Iterator<Integer>{	
	/** 
	    *  ������������� iterator, �� �������� ������� ��������. 
	    */
	   void setIterator(Iterator<Integer> iterator);

}
