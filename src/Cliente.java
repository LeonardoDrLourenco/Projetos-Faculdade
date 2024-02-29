import java.net.InterfaceAddress;

public class Cliente {

    public static void main(String[] args) {

        FactoryAparelhoEletronico fabricaTelevisao = new FabricaTelevisao();
        AparelhoEletronico televisao = fabricaTelevisao.criarAparelho();
        televisao.ligar();
        televisao.desligar();

        FactoryAparelhoEletronico fabricaRadio = new FabricaRadio();
        AparelhoEletronico radio = fabricaRadio.criarAparelho();
        radio.ligar();
        radio.desligar();

    }

}
