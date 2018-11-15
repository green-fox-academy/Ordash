// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
 class Bunnies2 {
    public static void main(String[] args) {
        System.out.println(bunnies2(3));

    }

    public static int bunnies2(int numOfBunnies) {
        if (numOfBunnies == 0) {
            return numOfBunnies;
        } else if (numOfBunnies%2 == 0) {

            return 3 + bunnies2(numOfBunnies-1);

        } else {

            return 2 + bunnies2(numOfBunnies - 1);

        }



    }
}
