class Department implements Cloneable {
    private String name;
    Address address;

    public Department(String name, String city, String street, int building) {
        this.name = name;
        this.address = new Address(city, street, building);
    }

    public class Address {
        private String city;
        private String street;
        private int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        @Override
        public String toString() {
            return "City: " + city + ", Street: " + street + ", Building: " + building;
        }

        public void setCity(String city) {
            this.city = city;
        }
    }

    @Override
    public String toString() {
        return "Department Name: " + name + ", Address: [" + address.toString() + "]";
    }

    @Override
    protected Department clone() throws CloneNotSupportedException {
        Department clonedDepartment = (Department) super.clone();
        clonedDepartment.address = new Address(this.address.city, this.address.street, this.address.building);
        return clonedDepartment;
    }
}

public class pr1_lesson8 {
    public static void main(String[] args) {
        try {
            Department department1 = new Department("IT Department", "New York", "5th Avenue", 100);
            System.out.println("Department 1: " + department1);

            Department department2 = department1.clone();
            department2.address.setCity("San Francisco");
            System.out.println("Department 2 (After modifying city): " + department2);

            System.out.println("\nFinal Department Information:");
            System.out.println("Department 1: " + department1);
            System.out.println("Department 2: " + department2);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
