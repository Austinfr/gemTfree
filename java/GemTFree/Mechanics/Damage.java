package GemTFree;

public class Damage{

    public enum TYPE {
        NONE,
        PHYSICAL, 
        MAGICAL;
    };

    private TYPE damageType;

    public Damage(TYPE t){
        this.damageType = t;
    }
    
    public TYPE getDamageType(){
        return this.damageType;
    }
};