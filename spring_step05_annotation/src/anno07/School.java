package anno07;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "mySchool")
public class School {
	@Resource(name = "grade")
	public int grade;

	@Override
	public String toString() {
		return grade + "학년입니다.";
	}
	

}
