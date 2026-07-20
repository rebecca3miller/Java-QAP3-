public class Demo1 {
    public static void main(String[] args) 
    {
        Person john = new Person("Coach John", 45, "Male");
        System.out.println(john);

        Student jane = new Student("Jane Doe", 20, "Female", "HS12345", 3.8);
        System.out.println(jane);

        Teacher mrBrown = new Teacher("Mr. Brown", 40, "Male", "Math", 50000);
        System.out.println(mrBrown);

        CollegeStudent mike = new CollegeStudent("Mike Smith", 21, "Male", "CS67890", 3.5, 2, "Computer Science");
        System.out.println(mike);
    }        
}
