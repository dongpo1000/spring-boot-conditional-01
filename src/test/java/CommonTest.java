import com.pywl.config.ConditionConfig;
import com.pywl.service.MessagePrint;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Description: 测试类：普通测试类，不需启动应用
 *
 * @author dongpo: Talk is cheap. Show me the code.
 * @date 2021-02-01
 * @since 1.0
 */
@SpringBootTest
public class CommonTest {

	@Test
	public void test1() throws Exception {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
		MessagePrint messagePrint = context.getBean(MessagePrint.class);
		String message = messagePrint.showMessage();
		System.out.println("message = " + message);
	}

	@Test
	public void test2() throws Exception {

	}

	@Test
	public void test3() throws Exception {

	}

}