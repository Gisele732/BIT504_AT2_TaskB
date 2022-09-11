import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	//attributes
	public static LinkedList<Student> allStudents;
	
	//main method
	public static void main(String[] args) throws IOException {
		allStudents = new LinkedList<Student>();
		Scanner scanner = new Scanner(System.in); 
		
		//read a file source.txt which should return true or false
		//true: program will run. false: something is wrong with the file
		
		if(readFile("studentdata.txt")) {
			displayMenu();
			selectMenuOption();
		}
	
	}//end of main method
	
	//other methods
	
	public static boolean readFile(String fileName) throws IOException { 
		File file = new File(fileName);
	
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()){
				String[] words = scanner.nextLine().split(",");
				
				int id = Integer.parseInt(words[0]);
				String firstName = words[1];
				String lastName = words[2];
				int mathMark1 = Integer.parseInt(words[3]);
				int mathMark2 = Integer.parseInt(words[4]);
				int mathMark3 = Integer.parseInt(words[5]);
				int englishMark1 = Integer.parseInt(words[6]);
				int englishMark2 = Integer.parseInt(words[7]);
				int englishMark3 = Integer.parseInt(words[8]);
						
				addStudent(id,firstName,lastName,mathMark1,mathMark2,mathMark3,englishMark1,englishMark2,englishMark3);
			}
			scanner.close();
		} catch (FileNotFoundException e) { 
			System.out.println("Failed to read file");
			return false;
			
	}
	return true;

	}
	
	private static void addStudent(int id, String firstName, String lastName, int mathMark1, int mathMark2, int mathMark3, int englishMark1, int englishMark2, int englishMark3) {
		//creates the aStudent object, populates it with the data from the file and pushes it into the allStudents linked list
		Student aStudent = new Student(id, firstName, lastName);
		AssessmentMarks mathSubject = new AssessmentMarks("Maths",mathMark1, mathMark2, mathMark3);
		AssessmentMarks englishSubject = new AssessmentMarks("English", englishMark1, englishMark2, englishMark3);
		aStudent.setEnglishMarks(englishSubject);
		aStudent.setMathMarks(mathSubject);

		allStudents.add(aStudent);
	}
	
	private static void displayReportByMarks(){
		System.out.println(" ");
		System.out.println("ID\tStudent Name\t\tEnglish\tA1\tA2\tA3\tAverage\t\tMaths\tA1\tA2\tA3\tAverage");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------");
		for (Student s : allStudents) {
			System.out.println(s.getId() + "\t" + s.getFullName() + 
					"\t\t" + "\t" + s.getEnglishMarks().getMark1() + "\t" + s.getEnglishMarks().getMark2() + "\t" + s.getEnglishMarks().getMark3() + "\t" + s.getEnglishMarks().getAverageMark() +
					"\t\t" + "\t" + s.getMathMarks().getMark1() + "\t" + s.getMathMarks().getMark2() + "\t" + s.getMathMarks().getMark3() + "\t" + s.getMathMarks().getAverageMark());
		}
		System.out.println(" ");
		displayMenu();
		selectMenuOption();
	}
	
	private static void displayReportByGrades() {
		System.out.println(" ");
		System.out.println("ID\tStudent Name\t\tEnglish\tA1\tA2\tA3\tAverage\t\tMaths\tA1\tA2\tA3\tAverage");
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		for (Student s : allStudents) {
			System.out.println(s.getId() + "\t" + s.getFullName() + 
					"\t\t" + "\t" + s.getEnglishMarks().getGrade1() + "\t" + s.getEnglishMarks().getGrade2() + "\t" + s.getEnglishMarks().getGrade3() + "\t" + s.getEnglishMarks().getAverageGrade() +
					"\t\t" + "\t" + s.getMathMarks().getGrade1() + "\t" + s.getMathMarks().getGrade2() + "\t" + s.getMathMarks().getGrade3() + "\t" + s.getMathMarks().getAverageGrade());
		}
		System.out.println(" ");
		displayMenu();
		selectMenuOption();
	}
	
	private static void displayMenu() {
		System.out.println(" ");
		System.out.println("Student Report System");
		System.out.println("---------------------");
		System.out.println("1- Display Student Marks"
				+ "\n2- Display Student Grades"
				+ "\n3- Add New Student"
				+ "\n4- Remove Student"
				+ "\n5- Exit");
		System.out.println("---------------------");		
	}
	
	private static void selectMenuOption() {
		Scanner scanner = new Scanner(System.in);
		int option = 0;
		do {
			
		try {
		System.out.println("Please enter an option:");
		option = scanner.nextInt();
		
		if (option == 1) {
			displayReportByMarks();
		}else if (option == 2) {
			displayReportByGrades();
		}else if (option == 3) {
			addNewStudent();
		}else if (option == 4) {
			removeStudent();
		}else if (option == 5) {
			System.out.println("Thank you, you can close the program.");
			System.exit(option);
		}else {
			System.out.println("Invalid input");
			displayMenu();
			selectMenuOption();
		}
		}catch (InputMismatchException e) {
			System.out.println("Invalid input");
            scanner.nextLine();
		
		}
	}while (option <= 0);
}
	
	private static void addNewStudent() {
		 Scanner scanner = new Scanner(System.in); 
			System.out.println("Enter student ID:");
			int id = scanner.nextInt();
			System.out.println("Enter student First Name:");
			String firstName = scanner.next();
			System.out.println("Enter student Last Name:");
			String lastName = scanner.next();
			System.out.println("Enter student Maths mark 1:");
			int mathMark1 = scanner.nextInt();
			System.out.println("Enter student Maths mark 2:");
			int mathMark2 = scanner.nextInt();
			System.out.println("Enter student Maths mark 3:");
			int mathMark3 = scanner.nextInt();
			System.out.println("Enter student English mark 1:");
			int englishMark1 = scanner.nextInt();
			System.out.println("Enter student English mark 2:");
			int englishMark2 = scanner.nextInt();
			System.out.println("Enter student English mark 3:");
			int englishMark3 = scanner.nextInt();
			
			addStudent(id,firstName,lastName,mathMark1,mathMark2,mathMark3,englishMark1,englishMark2,englishMark3);
			
			
			displayMenu();
			selectMenuOption();
	}
		
	
	
	
	private static void removeStudent() {
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.println(" ");		
			System.out.println("Enter the ID of student to remove:");
			int id = scanner.nextInt();
				
			for (Student student : allStudents) {
				 if (id == student.getId()) {
					System.out.println("Do you wish to delete " + student.getFullName() + "? Yes/No");
					String reply = scanner.next();
					
					if (reply.equals("Yes") || reply.equals("yes")) {
					allStudents.remove(student);
					System.out.println(" ");
					System.out.println(student.getFullName() + " was removed. New list of students:");
					
					displayReportByMarks();
					
					}
					if (reply.equals("No") || reply.equals("no")) {
						System.out.println(student.getFullName() + " was not removed");	
						
						displayMenu();
						selectMenuOption();
						
					}
			    }
			 }  System.out.println(" ");		
				System.out.println("Enter a valid ID:");
				removeStudent();
		}
	  }
	}		
	


