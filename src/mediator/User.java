package mediator;

public class User {

    private final MessengerMediator mediator;

    private final String name;

    public User(MessengerMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public boolean joinToGroupChat() {
        return mediator.addToGroupChat(this);
    }

    public void requestSend(String speak) {
        mediator.mediate(this + ": " + speak);
    }

    public void receive(String speak) {
        System.out.println(this + " received : " + speak);
    }

    @Override
    public String toString() {
        return this.name + " 사용자";
    }
}
