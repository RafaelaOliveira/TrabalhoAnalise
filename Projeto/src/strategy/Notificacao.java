package strategy;

public class Notificacao {
    
    private ModoNotificacao modo = new Portal();
    
     public void setModo(ModoNotificacao novoModo){
        this.modo = novoModo;
    }
    
    public void notificando(){
       modo.notificar();
    }
}
