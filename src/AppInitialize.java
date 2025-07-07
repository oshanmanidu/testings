public class AppInitialize {
    public static void main(String[] args) {
        String [] InitializePageQuestions = { "1)do u want to login", "2)do u want to signup","3)exit"};
        for (String Question : InitializePageQuestions) {
            System.out.println(Question);
        }
    }
}
