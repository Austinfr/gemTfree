package main.java.GemTFree.Mechanics;

import java.util.Random;

import GemTFree.Tower;
import GemTFree.Towers.*;

public class GameMath {
    
    public GameMath(){}
    
    public Tower chooseTower(){

        switch (new Random().nextInt(8)) {
            case 0:
                return new Amethyst();
            case 1:
                return new Diamond();
            case 2:
                return new Aquamarine();
            case 3:
                return new Emerald();
            case 4:
                return new Opal();
            case 5:
                return new Ruby();
            case 6:
                return new Sapphire();
            case 7:
                return new Topaz();
            default:
                break;
        }

        return null;
    }

}
