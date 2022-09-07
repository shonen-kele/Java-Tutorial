//remember to put the main method at the top of the class
import java.util.Scanner; //import a class (built-in)
import examplePackageFolder.examplePackageFile; //import a class (self-made)
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;

//you can import whole packages with an asterisk *
public class OriginalPackage{
    static Scanner mainMethodInput = new Scanner(System.in);
    public static void main(String[] args) {
        String var1 = "This is a string variable";
        int var2 = 2;
        double var3 = 3.4;
        char var4,var5;
        var4=var5='A';
        boolean var6 = true, var7 = false;
        float var8 = 3.4f;
        
        System.out.println("Hello, welcome to the original package");
        System.out.println("This is where all the examples of Java I have learnt is");
        String[] examples = {"1: data types","2: java operators","3: java strings","4: java math",
        "5: java If else","6: java switch","7: java Loops","8: java Arrays","9: java methods",
        "10: java classes","11: java file handling"};
        while (true) {
            System.out.println("What is the number of the demonstration you would like to see?");
            for(String example: examples){
                System.out.println(example);
            }
            String mainInput = mainMethodInput.nextLine();
            switch (mainInput) {
                case "1":
                dataTypes(var1, var2, var3, var4,
                var5, var6, var7, var8);
                break;
                case "2":
                javaOperators();
                break;
                case "3":
                javaStrings();
                break;
                case "4":
                javaMath();
                break;
                case "5":
                javaIfElse(var2, var3, var4);
                break;
                case "6":
                javaSwitch(var2);
                break;
                case "7":
                javaLoops();
                break;
                case "8":
                javaArrays();
                break;
                case "9":
                //need user input for this one.
                OriginalPackage mainObject = new OriginalPackage();
                mainObject.doubleNumber(8);
                break;
                case "10":
                ClassOfClasses.main();
                case "11":
                //file management
                break;
                
                default:
                System.out.println("You did not pick a choice");
                break;
            }
            mainMethodInput.nextLine();
            do {
                System.out.println("Would you like to exit the original package?");
                System.out.println("(y/n)");
                mainInput = mainMethodInput.nextLine();
            } while (!(mainInput.equals("y"))&&!(mainInput.equals("n")));
            if(mainInput.equals("y")){
                break;
            } else {
                continue;
            }
        }
        
    }
    //Methods
    /*A static method is a method which can be accessed without creating an object of the
    class it is in*/
    
    
    
    static void dataTypes(String var1, int var2, double var3,
    char var4, char var5, boolean var6, boolean var7, float var8){
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
        System.out.println(var6);
        System.out.println(var7);
        System.out.println(var8);
        /*type casting narrowing [manually]
        (converting larger data types into smaller data types)*/
        int typecast1 = 1;
        int typecast2 = (short)typecast1 + 1;
        System.out.println(typecast2);
        /*
        For widening type casting it is done automatically
        with widening you can just use the declaration keywords
        (converting smaller data types into larger data types)
        type casting is only for primitive data
        */
    }
    
    static void javaOperators(){
        //Java operators
        int modulusOperator = 123%5;
        System.out.println(modulusOperator); // returns the division remainder
    }
    
    static void javaStrings(){
        //Java Strings
        String exampleString = "Hello my name is Kelechi Mba";
        //Print the length of a string
        System.out.println(exampleString.length());
        //Make a string uppercase or lowercase
        String uppercase = exampleString.toUpperCase();
        String lowercase = exampleString.toLowerCase();
        System.out.println(uppercase);
        System.out.println(lowercase);
        /*Returns the index of the first occurence of a specified text
        in a string*/
        System.out.println(exampleString.indexOf("Kelechi"));
        /*you can use the + operator for string concatenation
        or you could use the concat() method*/
        String concatenatString = exampleString.concat(uppercase);
        System.out.println(concatenatString);
        /*you can use a backslash to escape strings
        there are also other escape sequences that are in Java*/
        System.out.println("This one line\nand this is another line");
        // /r ignores everyting that comes before it
        System.out.println("This is one line\rand this is the beggining of a new line");
        System.out.println("Here is some text\tand here is some text after a couple of spaces");
        System.out.println("This piece of text incoporates a backspace\b");
        /*The \f escape sequence means form feed and it's function is to-
        insert a page break */ 
        
    }
    
