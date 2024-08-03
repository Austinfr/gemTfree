package main.java.GemTFree.Mechanics;

public class Damage{

    public enum TYPE {
        NONE,
        PHYSICAL, 
        MAGICAL;
    };

    private TYPE damageType;
    private int damageValue;

    public Damage(TYPE t, int i){
        this.damageType = t;
        this.damageValue = i;
    }

    public void setDamageValue(int ndv){
        damageValue = ndv;
    }
    
    public TYPE getDamageType(){
        return this.damageType;
    }

    public int getDamageValue(){
        return this.damageValue;
    }
};