package lesson1.task5;

class TestLogic {
    static boolean logicOperationOr(boolean a, boolean b) {
        boolean or1 = a || b;
        return !or1;
    }

    static boolean logicOperationAnd(boolean a, boolean b) {
        return !a && !b;
    }

    public static void main(String[] args) {

        System.out.println(logicOperationOr(false, false) + " " + logicOperationAnd(false, false));
        System.out.println(logicOperationOr(false, true) + " " + logicOperationAnd(false, true));
        System.out.println(logicOperationOr(true, false) + " " + logicOperationAnd(true, false));
        System.out.println(logicOperationOr(true, true) + " " + logicOperationAnd(true, true));
    }
}