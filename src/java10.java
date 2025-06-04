public class java10 {
    public static void main(String[] args){
        String day = "saturday";
        switch(day){
            case  "saturday","sunday"-> System.out.println("6am");
            case "Monday"-> System.out.println("8am");
            default -> System.out.println("7am");
        }
    }
}
