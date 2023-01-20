public class tuna {
    private String girlNameString;

    public tuna(String nameString){
        girlNameString = nameString;
    }

    public void setName(String nameString){
        girlNameString = nameString;
    }

    public String getName(){
        return girlNameString;
    }
    public void saying() {
        System.out.printf("\nYour first girlfriend was %s", getName());
    }

    public void simpleMessage(String nameString){
        System.out.println("Hello " + nameString);
    }
}
