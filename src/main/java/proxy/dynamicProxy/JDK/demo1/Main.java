package proxy.dynamicProxy.JDK.demo1;

import proxy.staticProxy.demo1.IUserDao;
import proxy.staticProxy.demo1.UserDao;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        IUserDao iUserDao = new UserDao();
        ProxyFactory proxyFactory = new ProxyFactory(iUserDao);
        IUserDao iUserDaoProxy = (IUserDao) Proxy.newProxyInstance(iUserDao.getClass().getClassLoader(),iUserDao.getClass().getInterfaces(),proxyFactory);
        iUserDaoProxy.save();
    }
}
