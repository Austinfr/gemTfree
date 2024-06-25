package GemTFree;

import java.util.Random;

public class Player extends Entity {
    
    private Random r = new Random();
    
    private int health = 200, speed = 30, level = 1;
    
    private int[][] towerChancesPerLevel = {
        {80, 20, 0, 0, 0},//level 1
        {60, 20, 20, 0, 0},//level 2
        {40, 20, 20, 20, 0},//level 3
        {30, 20, 20, 20, 10},//level 4
        {20, 20, 20, 20, 20}//level 5
    };
    
    public Player(){
        super();
        setUpStats(health, speed, level);
    }
    
    public void placeTower(){
        //logic for randomGeneration
        int towerLevel = r.nextInt(100);
        for(int i = 0; i < 5; i++){
            if((towerLevel -= towerChancesPerLevel[level - 1][i]) <= 0){
                towerLevel = ++i;
                i = 5;
            }
        }
        
        //uses TowerLevel for the right level
        
    }
    
}
