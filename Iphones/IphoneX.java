package IphoneFactoryExercise.Iphones;

public class IphoneX implements Iphone{

    private Integer sistemaOperacional;



    @Override
    public void exibirDetalhes() {
        System.out.println("Iphone X\n" +
                "Sistema Operacional: iOS 15\n" +
                "Tela: 5.4 polegadas\n" +
                "Memoria RAM: 4 GB");
    }
}
