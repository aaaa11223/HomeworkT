package goodSchool;

import java.util.ArrayList;

public class Subject {
	
	//______________________________[ 필드 ]
    public String subjectName;
    // └ 과목 이름
    public int subjectID;
    // └ 과목 고유번호
    public int gradeType;
    // └ 과목 학점 부여 기준

    public ArrayList<Student> studentList = new ArrayList<Student>();
    // └ 수강 신청한 학생 리스트: register() 메서드를 호출하면 리스트에 추가됨
    
    
	//______________________________[ 생성자 ]
    public Subject(String subjectName, int subjectID) {
        this.subjectName = subjectName;
        this.subjectID = subjectID;
        this.gradeType = Define.GEN_TYPE;
        // └ 학점 부여 기준의 기본값을 일반 과목으로 지정
    }
    

	//______________________________[ 메서드 ]
    public void register(Student student) {
        studentList.add(student);
    }
    
}