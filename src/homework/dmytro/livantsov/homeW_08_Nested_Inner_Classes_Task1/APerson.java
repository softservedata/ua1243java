package homework.dmytro.livantsov.homeW_08_Nested_Inner_Classes_Task1;

public abstract class APerson {
    private FullName fullName;
    private int age;

    public APerson() {}

    public APerson(FullName fullName1, int age1){
        this.fullName = fullName1;
        this.age = age1;
    }


    public String info(){
        return "First name: <" + fullName.getFirstName()
                + ">, Last name: <" + fullName.getLastName()
                + ">, Age: <" + age + "> ";
    }

    public abstract String activity();
}
