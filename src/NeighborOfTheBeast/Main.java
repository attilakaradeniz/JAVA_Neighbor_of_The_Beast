package NeighborOfTheBeast;

public class Main {

	public static void main(String[] args) {
		//System.out.println("Hello world!");
		int num = 667;

		System.out.println(String.format("the neighbor of the beast: %d!", num));
		System.out.println("the neighbor of the beast: " + Integer.toHexString(num).toUpperCase() + "!");
		System.out.println(String.format("the neighbor of the beast: %10d!", num));
		System.out.println(String.format("the neighbor of the beast: %-10d!", num));
		System.out.println(String.format("the neighbor of the beast: %08d!", num));
		System.out.println(String.format("the neighbor of the beast: +%-11d!", num));
	}
}