    static void javaMath(){
        //Java Math
        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(5, 10));
        System.out.println(Math.sqrt(81));
        System.out.println(Math.abs(-4.7));
        //The next method retuns a random number between 0 (inclusive) and 1 (exclusive)
        System.out.println(Math.random());
    }
    
    static void javaIfElse(int var2, double var3, char var4){
        //Java If...else
        if (var2 != var3) {
            System.out.println("This is true");
        } else if(var2 != var4) {
            System.out.println("This is might be true");
        } else {
            System.out.println("Both expressions are false");
        }
        //if...else shorthand (variable = (condition)?expressionTrue:expressionFalse)
        String result = (var3 == var4)?"This expression is true":"This expression is false";
        System.out.println(result);
    }
    
    static void javaSwitch(int var2){
        //Java Switch
        switch(var2){
            case 1:
            System.out.println("The case is one");
            break;
            case 2:
            System.out.println("The case is two");
            break;
            default:
            System.out.println("It was none of the cases");
        }
    }
    
    
    static void javaLoops(){
        //Java loops
        //While loop
        int i,j;
        i = j = 0;
        while(i<5){
            System.out.print(i);
            i++;
        }
        //Do while loop
        do {
            System.out.println("This statement will be printed 3 times");
            if(j==5){
                break;
            }
            j++;
        } while (j<5);
        //For loop
        for (int j2 = 0; j2 < 5; j2++) {
            System.out.println("This is printed using a for loop");
        }
        //For each loop
        String[] tempStrings = {"Word1","Word2","Word3","Word4"};
        for(String xString: tempStrings){
            System.out.println(xString);
            if(xString=="Word3"){
                continue;
            }
        }
    }
    
    static void javaArrays(){
        //Arrays
        //Java Arrays are declared with type and square brackets
        String[] manga = {"OPM","CSM","JJK","PunPun"};
        int[] lucky = {7,9,10,11,12,13};
        //you already know how to access and change elements in an array
        System.out.println(manga[2]+lucky[3]);
        /*get the length of an array 
        (different to the length() method since this is a property)*/
        System.out.println(manga.length);
        //you know how to loop through arrays (for each inclusive)
        //Multi-dimensional Arrays
        int[][] matrix = {{1,0,1,1,1,0,1,0,0},{0,0,0,1,1,0,0,1,0,0}};
        System.out.println(matrix[1][3]);
        //you know how to get the elements of a 2d array
    }
    /*Method overloading: 
    multiple methods can have the same name and different parameters
    use keywords before methods*/
    //you already know recursion
    
    //These methods cannot be accessed within the main method without an object
    public int doubleNumber(int number){
        return number*2;
    }
    public double doubleNumber(double number){
        return number*2;
    }
}

