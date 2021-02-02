package com.pywl.config;

import com.pywl.conditional.MyCondition;
import com.pywl.conditional.YourCondition;
import com.pywl.service.MessagePrint;
import com.pywl.service.impl.MyMessagePrint;
import com.pywl.service.impl.YourMessagePrint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Description: 配置类
 *
 * @author dongpo: Talk is cheap. Show me the code.
 * @since 2021-02-01
 */
@Configuration
public class ConditionConfig {

	@Bean
	@Conditional(MyCondition.class)
	public MessagePrint myMessagePrint(){
		return new MyMessagePrint();
	}

	@Bean
	@Conditional(YourCondition.class)
	public MessagePrint yourMessagePrint(){
		return new YourMessagePrint();
	}
}
