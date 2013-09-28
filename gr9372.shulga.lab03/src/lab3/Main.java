package lab3;

import gr9372.shulga.lab03.holder.ArrayHolder;
import holderImpl.ColumnFormatter;
import holderImpl.ProcessorDiff;
import holderImpl.ProcessorSquare;
import holderImpl.RowFormatter;
import holderImpl.SelectorEven;
import holderImpl.SelectorOdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> data = Arrays.asList();
		ArrayHolder arrayHolder = new ArrayHolder(data);

		/*data.set(0, 100);

		if (data.equals(arrayHolder.getData())) {
			System.out.println("ArrayHolder ���������� �� ���������");
		}**/
		System.out.println("����� ������� ������ ������������?");
		System.out.println("1-������");
		System.out.println("2-��������");
		if (scanner.nextInt() == 1) {
			arrayHolder.setSelector(new SelectorEven());
		} else {
			arrayHolder.setSelector(new SelectorOdd());
		}
		System.out.println("�������� �������� ��� �������");
		System.out.println("1-��������� �������");
		System.out.println("2-���������� � �������");
		if (scanner.nextInt() == 1) {
			arrayHolder.setProcessor(new ProcessorDiff());
		} else {
			arrayHolder.setProcessor(new ProcessorSquare());
		}
		System.out.println("��� ������� ������������ ������?");
		System.out.println("1-� �������");
		System.out.println("2-� �������");
		if (scanner.nextInt() == 1) {
			arrayHolder.setFormatter(new RowFormatter());
		} else {
			arrayHolder.setFormatter(new ColumnFormatter());
		}
		

		arrayHolder.process();

	}

}
