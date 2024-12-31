public class VariableShadowing {
    /**
     * Variable shadowing occurs when a variable declared within a certain scope
     * (decision block, method, or inner class) has the same name as a variable
     * declared in an outer scope. This causes the inner variable to "shadow" the
     * outer variable, making it inaccessible within the inner scope.
     */

    int x = 10; // Outer scope variable

    public void shadowExample() {
        int x = 20; // Inner scope variable shadows the outer scope variable
        System.out.println("Inner scope x: " + x);
    }

    public void printOuterX() {
        System.out.println("Outer scope x: " + x);
    }

    public static void main(String[] args) {
        VariableShadowing obj = new VariableShadowing();
        obj.shadowExample();
        obj.printOuterX();
    }
}
