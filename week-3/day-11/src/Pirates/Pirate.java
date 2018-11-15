package Pirates;

public class Pirate {

    int lvlOfRum;
    boolean isDead = false;
    boolean isPassedOut = false;
    boolean isCaptain;

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
    }

    public void drinkSomeRum() {
        if (isDead == false) {
            lvlOfRum++;
        }
    }

    public void howIsItGoingMate() {
        if(isDead == false) {

            if (lvlOfRum < 5 && isCaptain == false) {
                //System.out.println("Pour me anudder!");
                drinkSomeRum();
            } else if (lvlOfRum < 10 && isCaptain == true){
                //System.out.println("Pour me already!!!!!!!!!!!!");
                drinkSomeRum();
                drinkSomeRum();
            } else if (lvlOfRum > 4 && isCaptain == false){
                //System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
                passOut();
            }

        }
    }

    public void die() {
        isDead = true;

    }

    public void passOut() {
        if (isDead == false) {
            isPassedOut = true;
        }


    }

    public void brawl(Pirate anotherPirate) {
        int threeOption = (int) (Math.random()*3+1);
        if (isCaptain == false && isDead == false) {
            if (threeOption == 1) {
                die();
            } else if (threeOption == 2) {
                anotherPirate.die();
            } else if (threeOption == 3) {
                passOut();
                anotherPirate.passOut();
            }
        } else if (isCaptain == true && isDead == false){
            drinkSomeRum();
        }
    }

}
