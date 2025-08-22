package sample1;

public class DeveloperUser extends UserDecorator{

    public DeveloperUser(User user) {
        super(user);
    }

    @Override
    public void printPrivileges() {
        super.printPrivileges();
        System.out.println("Developer User: Can develop and deploy applications.");
    }
}
