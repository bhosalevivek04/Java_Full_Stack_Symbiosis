public class ParameterisedConstructor {
    int intVariable;
    String stringVariable;
    boolean booleanVariable;

    public ParameterisedConstructor(int intVar, String stringVar, boolean booleanVar){
        intVariable = intVar;
        stringVariable = stringVar;
        booleanVariable = booleanVar;
    }

    public void printVariable() {
        System.out.println("Integer : " + intVariable);
        System.out.println("String : " + stringVariable);
        System.out.println("Boolean : " + booleanVariable);
    }

}
