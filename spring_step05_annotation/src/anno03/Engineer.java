package anno03;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Engineer {
	//@Autowired
	//@Qualifier(value ="emp2"//Autowired,Qualifier의 경우는 spring 전용 annotation 이고, @resource는 java전용 annotation)
	@Resource(name = "emp1")
	private Emp emp;
	private String dept;
	
	public Engineer() {
		super();
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return emp.toString()+"\n"+dept+"에 근무합니다.";
	}
	

}
