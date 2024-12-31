public class DefaultConstructor {
    int intVariable;
    String stringVariable;
    boolean booleanVariable;
    char characterVariable;

    // default constructor
    public DefaultConstructor() {
        intVariable = 10;
        stringVariable = "Vivek";
        booleanVariable = true;
        characterVariable = 'A';
    }

    public void printVariable() {
        System.out.println("Integer : " + intVariable);
        System.out.println("String : " + stringVariable);
        System.out.println("Boolean : " + booleanVariable);
        System.out.println("Character : " + characterVariable);
    }
}
