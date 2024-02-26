public class Radio implements AparelhoEletronico {

    @Override
    public void ligar() {
        System.out.println("O rádio está ligado!");
    }

    @Override
    public void desligar() {
        System.out.println("O rádio está desligado!");
    }

}