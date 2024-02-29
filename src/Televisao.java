public class Televisao implements AparelhoEletronico {

    @Override
    public void ligar() {
        System.out.println("A televisão está ligada!");
    }

    @Override
    public void desligar() {
        System.out.println("A televisão está desligada!");
    }

}