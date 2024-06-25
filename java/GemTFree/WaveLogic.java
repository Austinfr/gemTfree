/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GemTFree;

public class WaveLogic {
    
    private int round = 0;
    
    public void chooseTower(Map m){
        //logic to choose goes here
        startWave(m);
    }
    
    public void startWave(Map m){
        round += 1;
        for(Enemy e : Enemy.createWaves(round)){
            m.spawnEnemy(e);
            // for when I create the class EnemySpawner.spawnEnemy();
        }
    }
}
