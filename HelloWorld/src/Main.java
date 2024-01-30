import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Hola Mundo
        /*

         */
        System.out.println("Hola, Java!");
        String myString = "Esto es una cadena de Texto";
        myString = "aqui cambio el valor de la cadena";
        System.out.println(myString);

        int myInt = 7;
        myInt = myInt + 6;
        System.out.println(myInt);
        System.out.println(myInt -1);

        Double myDouble = 6.5;
        System.out.println(myDouble);

        Float myFloat = 6.5f;
        System.out.println(myFloat);

        System.out.println(myDouble + myFloat + myInt +" "+ myString);

        Boolean myBoolean = true;
        System.out.println(myBoolean);

        myBoolean = null;
        System.out.println(myBoolean);

        myFloat = null;
        if (myFloat != null){
            System.out.println(myFloat+10);
            System.out.println("My Float es distinto de nulo");
        } else {
            System.out.println("My float es nulo");
        }

        if (myInt == 11){
            System.out.println("myInt = 11");
        } else if (myInt == 12) {
            System.out.println("myInt = 12");
        }else {
            System.out.println("El valor de myInt no es ni 11 ni 12");
        }

        List myList = new ArrayList();
        myList.add(myString);
        myList.add(myInt);
        System.out.println(myList);

        Map myMap = new HashMap();
        myMap.put("String", myString);
        myMap.put("int", myInt);
        System.out.println(myMap);
        System.out.println(myMap.get("int"));

        for (int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }

        final String myConstant = "Esto es una Constante";

        Main myMain = new Main();
        myMain.myFuction(1,7);
    }
    public void myFuction(int myFrst, int myScnd){
        System.out.println(myFrst+myScnd);
    }
}