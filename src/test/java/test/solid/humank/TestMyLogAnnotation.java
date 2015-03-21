package test.solid.humank;

import solid.humank.MyClass;
import solid.humank.MyLogAnnotationProcessor;

/**
 * Created by yikai on 2015/3/21.
 */
public class TestMyLogAnnotation {

    public static void main(String[] args) throws Exception {
        MyLogAnnotationProcessor.Processor(MyClass.class);
    }
}
