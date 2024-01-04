import java.util.Random;
public class OneOfEachStats {
public static void main (String[] args) {
// Gets the two command-line arguments
int T = Integer.parseInt(args[0]);
int seed = Integer.parseInt(args[1]);
// Initailizes a random numbers generator with the given seed value Random generator = new Random(seed);
stats(T, generator);
}
public static void stats(int times, Random seed){
double averageChildren = 0;
int FamiliesWithTwo = 0;
int FamiliesWithThree = 0;
int familiesWithFourOrMore = 0; 
double totalChildren = 0;
for (int i = 0; i < times; i++) {
double numOfBoys = 0;
double numOFGirls = 0;
while (numOfBoys == 0 || numOFGirls == 0) {
double rnd = seed.nextDouble(); 
if (rnd < 0.5) {
numOfBoys++; }
else{ numOFGirls++;
}
totalChildren++; }
if (numOfBoys + numOFGirls == 2) { FamiliesWithTwo++;
}
else if (numOfBoys + numOFGirls == 3) {
FamiliesWithThree++; }
else if (numOfBoys + numOFGirls >= 4) { familiesWithFourOrMore++;
} }
averageChildren = totalChildren / times;
String mostCommonAmountOfChildren = "The most common number of children is ";
if (FamiliesWithTwo > FamiliesWithThree && FamiliesWithTwo > familiesWithFourOrMore) {
mostCommonAmountOfChildren += 2 + "."; }
else if (FamiliesWithThree > FamiliesWithTwo && FamiliesWithThree > familiesWithFourOrMore) {
mostCommonAmountOfChildren += 3 + "."; }
else if (familiesWithFourOrMore > FamiliesWithTwo && familiesWithFourOrMore > FamiliesWithThree) {
mostCommonAmountOfChildren += 4 + " or more."; }
System.out.println("Average: " + averageChildren + " children to get at least one of each gender.");
System.out.println("Number of families with 2 children: " + FamiliesWithTwo); 
System.out.println("Number of families with 3 children: " + FamiliesWithThree); 
System.out.println("Number of families with 4 or more children: " + familiesWithFourOrMore); 
System.out.println(mostCommonAmountOfChildren);
} }
