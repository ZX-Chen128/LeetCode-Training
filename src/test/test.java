package test;

public class test {
    private int i = 1;
    public static String str = "outclass";

    class InnerClass { // 成员内部类
        private int i = 2;

        public void innerMethod() {
            int i = 3;
            String str = "123";
            System.out.println("i=" + i);
            System.out.println("i=" + this.i);
            System.out.println("i=" + test.this.i);
            System.out.println("str=" + str);
        }
    }

    public static void main(String[] args) {
        //先创建外部类对象
        test t = new test();
        //创建内部类对象
        test.InnerClass ti = t.new InnerClass();
        //内部类对象调用自己的方法
        ti.innerMethod();
    }
}
