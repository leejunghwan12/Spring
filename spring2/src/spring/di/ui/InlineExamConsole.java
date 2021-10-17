package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import spring.di.entity.Exam;

@Component
public class InlineExamConsole implements ExamConsole {
	//required = false 
	//객체가 일단 없어도 OK 진행하여라  14강까지 내용 
	@Autowired
//	@Qualifier("exam2")
	private Exam exam;
	//프라이빗인데 어떻게? 기본생성자가 생성되면서 된다.
	public InlineExamConsole() {
		System.out.println("constructor");
	}
	
	
	
	public InlineExamConsole(Exam exam) {		
		System.out.println("over constructor");
		this.exam = exam; 
		
	}
	/*
	 * @Autowired public InlineExamConsole(
	 * 
	 * @Qualifier("exam1")Exam exam) { System.out.println("over constructor");
	 * this.exam = exam;
	 * 
	 * }
	 */

	@Override
	public void print() {
		if (exam == null) {
			System.out.printf("total is %d, avg is %f\n", 0,0.0);
		}else {
			System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
		}
	}



	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
		
	}

}
