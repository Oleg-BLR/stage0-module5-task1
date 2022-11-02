package com.epam.mjc.stage0;

import com.epam.mjc.stage0.utils.Fridge;
import com.epam.mjc.stage0.utils.MyFridge;

public class FridgeAlgorithm {

    public static void main(String[] args) {

        MyFridge myFridge = new MyFridge();





//        Fridge myFrige = new FridgeIml();
//        myFrige.open();
//        myFrige.getMilk();
//        myFrige.close();

    }


    /**
     * This is a first task in this module. You need to get milk from a fridge =)
     * <p>
     * Call the methods of the Fridge object inside the fridgeAlgorithm method in the required logical order.
     * P.S All methods of interaction with the fridge can be found inside the {@see Fridge} class.
     */
    public void fridgeAlgorithm(Fridge fridge) {
        fridge.open();
        fridge.getMilk();
        fridge.close();
    }

}

