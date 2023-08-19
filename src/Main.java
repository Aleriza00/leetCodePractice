import java.util.*;

public class Main {
    public static void main(String[] args){
        // Бегущая сумма одномерного массива
 //           int[] array = new int[]{2,3,4,5,6};
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(2);
//        arrayList.add(3);
//        arrayList.add(4);
//        arrayList.add(5);
//        arrayList.add(6);
//        int[] results  =new int[arrayList.size()];
//        results[0] = arrayList.get(0);
//        for (int i = 1; i < arrayList.size(); i++) {
//            results[i] = arrayList.get(i)+results[i-1];
//        }
//        System.out.println(Arrays.toString(results));


        //2
//        Set<String> words = new HashSet<>();
//        words.add("Learning ");
//        words.add("Java");
//        words.add("Backend");
//        words.add("dev");
//        System.out.println(words);
//        System.out.println("List contains Java or not: " +     words.contains("Java"));
//        words.remove("Java");
//        words.remove("dev");
//        System.out.println("List after removing one Java and dev  " +words);
//
//        Iterator<String> stringIterator = words.iterator();
//        while (stringIterator.hasNext()){
//            System.out.print(stringIterator.next()+" ,");
//        }
//

        //1 fori
            int[] array = new int[100];
        Random random = new Random();
        int count = 0;
        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(10,100);

            count++;

        }
        System.out.println(Arrays.toString(array));
        System.out.println(count);


        2 foreach

        for (int i:array){
            i = random.nextInt(10,100);
            count++;
            System.out.println(i);
            System.out.println(count);

        }

        //3 while

        int  i =0;
        while (i< array.length-1){

            array[i]= random.nextInt(10,100);
              i++;
              count++;

        }
        for (int i1 : array) {
            System.out.println(i1);
        }

        // алмаштыруу

        int ortom = 1111;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10,100);
            if (array[i]%2==0){
                array[i] = ortom;
            }
        }
        System.out.println(" Array after substitutions");
        for (int i : array) {
            System.out.println(i);
        }



    }
}