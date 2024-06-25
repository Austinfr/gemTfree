package GemTFree;

public class Entity {
    
    private int Health, Speed, Level;
    private boolean isAlive;
    private Damage resist;
    
    //for basic bs
    //mostly player and tower
    public Entity(){}
    
    public Entity(int h, int s, int l){
        this.Health = h;
        this.Speed = s;
        this.Level = l;
        this.isAlive = true;
    }
    
    public void takeDamage(int damageTaken){
        if((this.Health -= damageTaken) <= 0){
            isAlive = false;
        }
    }
    
    //setters
    public void setResitances(Damage r){this.resist = r;}
    
    private void setHealth(int h){this.Health = h;}
    private void setSpeed(int s){this.Speed = s;}
    private void setLevel(int l){this.Level = l;}
    public void setUpStats(int h, int s, int l){setHealth(h);setSpeed(s);setLevel(l);}
    
    
    //making the getters one line
    //don't like it write your own code
    public int getHealth(){return Health;}
    public int getSpeed(){return Speed;}
    public int getLevel(){return Level;}
    
}
