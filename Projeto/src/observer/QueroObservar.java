package observer;

public class QueroObservar implements Observador{

    @Override
    public void notificar() {
        System.out.println("Alteração de Notas:");
    }

    @Override
    public void notificar(Object novoValor) {
        System.out.println("O novo valor é: "+novoValor);
    }
    
}
