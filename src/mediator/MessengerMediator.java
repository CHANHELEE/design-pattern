package mediator;

public interface MessengerMediator {

    boolean addToGroupChat(User user);

    void mediate(String speak);
}