/*
* 
* 
* IN CONSTRUCTION
* 
* 
* 
* 
*/
class ClassOfClasses{
    static void main(){
        System.out.println("This is where you will select a demonstration-");
        System.out.println("of classes, both built in and hand-made.");
        System.out.println("Select the number of the demo you'd like to see.");
        String[] classArray = {"ObjectsAndMethods","ConstructorsAndModifiers",
        "AbstractAndInherit","EncapsulateAndPackage","Interfaces","Enumerate",
        "UserInput","DateAndTime","ArrayCollections","Wrapper Classes",
        "Java Exceptions","Lambda","Threads"};
        for(byte choice = 1;choice<=classArray.length;choice++){
            System.out.println(choice+") "+classArray[choice-1]);
        }
        int choiceInput = OriginalPackage.mainMethodInput.nextInt();
        while (true) {
            switch (choiceInput) {
                case 1:
                //creating an object using object modifiers
                ObjectsAndMethods FirstMainObject = new ObjectsAndMethods();
                FirstMainObject.main();
                break;
                case 2:
                //class constructor
                ConstructorsAndModifiers SecondMainObject =
                new ConstructorsAndModifiers(8);
                SecondMainObject.main();
                break;
                case 3:
                //Inheritance + abstraction + polymorphism
                AbstractAndInherit.Human kelechiHuman =
                new AbstractAndInherit.Human();
                AbstractAndInherit.Dog ruffus = new AbstractAndInherit.Dog();
                kelechiHuman.speak();
                ruffus.speak();
                break;
                case 4:
                //Package management + Inner classes
                EncapsulateAndPackage.Security update =
                new EncapsulateAndPackage.Security();
                update.main();
                break;
                case 5:
                //interfaces + implementation
                Interfaces.CodeSystem keleInterface = new Interfaces.CodeSystem();
                keleInterface.main();
                break;
                case 6:
                //Enum (enumeration)
                System.out.println(Enumerate.Level.LOW.probability);
                break;
                case 7:
                //User input
                UserInput.main();
                break;
                case 8:
                //Java date and time
                DateAndTime.SchoolDate.main();
                break;
                case 9:
                //Lists
                ArrayCollections.Faves.main();
                break;
                case 10:
                WrapperClasses.main();
                break;
                case 11:
                JavaExceptions.main();
                break;
                case 12:
                Lambda.main();
                break;
                case 13:
                Threads.main();
                break;
                default:
                System.out.println("You haven't chosen an example");
                break;
            }
            OriginalPackage.mainMethodInput.nextLine();
            String stringInput;
            do{
                System.out.println("Would you like to leave the class ");
                System.out.print("examples?");
                System.out.println("(y/n)");
                stringInput = OriginalPackage.mainMethodInput.nextLine();
            }while(!(stringInput.toLowerCase().equals("y"))&&
            !(stringInput.toLowerCase().equals("n")));
            if(stringInput.equals("y")){
                break;
            } else{
                continue;
            }
        }
        
    }
    static class ObjectsAndMethods{
        public void main() {
            OriginalPackage exampleObj = new OriginalPackage();
            exampleObj.doubleNumber(2);
            ConstructorsAndModifiers numberThird = new ConstructorsAndModifiers(5);
            exampleObj.doubleNumber(numberThird.number);
            
            
        }
        
    }
    static class ConstructorsAndModifiers{
        int number;
        public ConstructorsAndModifiers(int numberPrm){
            number = numberPrm;
        }
        public void main() {
            number *= 3;
            System.out.println("The number you inputted multiplied by 3 is ");
            System.out.print(number);
            System.out.println();
        }
    }
    
    static class AbstractAndInherit{
        /*Abstract classes cannot be used to create objects.
        to access an abstract class it must be inherited by another class.
        the animal class itself cannot speak.
        Classification in the real world cannot speak.
        */
        /*The protected access modifier means that only this class and classes which-
        inherit this class can access this method.
        It is similar to private only private methods cannot be accessed
        by child classes.*/
        static abstract class Animal{
            protected abstract void speak();
        }
        static class Human extends Animal{
            public void speak(){
                System.out.println("Hello");
            }
        }
        //the final key-word is a non-access modifier stating the class cannot be inherited.
        final static class Dog extends Animal{
            public void speak(){
                System.out.println("Woof");
            }
        }
        /*The modifier "transient" states that the method or attribute are skipped-
        when serializing. The object containing them.*/
        /*The modifier "synchronized" states that methods can only be accessed by one
        thread at a time */
    }
    
    
    //Encapsulation
    static class EncapsulateAndPackage{
        static class Security{
            private String data = "hashcode";
            //Getter
            public String getData(){
                return data;
            }
            //Setter
            public void setData(String dataInput){
                this.data = dataInput;
            }
            /*This class does not have to be called from an object of it's outer class.
            Inner classes can be private or protected.*/
            static class InnerWorkings{
                String statistic = "50%";
            }
            public void main() {
                System.out.println("Enter the data input");
                String newdata = OriginalPackage.mainMethodInput.nextLine();
                Security passphrase = new Security();
                passphrase.setData(newdata);
                Security.InnerWorkings instanWorkings = new Security.InnerWorkings();
                System.out.println("Today's statistic is " + instanWorkings.statistic);
                examplePackageFile eFile = new examplePackageFile();
                /*to use a class in anoter package you have to create an object-
                of that class */
                eFile.showWords();
            }
        }
        /*The need for encapsulation is to set restrictions
        classes can be made read-only if you only use the get method
        classes can be made write-only if you only use the set method*/
    }
    
