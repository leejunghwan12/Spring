package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/di/setting.xml");

		
		//Exam exam = context.getBean(Exam.class); //자료형을 통해서 가져오는 방법임 
		//System.out.println(exam.toString());
//		ExamConsole console = (ExamConsole) context.getBean("console");
		//얘는 이름단위로 불러온다. 얘로 부를때는 @Component("console") 써야함 
		ExamConsole console = context.getBean(ExamConsole.class);
		//얘는 클래스 단위로 불러오고  이 인터페이스와 부합되는 객체가 있으면 불러와라 라는 의미 
		
		console.print();
		
		
		
		
	}

}
