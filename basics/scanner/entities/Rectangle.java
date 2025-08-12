package basics.scanner.entities;

public class Rectangle {
    
    public Double altura;
    public Double largura;

    public Double Area(){
        return altura * largura;
    }

    public Double Perimetro(){
        return 2 * (largura + altura);
    }

    public Double Diagonal(){
        return Math.sqrt(largura * largura + altura * altura);
    }
}
