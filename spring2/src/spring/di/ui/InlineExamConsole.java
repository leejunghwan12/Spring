package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {

	
	private Exam exam;
	
	public InlineExamConsole() {
		System.out.println("constructor");
	}
	
	public InlineExamConsole(Exam exam) {		
		this.exam = exam;
		System.out.println("over constructor");

	}


	@Override
	public void print() {
		System.out.println("setter");
		System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
	}


	@Autowired
	@Qualifier("exam1")
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
		
	}

}
