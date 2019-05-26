//nに入れた数字が10以上ならtrue、それ以外ならfalseを返すプログラム

class uratest1{
    public static void main(String[] args){
        int n = 5;
        System.out.println(   judge(n)   );
    }

    public static boolean judge(   int    x){
        if(x>=10){
            return    true   ;
        }
        else{
            return    false  ;
        }
    }
}
