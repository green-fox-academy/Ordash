package Comparator.Comparator2;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();

        Thing milk = new Thing("Get milk");
        Thing obstacles = new Thing("Remove the obstacles");
        Thing standUp = new Thing("Stand up");
        Thing eatbr = new Thing("b");
        Thing rtyu = new Thing("d");
        Thing ewterg = new Thing("c");

        fleet.add(milk);
        fleet.add(obstacles);
        fleet.add(standUp);
        fleet.add(eatbr);
        fleet.add(rtyu);
        fleet.add(ewterg);

        standUp.complete();
        rtyu.complete();
        ewterg.complete();
        obstacles.complete();

        fleet.sortArray();

        System.out.println(fleet);

        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

    }
}
