package GemTFree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Map {
    
    private Random r;
    private Tower[] roundTowers = new Tower[5];
    private int gridSize;
    //this is just a grid if 0 no tower is placed,1 if it's taken
    private int[][] mapTowerPlacement;
    private Tower[] towersInMap = new Tower[]{};
    private int towersPerWave = 5;
    private int towersPlaced = 0;
    
    public Map(){
        this.gridSize = 10;
        this.mapTowerPlacement = new int[gridSize][gridSize];
    }
    
    public Map(int grid){
        this.gridSize = grid;
        this.mapTowerPlacement = new int[gridSize][gridSize];
    }
    
    public void placeTower(){
        if(towersPlaced < towersPerWave){
            //find the location somehow
            //update the grid so it's shown that somethings placed
            //mapTowerPlacement[][] = 1;
            Tower chosenTower = new Tower();
            
            roundTowers[towersPlaced] = chosenTower;
            
            towersInMap = Arrays.copyOf(towersInMap, towersInMap.length);
            
            towersInMap[towersInMap.length - 1] = chosenTower;
        }
    }
    
    private int checkPlayerBonuses(){
        return 0;
    }
    
    public void spawnEnemy(Enemy e){
        
    }
    
    public void takeDamage(){
        
    }
    
    public int getMapSize(){
        return gridSize;
    }
    
}
