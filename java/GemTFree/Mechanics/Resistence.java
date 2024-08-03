package main.java.GemTFree.Mechanics;

public class Resistence{

    private Damage.TYPE resist;
    private int resistPercentage;

    public Resistence(Damage.TYPE dt, int rp){
        resist = dt;
        resistPercentage = rp;
    }

    public boolean resists(Damage d){
        return d.getDamageType() == resist ? true : false;
    }

    public double getPercentage(){return (double)this.resistPercentage / 100;}

    public int calculateDamage(Damage d){
        return resists(d) ? (int)((double)d.getDamageValue() * getPercentage()) : d.getDamageValue();
    }

};