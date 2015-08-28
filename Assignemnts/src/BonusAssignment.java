

/**
 * Program to print the average GPA according to:
 * number of Students, gender, major, state 
 * @author Neha
 *
 */
import java.util.*;
import java.text.DecimalFormat;
public class BonusAssignment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Scanner to get the user input
		Scanner keyboard = new Scanner(System.in);
		// Arraylists created to save name,grade, gender, major and state of the origin of the student
		List<String> name= new ArrayList<String>();
		List<String> grade = new ArrayList<String>();
		List<String> gender= new ArrayList<String>(); 
		List<String> major = new ArrayList<String>();		
		List<String> stateOfOrigin = new ArrayList<String>();
		// Map is created to save total number of students with respect to major and state of the origin of the student
		Map<String, Integer> stateCount = new HashMap<String, Integer>();
		Map<String, Integer> majorCount = new HashMap<String, Integer>();
		
		// Map is created to save sum of GPA with respect to major and state of the origin of the student
		Map<String, Double> stateGpa = new HashMap<String, Double>();
		Map<String, Double> majorGpa = new HashMap<String, Double>();

		// object to to do formatting
		DecimalFormat df = new DecimalFormat("#.##");
		// variable to check to continue or not
		String choice = "y";
		
		// variable to perform validation
		String checkGender, checkGrade,checkState,checkMajor;
		// variables to save the sum of GPA 
		double sumGrade = 0.0, sumGradeMale =0.0,sumGradeFemale = 0.0;
		// variables to save the average calculated
		double overallAvg=0.0, avgForMale =0.0,avgForFemale =0.0, avgState=0.0,avgMajor=0.0;
		// variables to count
		int index =0, countStudents =0, countMale=0, countFemale=0;
		// grade value for grade letter entered
		double gradeValue=0.0;
		// loop to take the input from the user

		while(true){
			// save the name in a list entered by user
			System.out.print("Name?: ");
			name.add(keyboard.next());
			// Validate the grade entered by user and save in a list
			System.out.print("Grade?: ");
			checkGrade = keyboard.next();
			if (checkGrade.equalsIgnoreCase("A") || checkGrade.equalsIgnoreCase("B")|| checkGrade.equalsIgnoreCase("C"))
			{
				grade.add(checkGrade);				
			} else{
				System.out.println("Incorrect Grade value entered");
				// remove the current record and ask again if incorrect Grade entered
				name.remove(index);
				continue;
			}
			
			// validate the gender and save in a array
			System.out.print("Gender?: ");
			checkGender= keyboard.next();
			if (checkGender.equalsIgnoreCase("M") || checkGender.equalsIgnoreCase("F")||
					checkGender.equalsIgnoreCase("Male") || checkGender.equalsIgnoreCase("Female")){
				gender.add(checkGender);
			} else{
				System.out.println("Incorrect Gender value entered");
				// remove the current record and ask again if incorrect value for gender entered
				name.remove(index);
				grade.remove(index);
				continue;
			}
			
			// save the major entered in a list and keep the count updated 
			System.out.print("Major?: ");
			checkMajor = keyboard.next();
			/**
			 * if the major entered was entered before increase the 
			 * count in hashmap which keeps track of the number of majors
			 *  entered otherwise create new record in hashmap
			 */
			if( major.contains(checkMajor)){
				
				majorCount.put(checkMajor, (majorCount.get(checkMajor)+1));	
			} else {
				majorCount.put(checkMajor, 1);
			}
			// add major to list
			major.add(checkMajor);
			
			// save the sate entered in a list and keep the count updated 
			System.out.print("Stae of Origin?: ");
			checkState = keyboard.next();
			/**
			 * if the state entered was entered before increase
			 * the count in hashmap which keeps track of the 
			 * number of states entered otherwise create new record in hashmap
			 */
			if( stateOfOrigin.contains(checkState)){
				
				stateCount.put(checkState, (stateCount.get(checkState)+1));	
			} else {
				stateCount.put(checkState, 1);
			}
			// add state to list
			stateOfOrigin.add(checkState);
			
			// increase the index to keep track of record entered
			index+=1;
			
			// display if user wants to continue or not
			System.out.print("Do you wish to continue? Enter 'Y' or 'N': ");
			choice = keyboard.next();
			
			if (choice.equalsIgnoreCase("n"))
			{
				break;
			}else if (choice.equalsIgnoreCase("y")) {}
			else {
				System.out.println("Enter choice correctly: ");
			}
				
		} // end the while loop for input
		
		// create an iterator in order to iterate through the list
		Iterator<String> itrgrade = grade.iterator();
		// loop runs till grade list has next item
		while(itrgrade.hasNext())
		{
			String element = (String) itrgrade.next();
			// assign numeric values for all letter grades
			if (element.equalsIgnoreCase("A")){
				gradeValue = 4.0;				
			}else if (element.equalsIgnoreCase("B")){
				gradeValue = 3.0;
			}else if(element.equalsIgnoreCase("C")){
				gradeValue = 2.0;
			}
			// calculate sum of grades of all students
			sumGrade += gradeValue;	
			// increment the number of student by 1
			countStudents += 1;
		}
		// rest the grade iterator
		itrgrade = grade.iterator();
		// calculate the overall average and display
		overallAvg = sumGrade/countStudents;
		System.out.println("Overall Average: " + df.format(overallAvg));
		
		// iterator for gender list
		Iterator<String> itrgender = gender.iterator();
		// loop runs till gender list has next item
		while(itrgrade.hasNext() && itrgender.hasNext())
		{			
			String elementGrade = (String) itrgrade.next();
			String elementGender = (String) itrgender.next();
			// save the sum of grade  according to gender
			if (elementGrade.equalsIgnoreCase("A")){
				gradeValue = 4.0;				
			}else if (elementGrade.equalsIgnoreCase("B")){
				gradeValue = 3.0;
			}else if(elementGrade.equalsIgnoreCase("C")){
				gradeValue = 2.0;
			}
			if (elementGender.equalsIgnoreCase("M")){
				sumGradeMale += gradeValue;
				countMale+=1;
			}else if (elementGender.equalsIgnoreCase("F")){
				sumGradeFemale += gradeValue;
				countFemale+=1;
			}			
		}
		// print the average of grades with respective to  gender
		if(countMale>0)
		{
			avgForMale = sumGradeMale/countMale;
		}else 
		{
			System.out.println("No Male records");
			avgForMale = 0.0;
		}
		if(countFemale>0)
		{
			avgForFemale = sumGradeFemale/countFemale;
		}else 
		{
			System.out.println("No Female records");
			avgForFemale = 0.0;
		}
		
		// display the average f=grades according to gender
		System.out.println("Average Grade for Males: " + avgForMale);
		System.out.println("Average Grade for Females: " + avgForFemale);
		
		// reset the iterator for grade
		itrgrade = grade.iterator();
		// create iterator for major list
		Iterator<String> itrMajor = major.iterator();
		// loop runs till major list has next item
		while(itrMajor.hasNext() && itrgrade.hasNext())
		{
			String elementMajor = (String) itrMajor.next();
			String elementGrade = (String) itrgrade.next();
			
			// save the sum of grade  according to major
			if (elementGrade.equalsIgnoreCase("A")){
				gradeValue = 4.0;				
			}else if (elementGrade.equalsIgnoreCase("B")){
				gradeValue = 3.0;
			}else if(elementGrade.equalsIgnoreCase("C")){
				gradeValue = 2.0;
			}
			if (majorGpa.containsKey(elementMajor)) {
				majorGpa.put(elementMajor, gradeValue+majorGpa.get(elementMajor));	
			}else
				majorGpa.put(elementMajor, gradeValue);
			
		}
		// loop to compute and print average with respect to major
		for(String key: majorCount.keySet()){
			
			if(majorCount.get(key) >=0){
				System.out.println("Average Grade for major: " + key);
				avgMajor = majorGpa.get(key)/majorCount.get(key);
				System.out.println(avgMajor);
				
			}
		}
		// reset the grade iterator
		itrgrade = grade.iterator();
		//create the iterator for state of origin
		Iterator<String> itrState = stateOfOrigin.iterator();
		
		// loop runs till major list has next item
		while(itrState.hasNext() && itrgrade.hasNext())
		{
			String elementState = (String) itrState.next();
			String elementGrade = (String) itrgrade.next();
			
			// save the sum of grade  according to major
			if (elementGrade.equalsIgnoreCase("A")){
				gradeValue = 4.0;				
			}else if (elementGrade.equalsIgnoreCase("B")){
				gradeValue = 3.0;
			}else if(elementGrade.equalsIgnoreCase("C")){
				gradeValue = 2.0;
			}
			if (stateGpa.containsKey(elementState)) {
				stateGpa.put(elementState, gradeValue+stateGpa.get(elementState));	
			}else
				stateGpa.put(elementState, gradeValue);
			
		}
		
		// loop to compute and print average with respect to major
		for(String key: stateCount.keySet()){
			
			if(stateCount.get(key) >=0){
				System.out.println("Average Grade for state: " + key);
				avgState = stateGpa.get(key)/stateCount.get(key);
				System.out.println(avgState);
				
			}
		}
		// close the scanner
		keyboard.close();
	}

}
