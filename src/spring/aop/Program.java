package spring.aop;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import spring.aop.entity.ChoibuExam;
import spring.aop.entity.Exam;

public class Program {

	public static void main(String[] args) {
		
		Exam exam = new ChoibuExam(1,1,1,1);
		
		Exam proxy = (Exam) Proxy.newProxyInstance(ChoibuExam.class.getClassLoader(),
					new Class[] {Exam.class},
					new InvocationHandler() {
						
						@Override
						public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
							
							long start = System.currentTimeMillis();
							
							Object result = method.invoke(exam, args);
							
							long end = System.currentTimeMillis();
							String message = (end - start) + "ms 시간이 걸렸습니다";
							System.out.println(message);
							
							return result;
						}
					}
					);
		
		System.out.printf("total is %d\n", proxy.total());
		System.out.printf("avg is %f\n", proxy.avg());
		
	}

}
