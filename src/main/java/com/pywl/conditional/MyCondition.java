package com.pywl.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Description: 我的条件：classpath下存在 test.properties
 *
 * @author dongpo: Talk is cheap. Show me the code.
 * @since 2021-02-01
 */
public class MyCondition implements Condition {
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		return context.getResourceLoader().getResource("classpath:test.properties").exists();
	}
}
