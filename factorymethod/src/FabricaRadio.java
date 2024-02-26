public class FabricaRadio implements FactoryAparelhoEletronico {

    @Override
    public AparelhoEletronico criarAparelho() {
        return new Radio();
    }

}