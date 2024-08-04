public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(){
        firstName = "Roman";
        lastName = "Svoren";
        birthYear = getAge(1976);
        System.out.println(this.output());

    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println(this.output());
    }



    public Person(String firstName, String lastName, int birthYear){
     input(firstName,lastName,birthYear);
        System.out.println(this.output());


    }


    public int getAge(int birthYear){
        int age = 2024-birthYear;
       return age;
    }
    public void input(String firstName, String lastName, int birthYear){
        this.firstName= firstName;
        this.lastName=lastName;
        this.birthYear= getAge(birthYear);

    }
    public  String output(){
        String information = "First name: "+firstName+". Last name: "+lastName+". The age of person: "+birthYear+"\n";
   return information;
    }

    /**
     *
     * @param Khrystyna
     * @param Martynova
     * @return цей метод зміни імені я не використала в програмі. Бо не знаю джо якого конструктора його приліпити
     * і за яких умов змінювати ім'я адже дані не вводяться з консолі. Принаймі я так зрозуміла задачу.
     */
    public String changeName(String firstName,String lastName){
        this.firstName=firstName;
    this.lastName=lastName;
    return this.output();



}
    }

