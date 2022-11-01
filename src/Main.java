public class Main {
    public static void main(String[] args) {
        System.out.println("main method runs");
        Chatbot bot1 = new Chatbot();
        Chatbot bot2 = new Chatbot("mybot");
        bot1.greeting();
        bot2.greeting();
        bot2.setName("差別用語");
        bot2.setName("rename");
        bot2.greeting();
        bot1.sleeping();
        bot2.sleeping();
    }
}
