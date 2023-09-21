public class Main{
    private String placaVeiculos;
    private String modeloVeiculos;
    

    public void exibirMensagemPlaca(){
       placaVeiculos = javax.swing.JOptionPane.showInputDialog("digite a placa do Veiculo");
       
    }
     public void exibirMensagemModelo(){
       modeloVeiculos = javax.swing.JOptionPane.showInputDialog("digite o modelo do Veiculo");
    }

    public void setPlacaVeiculos(String placaVeiculos){
        this.placaVeiculos = placaVeiculos;
    }
    public void setModeloVeiculos(String modeloVeiculos){
        this.modeloVeiculos = modeloVeiculos;
    }

    public String getPlacaVeiculos() {
        return placaVeiculos;
    }
    public String getModeloVeiculos() {
        return modeloVeiculos;
    }


    
}