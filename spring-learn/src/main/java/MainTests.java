import config.TestBeanConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTests {

	public static void main(String[] args) {
		ApplicationContext application =
				new AnnotationConfigApplicationContext(TestBeanConfig.class);

		for (String beanDefinitionName : application.getBeanDefinitionNames()) {
			System.out.println("beanDefinitionName=" + beanDefinitionName);


			//beanDefinitionName=org.springframework.context.annotation.internalConfigurationAnnotationProcessor
			// 													        internalConfigurationAnnotationProcessor
			//beanDefinitionName=org.springframework.context.annotation.internalAutowiredAnnotationProcessor
			//                                                          internalAutowiredAnnotationProcessor
			//beanDefinitionName=org.springframework.context.event.internalEventListenerProcessor
			//                                                     internalEventListenerProcessor
			//beanDefinitionName=org.springframework.context.event.internalEventListenerFactory
			//                                                     internalEventListenerFactory
			//beanDefinitionName=testBeanConfig
		}

	}
}
