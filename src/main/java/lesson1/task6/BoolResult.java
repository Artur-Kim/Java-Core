package lesson1.task6;

class BoolResult {
    static boolean returnLogicSchemeVariable(boolean a, boolean b, boolean c, boolean d) {
        return (a && b) && !(c || d);
    }

    public static void main(String[] args) {

        System.out.println(returnLogicSchemeVariable(false, false, false, false));
        System.out.println(returnLogicSchemeVariable(true, true, true, true));
        System.out.println(returnLogicSchemeVariable(false, true, false, true));
        System.out.println(returnLogicSchemeVariable(true, false, true, false));
        System.out.println(returnLogicSchemeVariable(true, true, false, false));
    }
}