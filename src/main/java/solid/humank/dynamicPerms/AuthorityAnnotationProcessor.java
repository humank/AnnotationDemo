package solid.humank.dynamicPerms;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by yikai on 2015/3/21.
 */
public class AuthorityAnnotationProcessor {

    public static void processor(Class clz, String methodName) throws NoSuchMethodException, IllegalAccessException, InstantiationException {
        Method m = clz.getMethod(methodName,null);
        Annotation[] array = m.getAnnotations();
        for(Annotation ann : array){

            if(ann instanceof Authority){
                IBo tempBo =(IBo) ((Authority) ann).boName().newInstance();
                if("c".equals(((Authority) ann).authority())){
                    System.out.println("common bo applied");

                }else if("a".equals(((Authority) ann).authority())){
                    System.out.println("Advanced bo applied");
                }
                tempBo.doSomething();

            }

        }
    }
}
