package pl.pp;

public class person3 {

    private String forename;
    private String surname;
    private int age;

    public person3() {
    }

    public person3(String forename, String surname, int age) {
        this.forename = forename;
        this.surname = surname;
        this.age = age;
    }


    public void hiToAll(){
        System.out.println("Nazywam się " + forename + " " + surname + ". " + "Mam " + age + " lat.");
    }


    public int growOld(int age){
        this.age += age;
        return age;
    }


    public String getForename(){
        return forename;
    }
    public void setForename(String forename){
        this.forename = forename;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}