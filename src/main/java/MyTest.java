public class MyTest {

    String name;

    public MyTest(String t) {
        this.SetName(t);
    }


    public void SetName(String name) {
        if (name == null) {
            throw new NullPointerException("name can not be null");
        }
        this.name = name;

    }

    public static int sum(int a, int b){
        return a+b;
    }

    @Override
    public boolean equals(Object obj) {
        SecondTestClass secondTestClass = (SecondTestClass) obj;

        if (this.name.equals(secondTestClass.type))
            return true;
        else
            return false;
    }
}
