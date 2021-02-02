package com.pywl.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Description: 你的条件：classpath下不存在test.properties
 *
 * @author dongpo: Talk is cheap. Show me the code.
 * @since 2021-02-01
 */
public class YourCondition implements Condition {
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		return !context.getResourceLoader().getResource("classpath:test.properties").exists();
	}
}
