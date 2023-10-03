///////////////////////////////////////////////////////////// 코드 판독중
package goodSchool;

import java.util.ArrayList;

public class GoodSchool {

	public static GoodSchool instance = new GoodSchool();
	
	public static String SCHOOL_NAME = "Good School";
	
	public ArrayList<Student> studentList = new ArrayList<Student>();
	public ArrayList<Subject> subjectList = new ArrayList<Subject>();
	
	public GoodSchool(){}
	
	public static GoodSchool getInstance(){
		if(instance == null) 
			instance = new GoodSchool();
		return instance;
	}
	
//	public ArrayList<Student> getStudentList(){
//		return studentList;
//	}
	
	public void addStudent(Student student){
		studentList.add(student);
	}

	public void addSubject(Subject subject) {
		subjectList.add(subject);
	}


}