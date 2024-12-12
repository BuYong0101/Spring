package spring.di;

import spring.di.entity.ChoibuExam;
import spring.di.entity.Exam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		Exam exam = new ChoibuExam();
		ExamConsole console = new InlineExamConsole(exam);
//		ExamConsole console = new GridExamConsole(exam);
		console.print();
	}

}
