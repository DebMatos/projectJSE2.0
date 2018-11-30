package io.altar.jseproject.textinterface.utils;

import java.util.Scanner;

public class ScannerUtils {
	private Scanner sc = new Scanner(System.in);

	public int getIntFromScanner(String msg, boolean canBeNull) {
		String input;
		do {
			System.out.println(msg);
			input = sc.nextLine();
			if (canBeNull && input.equals("")) {
				return -1;
			}
		} while (!isType(input, "Integer"));
		return Integer.parseInt(input);
	}

	
	public String getStringFromScanner(String msg, boolean canBeNull) {
		String input;
		
			System.out.println(msg);
			input = sc.nextLine();
			if (canBeNull && input.equals("")) {
				return "";
			}
		
		return input;
	}
	
	
	public int getIntFromScanner(String msg) {
		return getIntFromScanner(msg, false);
	}

	public int getValidIntFromScanner(String msg, int max, boolean canBeNull) {
		int result;
		do {
			result = getIntFromScanner(msg, canBeNull);
			if (result > max)
				System.out.println("O Numero tem de ser menor que " + max);
		} while (result > max);
		return result;
	}

	public int getValidIntFromScanner(String msg, int max) {
		return getValidIntFromScanner(msg, max, false);
	}

	public int getValidIntFromScanner(String msg, int[] ivas, boolean canBeNull) {
		int result;
		boolean validInt = false;
		do {
			result = getIntFromScanner(msg, canBeNull);
			if (canBeNull && result == -1) {
				return -1;
			} else {
				for (int i : ivas) {
					if (result == i) {
						validInt = true;
					}
				}
				if (!validInt) {
					String validString = "";
					for (int i : ivas) {
						validString += " " + i;
					}
					System.out.println("Numero errado tem de ser" + validString);
				}
			}
		} while (!validInt);
		return result;
	}
	
	public double getValidDoubleFromScanner(String msg, double[] ivas, boolean canBeNull) {
		int result;
		boolean validInt = false;
		do {
			result = getIntFromScanner(msg, canBeNull);
			if (canBeNull && result == -1) {
				return -1;
			} else {
				for (double i : ivas) {
					if (result == i) {
						validInt = true;
					}
				}
				if (!validInt) {
					String validString = "";
					for (double i : ivas) {
						validString += " " + i;
					}
					System.out.println("Numero errado tem de ser" + validString);
				}
			}
		} while (!validInt);
		return result;
	}
	public double getValidDoubleFromScanner(String msg, double max, boolean canBeNull) {
		double result;
		do {
			result = getDoubleFromScanner(msg, canBeNull);
			if (result > max)
				System.out.println("O Numero tem de ser menor que " + max);
		} while (result > max);
		return result;
	}

	public int getValidIntFromScanner(String msg, int[] ivas) {
		return getValidIntFromScanner(msg, ivas, false);
	}

	public float getFloatFromScanner(String msg, boolean canBeNull) {
		String input;
		do {
			System.out.println(msg);
			input = sc.nextLine();
			if (canBeNull && input.equals("")) {
				return -1;
			}
		} while (!isType(input, "Float"));
		return Float.parseFloat(input);
	}

	public float getFloatFromScanner(String msg) {
		return getFloatFromScanner(msg, false);
	}
	
	public double getDoubleFromScanner(String msg, boolean canBeNull) {
		String input;
		do {
			System.out.println(msg);
			input = sc.nextLine();
			if (canBeNull && input.equals("")) {
				return -1;
			}
		} while (!isType(input, "Double"));
		return Double.parseDouble(input);
	}
	
	
	
	
	
	
	
	public Long getLongFromScanner(String msg, boolean canBeNull) {
		String input;
		do {
			System.out.println(msg);
			input = sc.nextLine();
			if (canBeNull && input.equals("")) {
				return (long) -1;
			}
		} while (!isType(input, "Long"));
		return Long.parseLong(input);
	}

	public Long getLongFromScanner(String msg) {
		return getLongFromScanner(msg, false);
	}

	public Long getValidLongFromScanner(String msg, Long max, boolean canBeNull) {
		Long result;
		do {
			result = getLongFromScanner(msg, canBeNull);
			if (result > max)
				System.out.println("O Numero tem de ser menor que " + max);
		} while (result > max);
		return result;
	}

	public Long getValidLongFromScanner(String msg, Long max) {
		return getValidLongFromScanner(msg, max, false);
	}

	public Long getValidLongFromScanner(String msg, Long[] ivas, boolean canBeNull) {
		Long result;
		boolean validInt = false;
		do {
			result = getLongFromScanner(msg, canBeNull);
			if (canBeNull && result == -1) {
				return (long) -1;
			} else {
				for (Long i : ivas) {
					if (result == i) {
						validInt = true;
					}
				}
				if (!validInt) {
					String validString = "";
					for (Long i : ivas) {
						validString += " " + i;
					}
					System.out.println("Numero errado tem de ser" + validString);
				}
			}
		} while (!validInt);
		return result;
	}
	
	
	
	public boolean isType(String input, String type) {
		Scanner lineSc = new Scanner(input);
		boolean result = false;
		switch (type) {
		case "Integer":
			if (lineSc.hasNextInt()) {
				result = true;
			} else {
				System.out.println("Numero invalido colocar um numero inteiro");
			}
			break;
		case "Float":
			if (lineSc.hasNextFloat()) {
				result = true;
			} else {
				System.out.println("Numero invalido colocar um numero flutuante");
			}
			break;
		case "Long":
			if (lineSc.hasNextLong()) {
				result = true;
			} else {
				System.out.println("Numero invalido colocar um numero inteiro");
			}
			break;
		case "Double":
			if (lineSc.hasNextDouble()) {
				result = true;
			} else {
				System.out.println("Numero invalido colocar um numero double");
			}
			break;
		default:
			result = true;
		}
		lineSc.close();
		return result;
	}
}
