package com.pywl.service.impl;

import com.pywl.service.MessagePrint;

/**
 * Description: 你的消息打印实现类
 *
 * @author dongpo: Talk is cheap. Show me the code.
 * @since 2021-02-01
 */
public class YourMessagePrint implements MessagePrint {
	@Override
	public String showMessage() {
		return "test.properties 不存在";
	}
}
