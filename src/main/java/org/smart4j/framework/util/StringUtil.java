package org.smart4j.framework.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by guanxiaoda on 17/5/19.
 */
public final class StringUtil {

    public static boolean isEmpty(String str){
        if(str!=null){
            str = str.trim();
        }
        return StringUtil.isEmpty(str);
    }

    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }


    public static String[] splitString(String str, String separator) {
        return StringUtils.splitByWholeSeparator(str, separator);
    }
}
