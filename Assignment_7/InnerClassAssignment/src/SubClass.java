public class SubClass  extends BaseClass{

    class SubInnerClass extends BaseClass.BaseInnerClass{
        SubInnerClass(String str){
            super(str);
        }
    }
}
