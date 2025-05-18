package mediator;

import java.util.ArrayList;
import java.util.List;

public class KakaoMediator implements MessengerMediator {

    private final List<User> room = new ArrayList<>();

    @Override
    public boolean addToGroupChat(User user) {
        return room.add(user);
    }

    @Override
    public void mediate(String speak) {
        for (User user : room) {
            user.receive(speak);
        }
    }
}
