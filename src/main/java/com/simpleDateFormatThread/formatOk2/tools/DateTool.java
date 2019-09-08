package com.simpleDateFormatThread.formatOk2.tools;

import java.text.SimpleDateFormat;

public class DateTool {
    private static ThreadLocal<SimpleDateFormat> t1 = new ThreadLocal<>();
    public static SimpleDateFormat getSimpleDateFormat(String datePattern) {
        SimpleDateFormat sdf = t1.get();
        if (sdf == null) {
            sdf = new SimpleDateFormat(datePattern);
            t1.set(sdf);
        }
        return sdf;
    }
}
