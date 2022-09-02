package Section1.FieldAndMethod;

class Variable {
    static int classVariable = 10;
    int instanceVariable = 10;

    public static void main(String[] args) {
        System.out.println(Variable.classVariable);

        // System.out.println(Variable.instanceVariable);
        Variable instance = new Variable();
        System.out.println(instance.instanceVariable);

    }
}