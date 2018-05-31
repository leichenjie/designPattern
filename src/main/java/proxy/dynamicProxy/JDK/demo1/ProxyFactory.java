package proxy.dynamicProxy.JDK.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyFactory implements InvocationHandler {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(target,args);
        after();
        return result;
    }

    public void before() {
        System.out.println(" 开始事务...");
    }

    public void after() {
        System.out.println("结束事务");
    }
}
