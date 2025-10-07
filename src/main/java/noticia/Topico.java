package noticia;

import java.util.ArrayList;
import java.util.List;

public class Topico {
    private List<absObserver> users = new ArrayList<absObserver>();
    public void notifyUsers(){
        for(absObserver user : users){
            user.update();
        }
    }
    public void fazerPostagem(){
        notifyUsers();
    }
    public void attach(absObserver user) {
        users.add(user);
    }
    public void detach(absObserver user) {
        users.remove(user);
    }
}
