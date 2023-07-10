public class Librrarian extends Person{

private int stageWork;


public Librrarian(String  name ,String birthDate, int stageWork ) {
super(name,birthDate);
this.stageWork=stageWork;


    }

public void setStage(int stageWork){
    this.stageWork=stageWork;
}
public int getStage(){
    return stageWork;
}

}