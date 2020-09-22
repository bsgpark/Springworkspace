package anno05;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("mySchool")
public class School {
	 @Autowired//@@Resource(name = "student")
	public Student person;
	@Resource(name = "grade")
	public int grade;
	public School() {
		super();
	}
	public School(Student person) {
		super();
		this.person = person;
	}
	@Override
	public String toString() {
		return "ABC고등학교[학생정보 = "+ person.toString() + "학년 = "+ grade + "]";
	}
	

}
