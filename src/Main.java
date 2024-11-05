import java.util.Random;
import java.util.Scanner;

public class Main {
    final static int[] dataPoints = new int[100];
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        double average = 0;
        int sum = 0;

        for (int d = 0; d < dataPoints.length; d++)
            dataPoints[d] = rnd.nextInt(100) + 1;

        for (int d = 0; d < dataPoints.length; d++)
            System.out.println(dataPoints[d] + " ");
        System.out.println();

        for (int d = 0; d < dataPoints.length; d++)
            System.out.print(dataPoints[d] + " | ");
        System.out.println();
        System.out.println();

        for (int d = 0; d < dataPoints.length; d++)
            sum += dataPoints[d];

        average = sum / (double) dataPoints.length;

        System.out.println("The sum of the random array dataPoints is " + sum + ".");
        System.out.println("The average of the random array dataPoints is " + average + ".");
        System.out.println();

        int target = SafeInput.getRangedInt(in, "Enter your target", 0, 100);

       /* boolean found = false;
        for (int d = 0; d < dataPoints.length; d++)
        {
            if (dataPoints[d] == target)
            {
                System.out.println("Found target (" + target + ") at locus " + d);
                found = true;
            }
        }
        if (!found)
            System.out.println(); */

        int foundLocus = -1;

        for (int d = 0; d < dataPoints.length; d++)
        {
            if (dataPoints[d] == target)
            {
                foundLocus = d;
                System.out.println("Found target (" + target + ") at locus " + d);
                break;
            }
        }
        if (foundLocus == -1)
            System.out.println("Did not find target " + target);
        System.out.println();

        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int d = 1; d < dataPoints.length; d++)
        {
            if (dataPoints[d] < min)
                min = dataPoints[d];

            if (dataPoints[d] > max)
                max = dataPoints[d];
        }

        System.out.println("The minimum value in dataPoints is " + min + ".");
        System.out.println("The maximum value in dataPoints is " + max + ".");
        System.out.println();

        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    public static double getAverage(int values[])
    {
        double sum = 0;

        for (double value : values)
            sum += value;

        return sum / values.length;
    }
}