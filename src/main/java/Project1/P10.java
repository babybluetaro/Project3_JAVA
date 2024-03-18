package Project1;

public class P10 {
    public static void main(String[] args) {
        String[] words={"AA","BB","CC","AA","AC","CC"};
        for (int i=0;i< words.length;i++)
            for (int j=i+1;j< words.length;j++){
                if (words[i].equals(words[j])){
                    System.out.println(words[i]);
                }
            }



    }
}
