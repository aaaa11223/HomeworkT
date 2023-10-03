///////////////////////////////////////////////////////////// 코드 판독중
package goodSchool;

import java.util.ArrayList;

public class GradeReportTemplate {

	GoodSchool school = GoodSchool.getInstance();
	
	public static final String TITLE = " 수강생 학점 \t\t\n"; // \t: 탭만큼 띄움
	public static final String HEADER = " 이름  |  학번  |중점과목| 점수   \n";
	public static final String LINE = "-------------------------------------\n";
	public StringBuffer buffer = new StringBuffer();
	
	public String getReport(){
		ArrayList<Subject> subjectList = school.subjectList;  // 모든 과목에 대한 학점 산출
		for( Subject subject : subjectList) {
			makeHeader(subject);
			makeBody(subject);
			makeFooter();
		}
		return buffer.toString();  // String 으로 반환
	}
	
	public void makeHeader(Subject subject){
		buffer.append(GradeReportTemplate.LINE);
		buffer.append("\t" + subject.subjectName);
		buffer.append(GradeReportTemplate.TITLE );
		buffer.append(GradeReportTemplate.HEADER );
		buffer.append(GradeReportTemplate.LINE);
	} 
	
	public void makeBody(Subject subject){
		
		ArrayList<Student> studentList = subject.studentList;  // 각 과목의 학생들
		
		for(int i=0; i <studentList.size(); i++){
			Student student = studentList.get(i);
			buffer.append(student.studentName);
			buffer.append(" | ");
			buffer.append(student.studentID);
			buffer.append(" | ");
			buffer.append(student.majorSubject.subjectName + "\t");
			buffer.append(" | ");
			
			getScoreGrade(student, subject.subjectID);  //학생별 해당과목 학점 계산
			buffer.append("\n");
			buffer.append(LINE);
		}
	}
	
	public void getScoreGrade(Student student, int subjectId){
		
		ArrayList<Score> scoreList = student.scoreList;
		int majorId = student.majorSubject.subjectID;
		
		GradeEvaluation[] gradeEvaluation = {new GradeEvaluation_General(), new GradeEvaluation_Major()};  //학점 평가 클래스들
		
		for(int i=0; i<scoreList.size(); i++){  // 학생이 가진 점수들 
			
			Score score = scoreList.get(i);
			if(score.subject.subjectID == subjectId) {  // 현재 학점을 산출할 과목 
				char grade;
				if(score.subject.subjectID == majorId)  // 중점 과목인 경우
					grade = gradeEvaluation[Define.MAJ_TYPE].getGrade(score.point);  //중점 과목 학점 평가 방법
				else
					grade = gradeEvaluation[Define.GEN_TYPE].getGrade(score.point); // 중점 과목이 아닌 경우
				buffer.append(score.point);
				buffer.append(":");
				buffer.append(grade);
				buffer.append(" | ");
			}
		}
	}
	
	public void makeFooter(){
		buffer.append("\n");
	}
}