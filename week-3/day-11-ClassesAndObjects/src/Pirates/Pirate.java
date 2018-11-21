package Pirates;

public class Pirate {

    private int lvlOfRum;
    private boolean isDead = false;
    private boolean isPassedOut = false;
    private boolean isCaptain;

    @Override
    public String toString() {
        return "Pirate{" +
                "lvlOfRum=" + lvlOfRum +
                ", isDead=" + isDead +
                ", isPassedOut=" + isPassedOut +
                ", isCaptain=" + isCaptain +
                '}';
    }


    public Pirate(boolean isCaptain) {
        this.isCaptain = isCaptain;
        if(isCaptain){
            this.lvlOfRum = 2;
        }
    }

    public boolean isDead(){
        return isDead;
    }

    public boolean isPassedOut() {
        return isPassedOut;
    }

    public int getLevelOfRum(){
        return lvlOfRum;
    }

    public void drinkSomeRum() {
        if (!isDead) {
            lvlOfRum++;
        }
    }

    public void howIsItGoingMate() {
        if(!isDead) {

            if (lvlOfRum <= 5 && !isCaptain) {
                //System.out.println("Pour me anudder!");
                drinkSomeRum();
            } else if (lvlOfRum > 5 && !isCaptain){
                //System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
                passOut();
            } else if (lvlOfRum < 10){
                //System.out.println("Pour me already!!!!!!!!!!!!");
                drinkSomeRum();
                drinkSomeRum();
            } else if (lvlOfRum > 10){
                passOut();
            }
        }
    }

    public void die() {
        isDead = true;

    }

    public void passOut() {
        if (!isDead) {
            isPassedOut = true;
            lvlOfRum = 0;
        }
    }

    public void brawl(Pirate anotherPirate) {
        int threeOption = (int) (Math.random()*3+1);
        if (!isCaptain && !isDead) {
            if (threeOption == 1) {
                die();
            } else if (threeOption == 2) {
                anotherPirate.die();
            } else if (threeOption == 3) {
                passOut();
                anotherPirate.passOut();
            }
        } else if (isCaptain && !isDead){
            drinkSomeRum();
        }
    }

}
