package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.ChoibuExam;
import spring.di.entity.Exam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		
		/*
		Exam exam = new ChoibuExam();
		Exam exam = new ChoibuExam(10,10,10,10);
		ExamConsole console = new GridExamConsole(exam);
		
		console.setExam(exam);
		*/
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(ChoibuDIConfig.class);
//				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
//		Exam exam = context.getBean(Exam.class);
//		System.out.println(exam.toString());
		
		ExamConsole console = (ExamConsole) context.getBean("console");
//		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
//		List<Exam> exams = (List<Exam>) context.getBean("exams");//new ArrayList<>();
//		exams.add(new ChoibuExam(1,1,1,1));
		
		
//		for(Exam e : exams)
//			System.out.println(e);
	}

}