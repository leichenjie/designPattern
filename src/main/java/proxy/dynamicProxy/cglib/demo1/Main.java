package proxy.dynamicProxy.cglib.demo1;

import proxy.staticProxy.demo1.UserDao;

public class Main {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        UserDao proxy = (UserDao) new CglibProxy(userDao).getProxyInstance();
        proxy.save();
    }
}
