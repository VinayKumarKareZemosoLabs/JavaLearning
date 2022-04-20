

public class ErrorHandling {

    public static void validateVariable(String variableName){
        try {
            System.out.println(variableName);
            if(variableName.startsWith("$")) {
                throw new VariableStartWithIDollarException("In naming conventions, Variable names should not start with dollar sign $ character, even though it is allowed");
            }
            else if(variableName.startsWith("_")){
                throw new VariableStartWithIUnderscoreException("In naming conventions, Variable names should not start with underscore _ , even though it is allowed");
            }
            else if(variableName.matches("[0-9]+[a-zA-Z]*")){
                throw new VariableStartWithIntException("Variable name starting with number/integer not allowed in Java");
            }
            else if(variableName == null) {
                throw new NullPointerException("Variable name cannot be null/Empty");
            }
            else{
                System.out.println("Variable name looks fine. You are good to go.");
            }
        }

        catch (VariableStartWithIDollarException | VariableStartWithIntException
               | VariableStartWithIUnderscoreException e){

            System.out.println(e.getMessage());

        }

        catch(NullPointerException e){
            System.out.println("Variable name cannot be null/Empty");
        }

        finally {
            System.out.println("Finally block, always executes");
        }
    }

    public static void main(String[] args) {


        String variable1= null;
        String variable2 = "1name";
        String variable3 = "_name";
        String variable4 = "$name";
        String variable5 = "name";

//        int _x; //Allowed, but not a good practice
//        int $x; //Allowed, but not a good practice
//        int 2x; //Not allowed

        validateVariable(variable1);
        validateVariable(variable2);
        validateVariable(variable3);
        validateVariable(variable4);
        validateVariable(variable5);

    }

}
