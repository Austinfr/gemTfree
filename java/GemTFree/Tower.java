package GemTFree;

import GemTFree.Enemy;
import java.awt.geom.Point2D.Double;

public class Tower {
    
    //we'll use this as a generic template and have the big combos in here
    private int range;
    private Damage damage;
    private double attackSpeed;
    private Point2D.Double location;
    
    //don't know if I'll need this
    public Tower(){}
    
    public Tower(int r, Damage d, int l, double as, Point2D loca){
        super(1, l);
        range = r;
        damage = d;
        attackSpeed = as;
        location = loca;
    }
    
    public void shoot(Enemy e){
        e.takeDamage(damage);
    }
    
    public void levelUp(int nr, int ndv, double nas){
        range = nr;
        this.level++;
        damage.setDamageValue(ndv);
        attackSpeed = nas;
    }

    //getters
    public int getRange(){return range;}
    public int getAttackSpeed(){return attackSpeed;}
    public Point2D getLocation(){return location;}
    
}
