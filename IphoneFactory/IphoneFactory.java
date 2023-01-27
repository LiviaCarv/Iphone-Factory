package IphoneFactoryExercise.IphoneFactory;

import IphoneFactoryExercise.Iphones.Iphone;
import IphoneFactoryExercise.Iphones.Iphone13Mini;
import IphoneFactoryExercise.Iphones.Iphone9;
import IphoneFactoryExercise.Iphones.IphoneX;

public class IphoneFactory {

    public Iphone cadastrarIphone(TypeIphoneEnum type) {
        Iphone iphone;

        if (type == TypeIphoneEnum.IPHONE_9) {
            iphone = new Iphone9();
        } else if (type == TypeIphoneEnum.IPHONE_X) {
            iphone = new IphoneX();
        } else {
            iphone = new Iphone13Mini();
        }

        return iphone;
    }
}
