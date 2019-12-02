package strategy;

public class Email implements ModoNotificacao {

    @Override
    public void notificar() {
        System.out.println("\nNotificando aluno através do EMAIL.");
    }   
}
