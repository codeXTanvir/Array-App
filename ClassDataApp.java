public class ClassDataApp 
{
    public static void main(String[] args) {
        int maxSize = 100;
        ClassDataArray arr;
        arr = new ClassDataArray(maxSize);

        arr.inset("Tanvir", "Ove", 24);
        arr.inset("Ove", "Tanvir", 37);
        arr.inset("Ahmed", "Hasan", 43);
        arr.inset("Talukdar", "Rajon", 63);
        arr.inset("Hasan", "Tahkik", 21);
        arr.inset("Chowdhury", "Miskat", 29);
        arr.inset("Morry", "John", 72);
        arr.inset("Monty", "Mark", 54);
        arr.inset("Zoo", "Specif", 22);
        arr.inset("Nation", "Spectre", 18);

        arr.displayA();
        String searchKey = "Ove";
        Person found;
        found = arr.find(searchKey);
        if(found != null)
            {
                System.out.print("Found ");
                found.displayPerson();
            }
        else
            System.out.println("Can't find " + searchKey);
        
        System.out.println("Deleting Zoo, Monty and Spectre");
        arr.delete("Zoo");
        arr.delete("Monty");
        arr.delete("Spectre");

        arr.displayA();
    }
}