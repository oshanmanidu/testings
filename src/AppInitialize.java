import java.util.Scanner;

public class AppInitialize {

    //=======databse==========
    static String [][] users= new String[3][2];
    //=======database=======

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String [] InitializePageQuestions = { "1)do u want to login", "2)do u want to signup","3)exit"};
        for (String Question : InitializePageQuestions) {
            System.out.println(Question);
        }
        int userInput = input.nextInt();

        switch (userInput) {
            case 1:
            login();
                break;

            case 2:
                if (register()){
                    opendahsboard();
            }
                break;

            case 3:break;
            default:
                System.out.println("wrong input");return;
        }
    }

    //login process
    public static boolean login(){
        Scanner user = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String username = user.nextLine();
        System.out.println("Please enter your password: ");
        String password = user.nextLine();

        for (String[] strings : users) {
            if (strings[0] != null & strings[0].equals(username)) {
                if (strings[1] != null & strings[1].equals(password)) {
                    System.out.println("Welcome " + username);
                    return true;
                } else {
                    System.out.println("Wrong password");
                }
            }
        System.out.println("user not fount");
        return false;
    }return true;
    }

    //register process
    public static boolean register(){
        Scanner input = new Scanner(System.in);
        if(users[users.length-1][0]!=null){
            System.out.println("Database full ");
            return false;
        }
        System.out.println("Please enter your username: ");
        String username = input.nextLine();
        System.out.println("Please enter your password: ");
        String password = input.nextLine();

        for (int i = 0; i < users.length; i++) {
            if ( users[i][0]==null){
                users[i][0] = username;
                users[i][1] = password;
                return true;
            }else {
                if (users[i][0].equalsIgnoreCase(username)){
                    System.out.println("Username is already in use");
                    return false;
                }
            }
        }
        return false;
    }

    //dashboard process
    public static void opendahsboard(){
        System.out.println("inside the dashboard");
    }

}
