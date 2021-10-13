package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {

		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		//1踰� 鍮� 媛��졇�삤湲� (�씠由꾩쑝濡�) gg
		//ExamConsole console = (ExamConsole) context.getBean("console");
		//�씠由꾩쑝濡� 爰쇰궡湲� 罹먯뒪�똿�빐�빞�맖 -�뼱�뼡 媛앹껜�씤吏� 紐곕씪�꽌 �뜕�졇�빞�맖 
		
		//2踰� 鍮� 媛��졇�삤湲� (媛숈� �삎�떇�쑝濡� - �씤�꽣硫�-�씤�꽣) �옄猷뚰삎紐낆쑝濡� �걚�궡湲� 
		ExamConsole console = context.getBean(ExamConsole.class);
		//�씠 �삎�떇怨� 留욌뒗�븷瑜� 媛��졇���씪 
		//吏��떆�꽌瑜� �씫�뼱�꽌 媛앹껜�솕 �빐�꽌 �떞�� 洹몃쫯 = ioc而⑦뀒�씠�꼫 �씠由꾩씠 context 媛� �맂�떎.
		
		
		
		
		// �겢�옒�뒪 �뙣�뒪�뒗 src媛� 猷⑦듃 媛� �맂�떎. �뙣�궎吏�媛� �븯�굹�쓽 �뵒�젆�넗由щ떎. 

		//Exam exam = new NewlecExam();
		
		 //�븵�씠 李몄“ �삎�떇 �뮘媛� 媛앹껜�삎�떇 蹂댄넻�� 媛숈븘�빞�븯�뒗�뜲 遺�紐⑥옄�떇 愿�怨꾨㈃ 愿쒖갖�쓬 Exam exam = new NewlecExam();
		 //ExamConsole console = new InlineExamConsole(exam); // DI
		  
		//ExamConsole console = new GridExamConsole(exam); //諛붽퓭 �겮�슦�뒗 �옉�뾽 紐⑤뱢�쓽 寃고빀�� �뒪�봽留곸씠硫�
		 //�옄�룞�쑝濡쒗빐以��떎.
		  
		// console.setExam(exam);
		 
		// ExamConsole console = ? �뼱�뼸寃� �꽕�젙�쑝濡� 類꾨옒 ?
		//�뒪�봽留곸뿉寃� 吏��떆�꽌濡� �꽆寃⑥빞 �븳�떎. 
		
		console.print();
		
		//===============================================//
		
		//吏��떆�꽌 �꽭�똿 xml 吏��떆�꽌
		// �씠���꽍�쓽 吏��떆��濡� �씫�뼱�꽌 吏��떆��濡� 媛앹껜瑜� 留뚮뱾怨� 洹� 留뚮뱾�뼱吏� 媛앹껜瑜� �솢�슜�븯�뒗 諛⑸쾿
		// 洹� 二쇱껜瑜� �깮�꽦�븷 �븣 �궗�슜�맆 �닔 �엳�뒗�냸�� applicationContext �깮�꽦 諛� 議곕┰ 援ъ껜�쟻�씤 媛앹껜 �씠由꾩씠�떎. 
		// �씤�꽣�럹�씠�뒪 紐낆씠怨� �씠���꽍�쓣 援ы쁽以묒씤寃�
		// ApplicationContext context = new ClassPathXmlApllicationcontext("config.xml");
		
		//�뒪�봽留� �봽�젅�엫�썙�겕 �뒪�봽留� 而⑦뀓�뒪�듃 
		
		
		
		
		
		
	}

}
