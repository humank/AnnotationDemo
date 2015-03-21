package test.solid.humank.dynamicPerms;

import org.junit.Test;
import solid.humank.dynamicPerms.AuthorityAnnotationProcessor;
import solid.humank.dynamicPerms.MyAction;

/**
 * Created by yikai on 2015/3/21.
 */

public class TestDynamicPerms {

    @Test
    public void tryCommonPermission() throws NoSuchMethodException, IllegalAccessException, InstantiationException {
        //MyAction.commonAuthorityMethod();
        AuthorityAnnotationProcessor.processor(MyAction.class,"commonAuthorityMethod");

    }

    @Test
    public void tryAdvancedPermission() throws NoSuchMethodException, IllegalAccessException, InstantiationException {
        //MyAction.advancedAuthorityMethod();
        AuthorityAnnotationProcessor.processor(MyAction.class,"advancedAuthorityMethod");
    }
}
