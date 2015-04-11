package reflection.dynamicproxy;

/**
 * User: tracy
 * Time: 2015/4/11 16:10
 */
public class RealObject implements Interface {
    @Override
    public void doSomething(){
        System.out.println("doSomething");
    }

    @Override
    public void somethingElse(String arg){
        System.out.println("somethingEls "+arg);
    }
}
