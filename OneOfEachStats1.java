public class OneOfEachStats1 {
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        int totalChildren = 0;
        int twoChildren = 0;
        int threeChildren = 0;
        int fourOrMoreChildren = 0;
        int mode = 0;
        int modeCount = 0;

        for (int i = 0; i < T; i++) {
            boolean hasBoy = false;
            boolean hasGirl = false;
            int childrenCount = 0;

            while (!hasBoy || !hasGirl) {
                if (Math.random() < 0.5) {
                    hasBoy = true;
                } else {
                    hasGirl = true;
                }
                childrenCount++;
            }

            totalChildren += childrenCount;

            
            if (childrenCount == 2) {
                twoChildren++;
                if (twoChildren > modeCount) {
                    mode = 2;
                    modeCount = twoChildren;
                }
            } else if (childrenCount == 3) {
                threeChildren++;
                if (threeChildren > modeCount) {
                    mode = 3;
                    modeCount = threeChildren;
                }
            } else if (childrenCount >= 4) {
                fourOrMoreChildren++;
                if (fourOrMoreChildren > modeCount) {
                    mode = 4;
                    modeCount = fourOrMoreChildren;
                }
            }
        }

        double average = (double) totalChildren / T;

        System.out.println("Average: " + average + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + twoChildren);
        System.out.println("Number of families with 3 children: " + threeChildren);
        System.out.println("Number of families with 4 or more children: " + fourOrMoreChildren);
        System.out.println("The most common number of children is: " + (mode == 4 ? "4 or more" : mode));
    }
}
