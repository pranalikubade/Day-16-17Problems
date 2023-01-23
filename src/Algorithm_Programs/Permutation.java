package Algorithm_Programs;

public class Permutation {
    public static void permutation(String str,String str1){
      if (str.length()==0){
          System.out.println(str1);
      }
        for (int i=0;i<str.length();i++){ //str=abc , str=bc
          char ch=str.charAt(i);//a,b ,c
          String x=str.substring(0,i) + str.substring(i+1);//null+bc //null+c //null //a+bc
            permutation(x,str1+ch);// bc, null+a-> p(bc+a) //p(c,ab) //p(null,abc) //p(abc,b)
        }
    }
    public static void main(String[] args) {
        permutation("abc"," ");
    }
}
