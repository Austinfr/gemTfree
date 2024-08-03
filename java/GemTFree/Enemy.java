package GemTFree;

public class Enemy extends Entity{

    private double speed;
    
    public Enemy(int h, int l, int s){
        super(h, l);
        speed = s;
    }
    
    public static Enemy[] createWaves(int wave){
        switch (wave){
            case 1:
                return new Enemy[]{
                    new Enemy(1,1,1)
                };
            case 2:
                return new Enemy[]{
                    new Enemy(2,2,2)
                };
            case 3:
                return new Enemy[]{
                    new Enemy(3,3,3)
                };
            case 4:
                return new Enemy[]{
                    new Enemy(4,4,4)
                };
            case 5:
                return new Enemy[]{
                    new Enemy(5,5,5)
                };
            case 6:
                return new Enemy[]{
                    new Enemy(6,6,6)
                };
            case 7:
                return new Enemy[]{
                    new Enemy(7,7,7)
                };
            case 8:
                return new Enemy[]{
                    new Enemy(8,8,8)
                };
            case 9:
                return new Enemy[]{
                    new Enemy(9,9,9)
                };
            case 10:
                return new Enemy[]{
                    new Enemy(10,10,10)
                };
            case 11:
                return new Enemy[]{
                    new Enemy(11,11,11)
                };
            case 12:
                return new Enemy[]{
                    new Enemy(12,12,12)
                };
               
        }
        
        //should never reach this
        return null;
    }
    
    public void processStatusEffects(){
        
    }
    
    public enum statusEffects {
        PIERCE,
        SLOW,
        POISON;
    }
    
    public enum buffs {
        INVISIBILITY,
        VITALITY,
        EVASION,
        DISARM,
        REFRACTION,
        MAGIC_IMMUNITY,
        PHYSICAL_IMMUNITY,
        HIGH_ARMOUR,
        UNTOUCHABLE;
    }

    public double getSpeed(){
        return speed;
    }
    
}
