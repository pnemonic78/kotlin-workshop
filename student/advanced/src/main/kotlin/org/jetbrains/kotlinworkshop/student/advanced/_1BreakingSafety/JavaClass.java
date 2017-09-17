package org.jetbrains.kotlinworkshop.student.advanced._1BreakingSafety;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;

public class JavaClass {
    public String getValue() {
        throw new NullPointerException();
    }

    public static void dangerousJavaMethod(List<Integer> list) {
        throw new NotImplementedException();
    }
}
