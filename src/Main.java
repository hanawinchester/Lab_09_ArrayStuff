import java.util.Random;
import java.util.Scanner;

public class Main {
    public static double getAverage(int values[]) {
        double sum1 = 0;
        for (int e = 0; e < values.length; e++) {
            sum1 = sum1 + values[e];
        }
        double ave1 = sum1 / values.length;
        return ave1;
    }

    public static int min(int values[]) {
        int min1 = values[0];

        for (int e = 0; e < values.length; e++) {
            if (min1 > values[e]) {
                min1 = values[e];
            }
        }
        return min1;
    }

    public static int max(int values[]) {

        int max2 = values[0];

        for (int e = 0; e < values.length; e++) {
            if (max2 < values[e]) {
                max2 = values[e];
            }
        }
        return max2;
    }

    public static int occurranceScan(int values[], int target) {
        int timesFound1 = 0;
        for (int e = 0; e < values.length; e++) {
            if (values[e] == target) {
                timesFound1 = timesFound1 + 1;
            }
        }
        return timesFound1;
    }

    public static int sum(int values[]) {
        int sum2 = 0;
        for (int e = 0; e < values.length; e++) {
            sum2 = sum2 + values[e];
        }
        return sum2;
    }

    public static boolean contains(int values[], int target) {
        Boolean contains = false;
        for (int e = 0; e < values.length; e++) {
            if (values[e] == target) {
                contains = true;
                break;
            } else if (e == values.length - 1) {
                contains = false;
            }
        }
        return contains;
    }

        public static void main(String[] args)
        {
            int[] dataPoints;
            dataPoints = new int[100];
            Random rnd = new Random();
            Scanner in = new Scanner(System.in);

            //printing whole array. separated with |
            for (int e = 0; e < dataPoints.length; e++) {
                dataPoints[e] = rnd.nextInt(100) + 1;
            }
            for (int e = 0; e < dataPoints.length; e++) {
                System.out.printf("%5d   |", dataPoints[e]);
                if (e % 20 == 0 && e > 0) {
                    System.out.println("");
                }
            }
            System.out.println("");

            //average and sum
            int sum = 0;
            for (int e = 0; e < dataPoints.length; e++) {
                sum = sum + dataPoints[e];  // sum += e
            }
            int ave = sum / dataPoints.length;

            System.out.println("The average of the data set is " + ave);
            System.out.println("The sum of the data set is " + sum);
            int sumStatic = sum(dataPoints);
            System.out.println("Static sum = " + sumStatic);

            //times a number is found within the array
            int userInt;
            int timesFound = 0;
            Scanner in1 = new Scanner(System.in);
            userInt = SafeInput.getRangedInt(in1, "Please enter an int", 1, 100);
            for (int e = 0; e < dataPoints.length; e++) {
                if (dataPoints[e] == userInt) {
                    timesFound = timesFound + 1;
                }
            }
            System.out.println("User number, " + userInt + ", was found " + timesFound + " time(s).");
            int occurranceStatic = occurranceScan(dataPoints, userInt);
            System.out.println("Static occurrance is " + occurranceStatic + " times.");

            //first index of a user inputted number
            int userInt1;
            Scanner in2 = new Scanner(System.in);
            userInt1 = SafeInput.getRangedInt(in2, "Please enter an int", 1, 100);
            for (int e = 0; e < dataPoints.length; e++) {
                if (dataPoints[e] == userInt1) {
                    System.out.println("First index of " + userInt1 + " at " + e);
                    break;
                } else if (e == dataPoints.length - 1) {
                    System.out.println(userInt1 + " not found in data points.");
                }
            }
            Boolean containsStatic = contains(dataPoints, userInt1);
            System.out.println("Static: dataPoints contains " + userInt1 + " = " + containsStatic);

            //max and min
            int min = dataPoints[0];
            int max = dataPoints[0];

            for (int e = 0; e < dataPoints.length; e++) {
                if (min > dataPoints[e]) {
                    min = dataPoints[e];
                }
                if (max < dataPoints[e]) {
                    max = dataPoints[e];
                }
            }
            System.out.println("The min is " + min);
            System.out.println("The max is " + max);
            int minStatic = min(dataPoints);
            System.out.println("Static Min = " + minStatic);
            int maxStatic = max(dataPoints);
            System.out.println("Static Max = " + maxStatic);

            System.out.println("Average of dataPoints is: " + getAverage(dataPoints));

        }

    }
