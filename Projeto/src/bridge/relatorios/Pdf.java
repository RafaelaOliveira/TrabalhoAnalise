package bridge.relatorios;

public class Pdf extends Relatorio{

    @Override
    protected void exportar() {
        System.out.println("Exportando dados em PDF...");
    } 
}
