package ExamTask;
public class Main {
    public static void main(String[] args) {
        // Первое задание
        System.out.println("Первое задание :");
        int[] arr = {2, 1, 2, 3, 4};
        int[] arr2 = {2, 2, 0};
        int[] arr3 = {1, 3, 5};
        Task task = new Task();
        System.out.println(task.countEvens(arr));
        System.out.println(task.countEvens(arr2));
        System.out.println(task.countEvens(arr3));
        //Второе задание
        System.out.println("Второе задание :");
        Task2 task2 = new Task2();
        int resTask2 = task2.difference(arr);
        System.out.println(resTask2);
        //Третье задание
        System.out.println("Третье задание :");
        Task3 task3 = new Task3();
        int[] array = {1,2,0,0,4};
        int[] array2 = {1,2,1,0,4};
        boolean resTask3 = task3.isTrue(array);
        System.out.println(resTask3);
        System.out.println(task3.isTrue(array2));
    }





}

