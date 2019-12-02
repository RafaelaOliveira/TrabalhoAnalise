package observer;

import java.util.ArrayList;
import java.util.List;

public class EsseVaiSerObservado {
     private List<Observador> listaDeObservadores = new ArrayList<>();

    private String descricao;

        private void notifcarTodos(Object novoValor) {
        for (Observador observador : listaDeObservadores) {
            observador.notificar();
            observador.notificar(novoValor);
        }
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
        notifcarTodos(descricao);
    }

    public void inscrever(Observador observador) {
        listaDeObservadores.add(observador);
    }
}
