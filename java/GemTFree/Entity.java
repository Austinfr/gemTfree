package GemTFree;

public class Entity {
    
    private int Health, Level;
    private boolean isAlive;
    private Resistence resist;
    
    //for basic bs
    //mostly player and tower
    public Entity(){}
    
    public Entity(int h, int l){
        Health = h;
        Level = l;
        isAlive = true;
    }
    
    public void takeDamage(Damage damageTaken){
        Health -= resist.calculateDamage(damageTaken);
    }
    
    //setters
    public void setResitance(Resistence r){this.resist = r;}
    public void setResitance(Damage.TYPE r, int rp){this.resist = new Resistence(r, rp);}
    
    private void setHealth(int h){this.Health = h;}
    private void setLevel(int l){this.Level = l;}
    public void setUpStats(int h, int l){setHealth(h);setLevel(l);}

    public void kill(){this.isAlive = false;}
    
    
    //making the getters one line
    //don't like it write your own code
    public int getHealth(){return Health;}
    public int getLevel(){return Level;}
    public boolean isAlive(){return isAlive;}
    public Resistence getResistence(){return resist;}
    
}
