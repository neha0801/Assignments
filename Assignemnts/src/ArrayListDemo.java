import java.util.*; 

class ArrayListDemo 
{ 
	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]) 
	{ 
		// create an array list 
		ArrayList<String> al = new ArrayList<String>(); 
		System.out.println("Initial size of ArrayList: " + 
		al.size()); 
		// add elements to the array list 
		al.add("C"); 
		al.add("A"); 
		al.add("E"); 
		al.add("B"); 
		al.add("D"); 
		al.add("F"); 
		al.add(1, "A2"); 
		// fixed an error for size method of arraylist
		System.out.println("Size of al after additions: " + al.size()); 
		// display the array list 
		System.out.println("Contents of al: " + al); 
		// Remove elements from the array list 
		al.remove("F"); 
		al.remove("G"); 
		al.remove(2); 
		System.out.println("Size of al after deletions: " + al.size()); 
		System.out.println("Contents of al: " + al); 
		System.out.println("-----------------------------------------");
		
		// convert the arraylist into an array ia
		Object ia[] =al.toArray();
		System.out.println("Elements of Array are: ");
		// loop to display the contents of converted array
		for(int i=0;i<ia.length;i++){
			System.out.print(ia[i]+" " );
		}
	} 
}