public class Person {
    
    protected String myName;
    protected int myAge;
    protected String myGender;

    public Person(String name, int age, String gender) 
    {
        myName = name;
        myAge = age;
        myGender = gender;
    }

    public String getName() 
    {
        return this.myName;
    }

    public int getAge() 
    {
        return this.myAge;
    }

    public String getGender() 
    {
        return this.myGender;
    }

    public void setGender(String gender) 
    {
        this.myGender = gender;
    }

    @Override
    public String toString() 
    {
        return myName + ", Age: " + myAge + ", Gender: " + myGender;
    }

}