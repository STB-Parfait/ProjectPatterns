package noticia;

public class testeObserver {
    public static void main(String[] args) {

        Topico tecnologia = new Topico();
        Topico politica = new Topico();

        Usuario mateus = new Usuario("mateus",  tecnologia);
        Usuario joao = new Usuario("joao",  tecnologia);

        tecnologia.fazerPostagem();

        joao.unsubscribe(tecnologia);
        joao.subscribe(politica);

        politica.fazerPostagem();

    }
}
