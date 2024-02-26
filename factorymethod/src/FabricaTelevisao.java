public class FabricaTelevisao implements FactoryAparelhoEletronico {

    @Override
    public AparelhoEletronico criarAparelho() {
        return new Televisao();
    }

}