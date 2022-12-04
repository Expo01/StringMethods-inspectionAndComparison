public class Main {
    public static void main(String[] args) {
        printInformation("Hello World");
        printInformation("");
        printInformation("\t    \n");

        String helloWorld = "Hello World";
        System.out.printf("index of r = %d %n", helloWorld.indexOf('r'));
        System.out.printf("index of world = %d %n", helloWorld.indexOf("World")); //this is case-sensitive for 'W' and gives index of
                                                                                    // first letter in the word
        System.out.printf("index of l = %d %n", helloWorld.indexOf('l'));   //gives the first l
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l'));      //gives the last l
        System.out.printf("index of l = %d %n", helloWorld.indexOf('l',3));   //finds first starting at index 3
        System.out.printf("index of l = %d %n", helloWorld.lastIndexOf('l',8));      //finds last (looks in reverse) starting index 8
        //the above are 'string inspection methods'
        System.out.println("");

        //the below are 'string comparison methods'
        String helloWorldLower = helloWorld.toLowerCase();
        if(helloWorld.equals((helloWorldLower))){       //compared exact content of strings
            System.out.println("values match exactly");
        }
        if (helloWorld.equalsIgnoreCase(helloWorldLower)){    //non -case-sensitive comparison
            System.out.println("values match ignoring case");
        }
        if (helloWorld.startsWith("Hello")){
            System.out.println("string starts with hello");
        }
        if (helloWorld.endsWith("World")){
            System.out.println("string ends with world");
        }
        if (helloWorld.contains("World")){
            System.out.println("string contains world");
        }
        if(helloWorld.contentEquals(("Hello World"))){      //is different from .equals method in that it can compare string builders??
            System.out.println("values match exactly");
        }
    }

    public static void printInformation(String string) {
        int length = string.length(); //string turned into int
        System.out.printf("length = %d %n", length); // printed length

        if (string.isEmpty()) {
            System.out.println("string is empty");
            return; // return here despite void type method appears to take place of the else statement. error if no 'return'
        }

        if (string.isBlank()){
            System.out.println("string is blank"); // is blank if just spaces, but spaces still have indexes to them unlike empty string
        }

        System.out.printf("first char = %c %n", string.charAt(0)); // printed char value from string at index 0 'H'
        System.out.printf("last char = %c %n", string.charAt(length - 1));
    }
}