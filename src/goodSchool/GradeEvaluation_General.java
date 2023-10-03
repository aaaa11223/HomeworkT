package goodSchool;

//────────── 학점 부여 기준: 일반 과목
public class GradeEvaluation_General implements GradeEvaluation {
	
	@Override
	public char getGrade(int point) {
		char grade;
		
		if(point >=90 && point <=100)
			grade = 'A';
		else if(point >=80 && point <90)
			grade = 'B';
		else if(point >=70 && point <80)
			grade = 'C';
		else if(point >=55 && point <70)
			grade = 'D';
		else
			grade = 'F';
		
		return grade;
	}
	
}