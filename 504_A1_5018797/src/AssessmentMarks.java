
public class AssessmentMarks {

	// class attributes
	private String courseName;
	private int assessment1;
	private int assessment2;
	private int assessment3;
	
	//constructor
	public AssessmentMarks(String courseName, int assessment1, int assessment2, int assessment3) {
		this.courseName = courseName;
		this.assessment1 = assessment1;
		this.assessment2 = assessment2;
		this.assessment3 = assessment3;
	}
	
	//getter and setter methods	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public int getMark1() {
		return assessment1;
	}
	
	public int getMark2() {
		return assessment2;
	}
	
	public int getMark3() {
		return assessment3;
	}
	
	public String getGrade1() {
		return markToGrade(assessment1);
	}
	
	public String getGrade2() {
		return markToGrade(assessment2);
	}
	
	public String getGrade3() {
		return markToGrade(assessment3);
	}
	
	public int getAverageMark() {
		return ((assessment1 + assessment2 + assessment3)/3);
	}
	
	public String markToGrade(int mark) {
		String grade = null;
		if (mark <= 40) {
			grade = "FAIL";			
		}
		if (mark > 40 && mark <= 49) {
			grade = "C-";			
		}
		if (mark > 49 && mark <= 59) {
			grade = "C";			
		}
		if (mark > 59 && mark <= 69) {
			grade = "C+";			
		}
		if (mark > 69 && mark <= 74) {
			grade = "B-";			
		}
		if (mark > 74 && mark <= 79) {
			grade = "B";			
		}
		if (mark > 79 && mark <= 84) {
			grade = "C+";			
		}
		if (mark > 84 && mark <= 89) {
			grade = "A-";			
		}
		if (mark > 89 && mark <= 94) {
			grade = "A";			
		}
		if (mark > 94) {
			grade = "A+";			
		}
		return grade;		
	}
	
	public String getAverageGrade() {
		String averageGrade = null;
		int averageMark = getAverageMark();
		if (averageMark <= 40) {
			averageGrade = "FAIL";			
		}
		if (averageMark > 40 && averageMark <= 49) {
			averageGrade = "C-";			
		}
		if (averageMark > 49 && averageMark <= 59) {
			averageGrade = "C";			
		}
		if (averageMark > 59 && averageMark <= 69) {
			averageGrade = "C+";			
		}
		if (averageMark > 69 && averageMark <= 74) {
			averageGrade = "B-";			
		}
		if (averageMark > 74 && averageMark <= 79) {
			averageGrade = "B";			
		}
		if (averageMark > 79 && averageMark <= 84) {
			averageGrade = "C+";			
		}
		if (averageMark > 84 && averageMark <= 89) {
			averageGrade = "A-";			
		}
		if (averageMark > 89 && averageMark <= 94) {
			averageGrade = "A";			
		}
		if (averageMark > 94) {
			averageGrade = "A+";			
		}
		return averageGrade;
		
	}
}
