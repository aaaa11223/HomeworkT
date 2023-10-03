package goodSchool;

public class Score {
	
	//______________________________[ 필드 ]
	public int studentID;
    // └ 학번
	public Subject subject;
    // └ 과목
	public int point;
    // └ 점수
	
	
	//______________________________[ 생성자 ]
	public Score( int studentID, Subject subject, int point){
		this.studentID = studentID;
		this.subject = subject;
		this.point = point;
	}


	//______________________________[ 메서드 ]
	// ※ 이 부분 필요성 이해 못했음
	public String toString(){
		return "학번:" + studentID + "," + subject.subjectName+ ":" + point;
	}
	
}