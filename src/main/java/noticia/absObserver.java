package noticia;

import java.util.List;

abstract class absObserver {
    protected List<Topico> topicos;
    public abstract void update();
}
