class Assignment{
        float singlePrecision;
        double doublePrecision;

        Assignment(float singlePrecision, double doublePrecision) {
            this.singlePrecision = singlePrecision;
            this.doublePrecision = doublePrecision;
        }

        void displayPrecision() {
            System.out.println("Single Precision (float): " + singlePrecision);
            System.out.println("Double Precision (double): " + doublePrecision);
        }

    public static void main(String[] args) {
        Assignment obj = new Assignment(3.14159868f, 3.1415926535897937);
        // Single Precision (float): 3.1415987
        // Double Precision (double): 3.141592653589794
        obj.displayPrecision();
    }
}