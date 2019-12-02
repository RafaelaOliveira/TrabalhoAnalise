package projeto;

import observer.EsseVaiSerObservado;
import observer.Observador;
import observer.QueroObservar;
import bridge.relatorios.Pdf;
import bridge.relatorios.Relatorio;
import bridge.ZIP;
import strategy.Notificacao;
import strategy.ModoNotificacao;
import strategy.Email;

public class Projeto {

    public static void main(String[] args) {
        // Observer para monitorar alterações de notas
        Observador queroObservar = new QueroObservar();
        EsseVaiSerObservado esseVaiSerObservado = new EsseVaiSerObservado();
        esseVaiSerObservado.inscrever(queroObservar);
        esseVaiSerObservado.setDescricao("100");
        // Bridge para gerar um relatorio com a nova nota
        Relatorio r = new Pdf();
        r.setModoProcessar(new ZIP());
        r.criar();
        // Strategy para notificar o aluno da alteração de nota
        Notificacao n = new Notificacao();
        ModoNotificacao modoEmail =  new Email();
        n.setModo(modoEmail);
        n.notificando();
    }
    
}
