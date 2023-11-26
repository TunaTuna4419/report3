package jp.ac.uryukyu.ie.e235734;

public class Enemy extends LivingThing{
    public Enemy (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }
    @Override
    public void wounded(int damage){
       this.setHitPoint(this.getHitPoint()-damage);
       if( getHitPoint() < 0 ) {
           this.setDead(true);
           System.out.printf("モンスター%sは倒れた。\n", getName());
       }
   }

}