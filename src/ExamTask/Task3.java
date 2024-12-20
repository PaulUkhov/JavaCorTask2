package ExamTask;
//Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
public class Task3 {
    public boolean isTrue(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) {
                System.out.println("В переданном массиве есть два соседних элемента с нулевым значением.");
                return true;
            }
        }
        System.out.println("В переданном массиве нет двух соседних элементов с нулевым значением.");
        return false;
    }
}
