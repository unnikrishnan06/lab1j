import java.util.Scanner;
 
 
/*
    Week 2 Lab: Weather Report Program
    Topics: Conditional statements, loops, typecasting, input validation
    Objective: Ask the user for weather info, validate input, and display a full report
*/
 
 
public class Weatherreport{
    public static void main(String[] args) {
 
 
        Scanner input = new Scanner(System.in);
 
 
        /*
        STEP 1: Declare variables for weather information
        a) Today's weather conditions (String)
        b) Possibility of precipitation (String)
        c) Wind speed (String)
        d) Daily high temperature (int or double)
        e) Daily low temperature (int or double)
        f) UV index (int)
        */
 
 
        // TODO: Declare your variables here
        String weather;
        String precipitation;
        String wind;
        double highTemp;
        double lowTemp;
        int   uvIndex;
        /*
        STEP 2: Get input from the user using Scanner
        - Ask for each variable above
        - Validate numeric input using loops
        - Example: Ensure highTemp >= lowTemp
        */
 
 
        // TODO: Prompt user and read input
        // TODO: Use loops to validate high/low temperatures and UV index
         System.out.print("enter todays weather: ");
          weather = input.nextLine();

        System.out.print("enter precipitation : ");
        precipitation = input.nextLine();

         System.out.print("enter wind speed : ");
         wind = input.nextLine();
        do{
        System.out.print("enter high temperature: ");
         highTemp = input.nextDouble();

        System.out.print("enter low temperature: ");
         lowTemp = input.nextDouble();
         if(highTemp < lowTemp){
             System.out.println("High temperature must be greater than low temperature try again.");
         }
        }while (highTemp < lowTemp);
        do{
        System.out.print("enter uv index: ");
         uvIndex = input.nextInt();
         if (uvIndex < 0){
             System.out.println("uv index cannotbe negative try again."); }
         }while (uvIndex < 0);
        /*
        STEP 3: Typecasting (if needed)
        - Example: if you read a double but want to display as int
        */
 
 
        // TODO: Apply typecasting where necessary
 
 
        /*
        STEP 4: Conditional statements
        - Example: 
          - If UV index >= 6, suggest "Use sunscreen"
          - If precipitation >= 50%, suggest "Carry an umbrella"
          - If wind speed > 40 km/h, suggest "Windy conditions"
        */
 
 
        // TODO: Write if, if-else, or nested if statements to display tips
        String tips = "";
        if (uvIndex >= 6) {
            tips += "use sunscreen. ";
        }
        int precipValue = Integer.parseInt(precipitation);
        if (precipValue >= 50) {
            tips += "carry an umbrella. ";
        }
        int windValue = Integer.parseInt(wind);
        if (windValue > 40) {
            tips += "Windy conditions. ";
        }
 
 
        /*
        STEP 5: Create a fullReport String
        - Combine all user inputs and tips into one formatted sentence or paragraph
        - Use String concatenation (+) or String.format()
        */ 
        // TODO: Construct your full weather report here
 
           String report = "\n weather report:\n" +
                "condition: " + weather + "\n" +
                "high temp: " + highTemp + "\n" +
                "low temp: " + lowTemp + "\n" +
                "uv index: " + uvIndex + "\n" +
                "tips: " + tips;

        /*
        STEP 6: Print the full weather report
        */
        // TODO: Output your report using System.out.println()
        System.out.println(report);
 
        /*
        STEP 7: Optional extra challenge
        - Use loops to ask if the user wants to enter another day's report
        - Continue until the user types "no"
        */
        
 
        // TODO: Implement loop for multiple reports
 
 
        input.close();
    }
}

 
 
 