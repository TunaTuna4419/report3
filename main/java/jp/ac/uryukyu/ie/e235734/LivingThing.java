package jp.ac.uryukyu.ie.e235734;

public class LivingThing {

    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public LivingThing (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです\n", name, maximumHP, attack);
    }
    //getter
    public boolean isDead(){ 
        return dead;
    }
    public String getName(){
        return this.name;
    }
    public int getHitPoint(){
        return this.hitPoint;
    }
    public int getAttack(){
        return this.attack;
    }
    //setter
    public void setName(String name){
        this.name=name;
    }
    public void setHitPoint(int hitPoint){
        this.hitPoint=hitPoint;
    }
    public void setAttack(int attack){
        this.attack=attack;
    }
    public void setDead(boolean dead){
        this.dead=dead;
    }

    public void attack(LivingThing opponent){
        if(this.isDead()==false){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃。%sに%dのダメージを与えた\n", this.getName(), opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
    public void wounded(int damage){
        this.setHitPoint(this.getHitPoint()-damage);
        if( this.getHitPoint()< 0 ) {
            dead=true;
            System.out.printf("%sは倒れた。\n", this.name);
        }
    }

}
