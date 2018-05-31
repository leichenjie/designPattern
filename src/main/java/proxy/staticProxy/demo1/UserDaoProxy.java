package proxy.staticProxy.demo1;

public class UserDaoProxy implements IUserDao {
    UserDao userDao;

    public UserDaoProxy(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("--开始事务...--");
        userDao.save();
        System.out.println("--结束事务...--");
    }
}
