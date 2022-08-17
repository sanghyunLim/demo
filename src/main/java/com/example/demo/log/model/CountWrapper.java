package com.example.demo.log.model;

import com.example.demo.data.model.Data;
import java.util.Set;

public class CountWrapper {

	private static final Set<Class> SUPPORT_CLASS_SET = Set.of(Data.class);

	private int count;

	public static boolean supports(Object object) {
		return SUPPORT_CLASS_SET.contains(object.getClass());
	}

	public static CountWrapper instanceOf(Object object) {
		if (!supports(object)) {
			throw new IllegalArgumentException();
		}

		return new CountWrapper();
	}
}
