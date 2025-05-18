package mediator;

public class Application {

    public static void main(String[] args) {
        MessengerMediator mediator = new KakaoMediator();

        User user1 = new User(mediator, "user1");
        User user2 = new User(mediator, "user2");
        User user3 = new User(mediator, "user3");
        User user4 = new User(mediator, "user4");

        user1.joinToGroupChat();
        user2.joinToGroupChat();
        user3.joinToGroupChat();
        user4.joinToGroupChat();

        user1.requestSend("I am user 1");
        user2.requestSend("I am user 2");
        user3.requestSend("I am user 3");
        user4.requestSend("I am user 4");
    }
}
