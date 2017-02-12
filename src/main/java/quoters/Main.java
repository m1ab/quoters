package quoters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by misha on 12.02.17.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
//        while (true) {
//            Thread.sleep(2000);
//            context.getBean(Quoter.class).sayQuote();
//        }
    }
}
