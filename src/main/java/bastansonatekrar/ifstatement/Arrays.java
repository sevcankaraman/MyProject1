package bastansonatekrar.ifstatement;

public class Arrays {

    //Example 1: String bir array olusturnuz, 6 eleman ekleyiniz,
    // Yellow'dan onceki elemanlari yazdiriniz

    public static void main(String[] args) {

        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";
        System.out.println(java.util.Arrays.toString(colors));

        int counter=0;

        for (int i = colors.length-1; i >=0 ; i--) {
            if (colors[i].equals("Yellow")){

            break;
        }
            System.out.println(colors[i]);
        }

    }


}