    static class Interfaces{
        /*Java doesn't support mutliple classes.
        Java supports multiple interfaces though.
        All interface methods must be overriden.
        interface methods are by default abstract and public.
        Interface attributes are by default public, static, and final.*/
        interface home{
            void homeBtn();
            void wallpaper();
        }
        interface browser{
            void bwsrBtn();
            void updateBwsr();
            void setDefault();
        }
        interface volume{
            void volumeBtn();
            void addDevice();
        }
        static class CodeSystem implements home, browser, volume{
            Scanner codeSysInput = new Scanner(System.in);
            String[] devices = {};
            public void main(){
                String[] options = {"1: home Button", "2: wallpaper", "3: Open browser",
                "4: update Browser", "5: set default browser", "6: Open volume",
                "7: add device"};
                while (true) {
                    System.out.println("Welcome to the code system");
                    for(String option: options){
                        System.out.println(option);
                    }
                    System.out.println("What number would you like to choose?");
                    String optionSelection = OriginalPackage.mainMethodInput.nextLine();
                    switch (optionSelection) {
                        case "1":
                        this.homeBtn();
                        break;
                        case "2":
                        this.wallpaper();
                        break;
                        case "3":
                        this.bwsrBtn();
                        break;
                        case "4":
                        this.updateBwsr();
                        break;
                        case "5":
                        this.setDefault();
                        break;
                        case "6":
                        this.volumeBtn();
                        break;
                        case "7":
                        this.addDevice();
                        break;
                        default:
                        System.out.println("you didn't pick an option");
                        break;
                    }
                    do {
                        System.out.println("would you like to exit the code system?");
                        System.out.println("(y/n)");
                        optionSelection = OriginalPackage.mainMethodInput.nextLine();
                    } while (!(optionSelection.equals("y"))&&
                    !(optionSelection.equals("n")));
                    if(optionSelection.equals("y")){
                        break;
                    } else {
                        continue;
                    } 
                }
                
            }
            
            public void homeBtn(){
                System.out.println("you clicked the home button");
            }
            public void wallpaper(){
                System.out.println("you changed your wallpaper");
            }
            public void bwsrBtn(){
                System.out.println("you opened your browser");
            }
            public void updateBwsr(){
                System.out.println("you updated your browser");
            }
            public void setDefault(){
                System.out.println("what would you like your default browser to be?");
                System.out.println("enter in the next line");
                String newDefault = OriginalPackage.mainMethodInput.nextLine();
                System.out.println("Your new default browser is "+newDefault);
            }
            public void volumeBtn(){
                System.out.println("What would you like the voleume level to be?");
                System.out.println("enter in the next line");
                String volumeLvl = OriginalPackage.mainMethodInput.nextLine();
                System.out.println("The new volume level is "+volumeLvl);
            }
            public void addDevice(){
                System.out.println("What device would you like to add?");
                String deviceIn = OriginalPackage.mainMethodInput.nextLine();
                if(devices.length ==0){
                    String[]tempArray = new String[1];
                    tempArray[0] = deviceIn;
                    devices = tempArray.clone();
                } else {
                    for(String device: devices){
                        if(deviceIn.equals(device)){
                            System.out.println("This device is already in");
                            break;
                        } else {
                            String[] tempArray = new String[devices.length+1];
                            for(int i=0; i<devices.length; i++){
                                tempArray[i] = devices[i];
                            }
                            tempArray[devices.length] = deviceIn;
                            devices = tempArray.clone();
                            System.out.println("The device has been added.");
                        }
                    }
                    
                }
                
            }
        }
    }
    
