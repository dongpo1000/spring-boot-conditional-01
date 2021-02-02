package com.pywl.service.impl;

import com.pywl.service.MessagePrint;

/**
 * Description: 我的消息打印实现类
 *
 * @author dongpo: Talk is cheap. Show me the code.
 * @since 2021-02-01
 */
public class MyMessagePrint implements MessagePrint {
	@Override
	public String showMessage() {
		return "test.properties 存在。";
	}
}
