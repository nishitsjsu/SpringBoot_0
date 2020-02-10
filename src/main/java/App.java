import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args){
        ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
        GreeterClass gc = (GreeterClass) factory.getBean("mrBean");
        System.out.println(gc.getGreeting());
    }
}
