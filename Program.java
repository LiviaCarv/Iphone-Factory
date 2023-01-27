package IphoneFactoryExercise;

import IphoneFactoryExercise.IphoneFactory.IphoneFactory;
import IphoneFactoryExercise.IphoneFactory.TypeIphoneEnum;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IphoneFactory iphoneFactory = new IphoneFactory();

        System.out.println("Qual modelo de iphone deseja fabricar? ");
        System.out.println("1 - Iphone 9\n"
                            + "2 - IphoneX\n"
                            + "3 - Iphone 13 Mini");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                iphoneFactory.cadastrarIphone(TypeIphoneEnum.IPHONE_9).exibirDetalhes();
            case 2:
                iphoneFactory.cadastrarIphone(TypeIphoneEnum.IPHONE_X).exibirDetalhes();
            case 3:
                iphoneFactory.cadastrarIphone(TypeIphoneEnum.IPHONE_13_MINI).exibirDetalhes();
        }
    }
}
