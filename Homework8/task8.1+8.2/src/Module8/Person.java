package Module8;

public abstract class Person  {
    private final int age;
    private final FullName fullName;

    public Person( FullName fullName,int age) {
        this.fullName = fullName;
        this.age = age;
    }



    public abstract String activity();

    public static class FullName {
        private final String firstName;
        private final String lastName;

        public FullName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }


        public String getFirstName() {
            return firstName;
        }


        public String getLastName() {
            return lastName;
        }

    }


    public String info() {
        return "First name='" + fullName.getFirstName()+ '\'' +
                ", Last name='" + fullName.getLastName() + '\''+
                " Age='" + age +'\''
                ;
    }
}
