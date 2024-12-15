package ExamTask;
//Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.
public class Task2 {
public int difference(int[] arr){
    int maxNum = arr[0];
    int minNum = arr[0];
if (arr.length == 0){
    throw new IllegalArgumentException("Массив не должен быть пустым");
}
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > maxNum) {
            maxNum = arr[i];
        }
        if (arr[i] <= minNum) {
            minNum = arr[i];
        }
    }
    return maxNum - minNum;
}
}
