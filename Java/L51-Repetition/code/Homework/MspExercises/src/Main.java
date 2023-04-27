import java.util.HashMap;
import java.util.Map;

public class Main {
    private static String[] strings;

    public static void main(String[] args) {
   //Дан массив строк (не пустой). Написать метод, возвращающий мапу Map где каждая строка является ключем, а значением является true если строка в массиве встречается больше одного раза и false, если только один раз.
        //Примеры:
        //wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
        //wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
        //wordMultiple(["c", "c", "c", "c"]) → {"c": true}
        //Дан список имен, где некоторые имена повторяются. Написать метод,который по имени вернет количество вхождений этого имени в список.
        //Пример: nameToNumberOccurence(List list, String name)
        //Vasia -> 3

        public Map<String,Boolean> wordMultiple (String[] strings){
            Map<String,Boolean> result = new HashMap<>();

            for(String s :strings){
                if(result.containsKey(s)){
                    result.put(s,true);
                }else {result.put(s,false);}
            }
            return result;






    }
}