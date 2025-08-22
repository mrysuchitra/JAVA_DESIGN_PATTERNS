package sample1;

public class BasicUser implements User{

    @Override
    public void printPrivileges() {
        System.out.println("Basic User: Can view content.");
    }
}
