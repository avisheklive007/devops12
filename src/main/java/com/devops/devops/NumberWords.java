package com.devops.devops;

public class NumberWords {
	public String numwordbase(int num) {
		String wordbase = "";
		switch (num) {
		case 1:
			wordbase = "one";
			break;
		case 2:
			wordbase = "two";
			break;
		case 3:
			wordbase = "three";
			break;
		case 4:
			wordbase = "four";
			break;
		case 5:
			wordbase = "five";
			break;
		case 6:
			wordbase = "six";
			break;
		case 7:
			wordbase = "seven";
			break;
		case 8:
			wordbase = "eight";
			break;
		case 9:
			wordbase = "nine";
			break;

		}

		return wordbase;
	}

	public String numwordbase2(int num) {
		String res = "";

		String splitted1 = (String.valueOf(num)).substring(0, 1);
		// System.out.println("tu"+splitted1);
		int splitted_1 = Integer.parseInt(splitted1);
		switch (splitted_1) {

		case 1:
			switch (num) {
			case 10:
				res = "Ten";
				break;
			case 11:
				res = "eleven";
				break;
			case 12:
				res = "twelve";
				break;
			case 13:
				res = "thirteen";
				break;
			case 14:
				res = "fourteen";
				break;
			case 15:
				res = "fifteen";
				break;
			case 16:
				res = "sixteen";
				break;
			case 17:
				res = "seventeen";
				break;
			case 18:
				res = "eithteen";
				break;
			case 19:
				res = "nineteen";
				break;

			}
			break;
		case 2:
			res = "twenty ";
			break;
		case 3:
			res = "thirty ";
			break;
		case 4:
			res = "fourty ";
			break;
		case 5:
			res = "fifty ";
			break;
		case 6:
			res = "sixty ";
			break;
		case 7:
			res = "seventy ";
			break;
		case 8:
			res = "eighty ";
			break;
		case 9:
			res = "ninety ";
			break;

		}
		String splitted2 = (String.valueOf(num)).substring(1);
		// System.out.println(splitted2);
		int secondnum = Integer.parseInt(splitted2);

		if (secondnum == 0 || Integer.parseInt(splitted1) == 1) {
			res = res + "";
		} else {
			res = res + numwordbase(secondnum);
		}

		return res;
	}

	public String numwordbase3(int num) {

		String res = "";
		String numb = String.valueOf(num);
		String firstnum = numb.substring(0, 1);
		int firstnum1 = Integer.parseInt(firstnum);
		res = res + numwordbase(firstnum1) + " hundred ";
		// System.out.println(res);
		String secondnum = numb.substring(1);
		int secondnum2 = Integer.parseInt(secondnum);
		// System.out.println("secondnum "+secondnum2);
		// System.out.println("second number length
		// "+String.valueOf(secondnum2).length());
		if (String.valueOf(secondnum2).length() == 1) {
			res = res + numwordbase(secondnum2);
			// System.out.println("value is "+res);
		}

		else {

			res = res + numwordbase2(secondnum2);
			// System.out.println(res);
		}

		return res;

	}

	public String toWords(int number) {
		String result = "";
		String con_numb = Integer.toString(number);

		int len = con_numb.length();
		if (len == 1) {
			String conv = numwordbase(number);
			result = result + conv;
		} else if (len == 2) {
			String conv2 = numwordbase2(number);
			result = result + conv2;
		} else if (len == 3) {
			String conv = numwordbase3(number);
			result = result + conv;

		} else if (len == 0 || len >= 3) {
		}
		return result.trim();

	}

}
