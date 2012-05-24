package ex02_11;

public class LinkedList {

	Object object;
	LinkedList nextObject;

	LinkedList (Object associatedObject)
	{
		object = associatedObject;
	}

	public String toString()
	{
		String desc = "This method is toString of LinkedList!";
		return desc;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Vehicle temporary = new Vehicle();

		LinkedList test = new LinkedList(temporary);
		// test.object = new Vehicle();

		temporary = new Vehicle();
		test.nextObject = new LinkedList(temporary);
		// test.nextObject.object = new Vehicle();
		System.out.println(((Vehicle)test.object).id);
		System.out.println(((Vehicle)test.nextObject.object).id);

		System.out.println("");

		System.out.println(test);
	}

}