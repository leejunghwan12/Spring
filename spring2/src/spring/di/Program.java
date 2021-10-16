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
		ExamConsole console = (ExamConsole) context.getBean("console");
		
		console.print();
		
		
		
		
	}

}
