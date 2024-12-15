package ExamTask;
//Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
public class Task3 {
    public boolean isTrue(int[] arr){
        boolean yes = true;
        boolean no = false;
        int countNext = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                countNext++;
            }
        }
        if (countNext == 2) {
            System.out.println("В переданном массиве есть два соседних элемента, с нулевым значением.");
        }else{
            System.out.println("В переданном массиве нет двух соседних элемента, с нулевым значением.");
            return no;
        }
        return yes;
    }
}
