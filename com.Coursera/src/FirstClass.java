public class FirstClass {


    public static void main(String[] args){
/*
*Все що ми додаємо до String  буде мати тип String
 */
String dept = "cit";
char letter = 'y';
int x =5;
double y= 6.7;
String someInformation = dept +letter + ":" +x;
System.out.println(someInformation);
/*
*some math operations
 */
        double z =(x*2)-y;
       double d = 2*y*5-10;
       System.out.println("d:"+d);
        System.out.println("z:"+z);

        //division wits integers
        //the integer division drops the remainder and only returns the whole number part.
        System.out.println("x/2:"+(x/2));
        //division with floats
        // the type of division result depends on the type of dividend and divisor
        System.out.println("x/2.0:"+(x/2.0));
        //the power operation returns a float number
        System.out.println("x pow 4:"+Math.pow(x,4));

        //String operations
        String fullName="Khrystyna" + " " + "Martynova";
        String fullNameToUpper = fullName.toUpperCase();
        System.out.println("Full name:"+fullNameToUpper);

        //Conditionals and loops
        //Conditional checking if x is even using the modulus or %operator
        System.out.println();
        System.out.println("x="+x);
        if(x % 2 == 0){
            System.out.println("x is even-парне");
        } else {
            System.out.println("x is odd");

        }
double e =2.3;
double h =3;
if (e>2 && e<h){
    System.out.println(e+"  is between 2 and "+h);

}
//while loops
        int i=0;
while (i<5){
    System.out.println("i:"+i);
    i++;

}
//for loops
 for(int k=0;k<10;k++){
     System.out.println("k:"+k);

 }
//CASTING
        String intToString = Integer.toString(1);
 String intToString2=String.valueOf(1);

 //cast double to a string
        String doubleToString = Double.toString(2.4);//or String.valueOf(2.4)
        System.out.println();
        //String and other objects have getClass() method to get the class(or type) of that object
        System.out.println(intToString+ " "+intToString.getClass());
        System.out.println(doubleToString+" "+doubleToString.getClass());

        //Cast String to int
        int stringToInt = Integer.parseInt("1");
        double stringToDouble = Double.parseDouble("2.3");

        System.out.println(stringToInt);//primitive types can not call methods like getClass()
        //then we need to cast to Object then call getClass()
        System.out.println(((Object)stringToInt).getClass() );

        System.out.println(stringToDouble);
        System.out.println(((Object)stringToDouble).getClass() );






    }
}