    //Enum (enumeration). Emumerators have predefined constructors
    static class Enumerate{
        enum Level{
            LOW((byte)25),
            MEDIUM((byte)50),
            HIGH((byte)75);
            
            final short probability;
            
            Level(short probability){
                this.probability = probability;
            }
            
        }
    }
    
    //User input
    static class UserInput{
        static void main(){
            System.out.println("Input a string");
            OriginalPackage.mainMethodInput.nextLine();
            String stringInput = OriginalPackage.mainMethodInput.nextLine();
            System.out.println("You said \""+stringInput+"\".");
            
            System.out.println("Input a boolean");
            boolean booleanIn = OriginalPackage.mainMethodInput.nextBoolean();
            System.out.println("You said \""+booleanIn+"\".");
            
            System.out.println("Input a byte");
            byte byteIn = OriginalPackage.mainMethodInput.nextByte();
            System.out.println("You said \""+byteIn+"\".");
            
            System.out.println("Input a double");
            double doubleIn = OriginalPackage.mainMethodInput.nextDouble();
            System.out.println("You said \""+doubleIn+"\".");
            
            System.out.println("Input a float");
            float floatIn = OriginalPackage.mainMethodInput.nextFloat();
            System.out.println("You said \""+floatIn+"\".");
            
            System.out.println("Input an integer");
            int intInput = OriginalPackage.mainMethodInput.nextInt();
            System.out.println("You said \""+intInput+"\"");
            //There is also a nextLong() and nextShort() method.
            
        }
    }
    
    //Java Date and time
    static class DateAndTime{
        static class SchoolDate{
            static void main(){
                LocalDateTime hTime = LocalDateTime.now();
                DateTimeFormatter shorthandFormatter = 
                DateTimeFormatter.ofPattern("dd/MM/yy");
                System.out.println(hTime.format(shorthandFormatter));
            }
        }
    }
    
    
    //ArrayList
    static class ArrayCollections{
        static class Faves{
            
