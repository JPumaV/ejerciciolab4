public class Principal {
    public static void main(String[] args) {
        // CODIGO PROBANDO LOS EJERCICIOS

        // EJERCICIO II
        int[] arr = { 4, 2, 7, 10, 4, 17 };
        int[] arr1 = { 4, 2, 7, 10, 1, 6 };
        int[] arr2 = { 4, 2, 7, 1, 4, 6 };

        System.out.println("Tercer elemento mas pequeño en arr: " + Select.menorElem(arr, 3));
        System.out.println("Quinto elemento mas pequeño en arr1: " + Select.menorElem(arr1, 5));
        System.out.println("Primer elemento mas pequeño en arr2: " + Select.menorElem(arr2, 1));
    }
}
