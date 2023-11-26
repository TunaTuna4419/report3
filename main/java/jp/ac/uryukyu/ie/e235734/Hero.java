package jp.ac.uryukyu.ie.e235734;

public class Hero extends LivingThing{
    public Hero (String name, int maximumHP, int attack) {
        super(name,maximumHP,attack);
    }
    @Override
    public void wounded(int damage){
        this.setHitPoint(this.getHitPoint()-damage);
        if(  this.getHitPoint()< 0 ) {
            this.setDead(true);
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", this.getName());
        }
    }

}

    