package noticia;

import java.util.ArrayList;

public class Usuario extends absObserver {
    private String nome;
    public Usuario(String nome, Topico topico) {
        this.nome = nome;
        this.topicos = new ArrayList<Topico>();
        this.topicos.add(topico);
        Topico topicoInicial = this.topicos.get(0);
        topicoInicial.attach(this);
    }
    public void subscribe(Topico topico){
        topico.attach(this);
        topicos.add(topico);
    }
    public void unsubscribe(Topico topico){
        topico.detach(this);
        topicos.remove(topico);
    }
    @Override
    public void update() {
        System.out.println(this.nome + " recebeu uma notificação!");
    }
}
