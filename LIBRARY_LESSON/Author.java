public class Author  extends Person{

private String nationality;
private String position;

public Author(String  name , String birthDate,String position , String nationality ) {
super(name, birthDate);
this.nationality=nationality;


    }

public void setNationality(String nationality){
    this.nationality=nationality;
}
public String getNationality(){
    return nationality;
}

}