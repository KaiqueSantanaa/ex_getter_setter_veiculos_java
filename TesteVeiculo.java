public class TesteVeiculo{
    public static void main(String args[]){
        Main veiculosMain = new Main();
        Main veiculosMain2 = new Main();

        veiculosMain.exibirMensagemPlaca();
        String placa = veiculosMain.getPlacaVeiculos();

        veiculosMain.exibirMensagemModelo();
        String modelo = veiculosMain.getModeloVeiculos();

         veiculosMain2.exibirMensagemPlaca();
        String placa2 = veiculosMain2.getPlacaVeiculos();

        veiculosMain2.exibirMensagemModelo();
        String modelo2 = veiculosMain2.getModeloVeiculos();
        

        

       
        
       
       System.out.printf("Placa: %s\n", placa); 
       System.out.printf("modelo: %s\n", modelo); 
       System.out.printf("Placa2: %s\n", placa2); 
       System.out.printf("modelo2: %s\n", modelo2); 
    }

}