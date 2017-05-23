package org.smart4j.framework.helper;

import org.smart4j.framework.util.ClassUtil;

import java.util.Set;

/**
 * Created by Administrator on 2017/5/23.
 */
public final class ClassHelper {

    private static final Set<Class<?>> CLASS_SET;

    static{
        String basePackage = ConfigHelper.getAppBasePackage();
        CLASS_SET = ClassUtil.getClassSet(basePackage);
    }
}
