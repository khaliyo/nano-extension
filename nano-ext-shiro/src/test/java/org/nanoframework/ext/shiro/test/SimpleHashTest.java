/*
 * Copyright 2015-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.nanoframework.ext.shiro.test;

import java.io.UnsupportedEncodingException;

import org.apache.shiro.crypto.hash.Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.Test;
import org.nanoframework.commons.support.logging.Logger;
import org.nanoframework.commons.support.logging.LoggerFactory;

/**
 * @author yanghe
 * @date 2015年12月9日 下午4:06:37
 */
public class SimpleHashTest {
	private Logger LOG = LoggerFactory.getLogger(SimpleHashTest.class);
	
	@Test
	public void test0() throws UnsupportedEncodingException {
		/** 加密类型(不区分大小写)、密码、私匙、加密次数 */
		Hash hash = new SimpleHash("MD5", "123456", "Nano Framework Extension Shiro Salt for user: [admin]", 2);
		LOG.debug(hash.toString());
	}
}
