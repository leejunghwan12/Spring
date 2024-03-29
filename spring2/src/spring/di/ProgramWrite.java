package spring.di;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.ui.ExamConsole;

public class ProgramWrite {


		public static void main(String[] args) {
			ApplicationContext context = 
					new ClassPathXmlApplicationContext("spring/di/setting.xml");
			
			//1번 빈 가져오기 (이름으로) 
			//ExamConsole console = (ExamConsole) context.getBean("console");
			//이름으로 꺼내기 캐스팅해야됨 -어떤 객체인지 몰라서 던져야됨 
			
			//2번 빈 가져오기 (같은 형식으로 - 인터면-인터) 자료형명으로 끄내기 
			ExamConsole console = context.getBean(ExamConsole.class);
			//이 형식과 맞는애를 가져와라 
			//지시서를 읽어서 객체화 해서 담은 그릇 = ioc컨테이너 이름이 context 가 된다.
			
			// 클래스 패스는 src가 루트 가 된다. 패키지가 하나의 디렉토리다.
			//Exam exam = new NewlecExam();
			//Exam exam = new NewlecExam(10,10,10,10); 어떻게 설정할래 ?
			 //앞이 참조 형식 뒤가 객체형식 보통은 같아야하는데 부모자식 관계면 괜찮음 Exam exam = new NewlecExam();
			 //ExamConsole console = new InlineExamConsole(exam); // DI
			  
			//ExamConsole console = new GridExamConsole(exam); //바꿔 끼우는 작업 모듈의 결합은 스프링이면
			 //자동으로해준다.
			  
			 
			// ExamConsole console = ? 어떻게 설정으로 뺄래 ?
			
			
			//스프링에게 지시서로 넘겨야 한다. 
			Exam exam = context.getBean(Exam.class); //자료형을 통해서 가져오는 방법임 
			console.setExam(exam);
			System.out.println(exam.toString());
			
			//to string 컬럼 다 선택하고 이클립스가 이 값들을 출력해주는 문자열을 포함시키게 된다.
			
			
			//console.print();
			
			//===============================================//
			
			//지시서 세팅 xml 지시서
			// 이녀석의 지시대로 읽어서 지시대로 객체를 만들고 그 만들어진 객체를 활용하는 방법
			// 그 주체를 생성할 때 사용될 수 있는놈은 applicationContext 생성 및 조립 구체적인 객체 이름이다. 
			// 인터페이스 명이고 이녀석을 구현중인게
			// ApplicationContext context = new ClassPathXmlApllicationcontext("config.xml"); 
			
			//스프링 프레임워크 스프링 컨텍스트 
			
			//10-16
			// ArrayList 생성을 여기서하지말고 xml에서 가져와서 초기화하기 
			
			List<Exam> exams = (List<Exam>) context.getBean("exams");
			//exams.add(new NewlecExam(1,1,1,1));
			for (Exam e : exams) {
				System.out.println(e);
			}
			
			
		}

	}


