//Exceptionがスローされたmainメソッドが再スローの必要があるのかを確認

class BlackBook_10_31{
    void test() throws Exception{
        System.out.println("test");
    }
    void hoge() throws RuntimeException{
        System.out.println("hoge");
    }

    public static void main(String[] args){
        BlackBook_10_31 b = new BlackBook_10_31();
        b.test();
        b.hoge();
    }    
}

/*
11行目に「throws Exception」を追加すれば実行可
*/
