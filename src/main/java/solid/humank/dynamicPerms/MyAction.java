package solid.humank.dynamicPerms;

/**
 * Created by yikai on 2015/3/21.
 */
public class MyAction {

    public static IBo bo = new CommonBo();

    @Authority(authority = "c",boName = CommonBo.class)
    public static void commonAuthorityMethod(){
        bo.doSomething();
    }

    @Authority(authority = "a", boName = AdvancedBo.class)
    public static void advancedAuthorityMethod(){
        bo.doSomething();
    }

}
