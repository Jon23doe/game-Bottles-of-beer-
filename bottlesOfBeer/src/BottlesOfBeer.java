public class BottlesOfBeer {

    public static void main(String[] args) {
        int numOfBeers = 99;
        String words = "bottles of beer";

        while (numOfBeers > 0) {

            if (numOfBeers == 1)
                words = "bottle of beer";

            System.out.println(numOfBeers + " " + words + " on the wall");
            System.out.println(numOfBeers + " " + words);
            System.out.println("take one down");
            System.out.println("pass it around\n");
            numOfBeers -= 1;

        }
        System.out.println("No more bottles of beer on the wall.");
        System.out.println("No more bottles of beer.");
        System.out.println("Go to the store and buy some more.");
    }
}