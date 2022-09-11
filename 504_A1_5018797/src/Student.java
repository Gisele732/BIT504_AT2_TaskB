
public class Student {
	//attributes
	private int id;
	private String firstName;
	private String lastName;
	private AssessmentMarks mathMarks;
	private AssessmentMarks englishMarks;
	
	//constructor
	public Student(int id, String firstName, String lastName) {
		this.setId(id);
		this.firstName = firstName;
		this.lastName = lastName;
	}

	//getter and setter methods
	
	public String getFullName() {
		return firstName + " " + lastName;
	}

	public AssessmentMarks getMathMarks() {
		return mathMarks;
	}

	public void setMathMarks(AssessmentMarks mathMarks) {
		this.mathMarks = mathMarks;
	}

	public AssessmentMarks getEnglishMarks() {
		return englishMarks;
	}

	public void setEnglishMarks(AssessmentMarks englishMarks) {
		this.englishMarks = englishMarks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
