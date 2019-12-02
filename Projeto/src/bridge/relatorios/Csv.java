package bridge.relatorios;

public class Csv extends Relatorio{

    @Override
    protected void exportar() {
        System.out.println("Exportando dados em CSV...");
    }
}
