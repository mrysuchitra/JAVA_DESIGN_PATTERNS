package sample1;

public class Login {

    public static void main(String args[]){

        var basicUser = new BasicUser();
        basicUser.printPrivileges();

        System.out.println();

        var adminUser = new AdminUser(basicUser);
        adminUser.printPrivileges();

        System.out.println();

        var developerUser = new DeveloperUser(adminUser);
        developerUser.printPrivileges();


    }

}