            static void main(){
                ArrayList<String> manga = new ArrayList<String>();
                manga.add("Fairy Tail"); //Sets an item
                manga.add("One piece");
                manga.add("Naruto");
                manga.add("Bleach");
                manga.add("Dragonball");
                manga.add("Black Clover");
                manga.add("Kaiju No.8");
                manga.add("Vinland Saga");
                manga.add("The Promised Neverland");
                manga.add("One Punch Man");
                
                System.out.println("Here are some manga series");
                for(int i=0;i<manga.size();i++){
                    System.out.println(manga.get(i)); //The get method is used to access an item
                }
                manga.remove(5); //Removes an item
                manga.set(0,"JJK"); //Adds an item
                Collections.sort(manga); //Sorts the list (Collections class is imported)
                
                //Linked list (has same methods as ArrayList plus more)
                LinkedList<String> anime = new LinkedList<String>();
                anime.add("Naruto Shippuden");
                anime.add("Bleach");
                anime.add("Fullmetal Alchemist");
                anime.add("One Punch Man");
                anime.add("Samurai Champloo");
                anime.add("Cowboy Bebop");
                System.out.println(anime.getFirst()+" and "+anime.getLast()+
                " are the first and the last.");
                anime.removeFirst();
                anime.removeLast();
                anime.addFirst("Pyscho Pass");
                anime.addLast("Dragon ball");
                //Clear the list
                anime.clear();
                /*ArrayList is used for storing and accessing data,
                Linkedlist is used to manipulate data*/
                
                //Hashmaps (a.k.a. strict dictionaries)
                //map one data type to another data type.
                HashMap<Byte, String> IdDataset = new HashMap<Byte, String>();
                IdDataset.put((byte)0, "Kelechi");
                IdDataset.put((byte)1,"Nosahari");
                IdDataset.put((byte)2,"Piety");
                IdDataset.put((byte)3,"Civics");
                IdDataset.put((byte)4,"Matilda");
                //Replace a value
                IdDataset.replace((byte)0, "Alias");
                //Remove an item
                IdDataset.remove((byte)4);
                //Get an item
                System.out.println(IdDataset.get((byte)0));
                //size of Hashmap
                IdDataset.size();
                //Loop through all the keys of a hashmap
                System.out.println("The keyset of the ID dataset is");
                for(byte key: IdDataset.keySet()){
                    System.out.println(key);
                }
                //Loopo through all the values of a hashmap
                System.out.println("The values of the ID dataset is");
                for(String value: IdDataset.values()){
                    System.out.println(value);
                }
                //It is possible to clear a hashmap using clear()
                
                //Hashset (a.k.a. type specific set)
                HashSet<Byte> evenNumbers = new HashSet<Byte>();
                for(byte position = 0; position>=100; position+=2){
                    evenNumbers.add(position);
                }
                //Check if the set contains an item (returns boolean)
                System.out.println(evenNumbers.contains((byte)33));
                for(byte number : evenNumbers){
                    if((number%5==0)){
                        System.out.println();
                    } else if (((number+1)%5==0)){
                        System.out.print(number+",");
                    } else if(number == 100){
                        System.out.print(number+".");
                    } else {
                        System.out.print(number+", ");
                    }
                    
                }
                /*Hash set has the same remove, clear and, size method.
                (remove(), clear(), size())*/
                
                //iterator (an object that can be used to loop through collections)
                Iterator<Byte> iteration = evenNumbers.iterator();
                while(iteration.hasNext()){
                    System.out.println(iteration.next());
                }
                /*You can use the method remove() to remove an item from the-
                collection. */
                /*Trying to remove items using a for loop or a for-each loop-
                would not work correctly because the collection is changing-
                size at the same time that the code is trying to loop. */
            }
        }
    }
    static class WrapperClasses{
        //wrapper classes are a way to use primitive data types as objects
        static void main(){
            System.out.println("Check source code: the following is done");
            System.out.print(" wrapper classes");
            Byte wrapperByte = 5;
            System.out.println(wrapperByte.doubleValue());
        }
        
    }
    static class JavaExceptions{
        static void main(){
            System.out.println("This following examples is done using");
            System.out.print(" exceptions");
            try {
                int[] wrongArray = {1,2,3,4};
                System.out.println(wrongArray[10]);
            } catch (Exception e) {
                System.out.println("something went wrong.");
            } finally{
                int[] wrongArray = {1,2,3,4};
                System.out.println(wrongArray[3]);
            }
            /*The point is to catch the error yourself so that the runtime-
            continues. */
            /*Programs that anticipate errors such as when users type wrong- 
            inputs. */
        }
    }
    static class Lambda{
        interface Tax{
            float taxMthd(float tax, float price);
        }
        static void main(){
            System.out.println("these examples are done using lambda");
            Tax pythonCourse = (tax,price) -> price*tax;
            float truePrice = pythonCourse.taxMthd(1.1f,45);
            System.out.println(truePrice);
        }
    }
    static class Threads{
        static class RngMatrix extends Thread{
            static class InnerList {
                private ArrayList<Float> innerList =
                new ArrayList<Float>();
                InnerList(){
                    for(int i=0; i<100; i++){
                        innerList.add((float)Math.random());
                    }
                }
                void printInner(){
                    System.out.println();
                    for(int i=0; i<100; i++){
                        if(i==99){
                            System.out.print(innerList.get(99)+".");
                        } else if ((i+1)%10==0){
                            System.out.print(innerList.get(i)+",");
                            System.out.println();
                        } else {
                            System.out.print(innerList.get(i)+",");
                        }
                    }
                }
            }
            static class OuterList{
                static ArrayList<InnerList> outerList = new ArrayList<InnerList>();
                static void generateList(){
                    for(int i=0; i<100; i++){
                        outerList.add(new InnerList());
                    }
                }
            }
            static void main(){
                for(int i=0; i<100; i++){
                    OuterList.outerList.get(i).printInner();
                }
            }
        }
        static class PrimeFinder extends Thread{
            static LinkedList<Integer> numberList = new LinkedList<Integer>();
            static LinkedList<Integer> primeList = new LinkedList<Integer>();
            PrimeFinder(int lastNumber){
                for(int i=1; i<=lastNumber; i++){
                    numberList.add(i);
                    primeList.add(2);
                }
            }
            static void main(){
                for(int i=1; i<=numberList.size()-1; i++){
                    for(int j=0; j<=primeList.size()-1; j++){
                        if(!((numberList.get(i))%(primeList.get(j))==0)){
                            primeList.add(numberList.get(i));
                            break;
                        }
                    }
                }
                System.out.println("The prime numbers so far are:");
                for(int i=0; i<=primeList.size()-1; i++){
                    if(i==primeList.size()-1){
                        System.out.print(primeList.get(i)+".");
                    } else if((i+1)%10==0){
                        System.out.println(primeList.get(i)+",");
                        System.out.println();
                    } else{
                        System.out.println(primeList.get(i)+",");
                    }
                }
            }
        }
        static void main(){
            System.out.println("This next section is done using threads");
            RngMatrix firstFlow = new RngMatrix();
            PrimeFinder secondFlow = new PrimeFinder(10000);
            firstFlow.start();
            secondFlow.start();
            while((firstFlow.isAlive())||(secondFlow.isAlive())){
                if((firstFlow.isAlive())&&(secondFlow.isAlive())){
                    System.out.println("waiting for firstflow and secondflow");
                } else if(firstFlow.isAlive()){
                    System.out.println("waiting for the firstflow");
                } else{
                    System.out.println("waiting for the second flow");
                }
            }
        }
    }
    static class Files{
        static class importantFiles{
            static void main(){
                File oneVitalFile = new File
                ("C:\\Coding\\Java\\Java Tutorial\\examplePackageFolder\\money.txt");
                /*The createNewFile method for the File object is true if-
                the file does not already exist. */
                try{
                    if(oneVitalFile.createNewFile()){
                        System.out.println("File created: " + 
                        oneVitalFile.getName());
                    } else{
                        System.out.println("File already exists");
                    }
                }catch(IOException e){
                    System.out.println("An error occured");
                    e.printStackTrace();
                }
                /*createNewFile(); might throw an exception and that exception-
                will be a checked exception which will be checked at complie-
                time. All compile time exceptions are checked exceptions and-
                all runtime exceptions are unchecked exceptions.*/
                //Writing to a file
                try{
                    FileWriter userToFile = new FileWriter
                    ("C:\\Coding\\Java\\Java Tutorial\\examplePackageFolder\\money.txt");
                    String input = OriginalPackage.mainMethodInput.nextLine();
                    userToFile.write(input);
                    userToFile.close();
                    System.out.println("You wrote into the file");
                } catch (IOException e){
                    System.out.println("An error occured");
                    e.printStackTrace();
                }
                //Reading a file
                /*We use the scanner class to read the contents of the text-
                file*/
                try{
                    Scanner fileReader = new Scanner(oneVitalFile);
                    while(fileReader.hasNextLine()){
                        String contents = fileReader.nextLine();
                        System.out.println(contents);
                    }
                    fileReader.close();
                    System.out.println("File information");
                    System.out.println("Does the file exist? "+oneVitalFile.exists());
                    System.out.println("File Name: "+oneVitalFile.getName());
                    System.out.println("Absolute Path: "+oneVitalFile.getAbsolutePath());
                    System.out.println("Writeable: "+oneVitalFile.canWrite());
                    System.out.println("Readable: "+oneVitalFile.canRead());
                    System.out.println("File size in bytes: "+oneVitalFile.length());
                } catch(IOException e){
                    System.out.println("There was an error");
                    e.printStackTrace();
                }
                File disposabFile = new File
                ("C:\\Coding\\Java\\Java Tutorial\\examplePackageFolder\\disposableFile.txt");
                if(disposabFile.delete()){
                    System.out.println("Deleted file: "+disposabFile.getName());
                    //You can also delete folders
                } else{
                    System.out.println("Failed to delete this file");
                }
                
            }
        }
    }
}

