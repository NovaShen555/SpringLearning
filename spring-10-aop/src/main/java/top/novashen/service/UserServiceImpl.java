package top.novashen.service;

public class UserServiceImpl implements Userservice{
    @Override
    public void add() {
        System.out.println("add");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void query() {
        System.out.println("query");
    }

    @Override
    public void update() {
        System.out.println("update");
    }
}
