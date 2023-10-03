package goodSchool;

import java.util.ArrayList;

public class Student {

	//______________________________[ 필드 ]
	public int studentID;
    // └ 학번
	public String studentName;
    // └ 학생 이름
	public Subject majorSubject;
    // └ 중점 과목
	
	public ArrayList<Score> scoreList = new ArrayList<Score>(); 
    // └ 학생의 성적 리스트: addSubjectSocre() 메서드가 호출되면 리스트에 추가됨
	
	
	//______________________________[ 생성자 ]
	public Student( int studentID, String studentName, Subject majorSubject){
		this.studentID = studentID;
		this.studentName = studentName;
		this.majorSubject = majorSubject;
	}
	
	
	//______________________________[ 메서드 ]
	public void addSubjectScore(Score score){
		scoreList.add(score);
	}
	
}