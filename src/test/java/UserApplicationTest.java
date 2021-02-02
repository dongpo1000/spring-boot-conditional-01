import com.pywl.UserApplication;
import com.pywl.service.MessagePrint;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Description: 测试类：可以注入组件
 *
 * @author dongpo: Talk is cheap. Show me the code.
 * @date 2021-02-01
 * @since 1.0
 */
@SpringBootTest(classes = {UserApplication.class})
@RunWith(SpringRunner.class)
public class UserApplicationTest {

	@Autowired
	private MessagePrint messagePrint;

	@Test
	public void test1() throws Exception {
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