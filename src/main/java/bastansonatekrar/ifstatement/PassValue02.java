package bastansonatekrar.ifstatement;

import com.sun.source.tree.BreakTree;

public class PassValue02 {
    public static void main(String[] args) {
        String name= "Sevcan";
        String updateName=updateName(name,"Karaman");
        System.out.println(name);
        System.out.println(updateName);
    }
    public static String updateName(String name, String add){
        name=name+" "+ add;
        return name;
    }
}
