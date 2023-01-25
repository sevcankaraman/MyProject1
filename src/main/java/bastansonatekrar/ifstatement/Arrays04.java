package bastansonatekrar.ifstatement;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors));

        int num= Arrays.binarySearch(colors,"Yellow");
        System.out.println(num);
    }
}
