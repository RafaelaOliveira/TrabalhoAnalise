package strategy;

public class Portal implements ModoNotificacao {

    @Override
    public void notificar() {
        System.out.println("\nNotificando aluno através do PORTAL.");
    }   
}
