package se.lexicon;



public class Main {
    public static void main(String[] args) {

        Person Mohammad = new Person("Mohammad", "Alissa");
        System.out.println(Mohammad.personInformation());
        Person Don = new Person("Don", "Freecss");
        System.out.println(Don.personInformation());


        System.out.println("-------------------");
        Book TI = new Book("Treasure Island", "Robert Louis Stevenson", true);
        TI.setHolder(Mohammad);
        System.out.println(TI.getBookInformation());
        System.out.println(TI.getHolderInformation());


        Book DC = new Book("Dark continent", "Don Freecss", true);
        DC.setHolder(Don);
        System.out.println(DC.getBookInformation());
        System.out.println(DC.getHolderInformation());


    }
}