import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainTest {

	@Bean
	public User user(){
		return new User();
	};

	@Test
	public void main() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainTest.class);
		String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
		for(String name:beanDefinitionNames){
			System.out.println(name);
		}
	}
}

class User{

	private String name;

	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}