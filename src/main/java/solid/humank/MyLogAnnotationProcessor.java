package solid.humank;

import java.lang.reflect.Method;

/**
 * Created by yikai on 2015/3/21.
 */
public class MyLogAnnotationProcessor {

    public static void Processor(Class clz) throws Exception{

        for(Method m: clz.getMethods()){
            if(m.isAnnotationPresent(MyLog.class)){
                m.invoke(null);
                System.out.println("hey !!!... annotation is detected");
            }else{
                if(m.getName().contains("method")){
                    m.invoke(null);
                }
            }
        }
    }
}
