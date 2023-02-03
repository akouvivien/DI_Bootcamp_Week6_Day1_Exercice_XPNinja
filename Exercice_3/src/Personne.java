public class Personne {

    public String name;
    public int age;
    public char gender;


    public Personne() {
        this.name = "Unknown";
        this.age =0;
        this.gender ='U';
    }

    public Personne(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    
    public Personne(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender='U';
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    public void displayInfo(){
        System.out.println("name :"+name+" age :"+age+ " gender :" +gender);
    }

}