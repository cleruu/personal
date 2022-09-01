public class Pet {
    String name;
    int trustlevel;
    int petlevel;
    boolean ishappy;

    public void myPet() {
        System.out.println("This is my pet " + name + " and he/she is lovely");
    }

    public Pet(String nam, int trustlev, int petlev, boolean ishap){
        name = nam;
        trustlevel = trustlev;
        petlevel = petlev;
        ishappy = ishap;
    }
}
