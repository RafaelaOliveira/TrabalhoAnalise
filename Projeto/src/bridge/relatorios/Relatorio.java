package bridge.relatorios;

import bridge.ModoProcessamento;

public abstract class Relatorio {
    private ModoProcessamento modoProcessar;

    public void setModoProcessar(ModoProcessamento modo) {
        this.modoProcessar = modo;
    }
    
    private void salvar(){
        System.out.println("\nSalvando as alterações da nota do aluno...");
    }
    
    protected abstract void exportar();
    
    private void processar(){
        modoProcessar.processar();
    }
    
    public void criar(){
        salvar();
        exportar();
        processar();
    }
    
}
