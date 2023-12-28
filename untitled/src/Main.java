public class Main {
    public static void main(String[] args) {

        String[] wordListOne = {"24/7", "multi-Tier", "30,000 foot", "B-to-B", "win-win",
                "front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};

        String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric",
                "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked",
                "focussed", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};

        String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency",
                "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};

        int ListOneLength = wordListOne.length;
        int ListTwoLength = wordListTwo.length;
        int ListThreeLength = wordListThree.length;

        int RandOne =  (int) (Math.random() * ListOneLength);
        int RandTwo =  (int) (Math.random() * ListTwoLength);
        int RandThree =  (int) (Math.random() * ListThreeLength);

        String str = wordListOne[RandOne] + wordListTwo[RandTwo] + wordListThree[RandThree];

        System.out.println("our new capture is: " + str);

    }
}