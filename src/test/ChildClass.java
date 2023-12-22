package test;

public class ChildClass extends BaseClass{

    @Override
    public void walking() {
        System.out.println("ChildClass walking");
    }

    @Override
    public void sleeping() {
        System.out.println("ChildClass sleeping");
    }

    @Override
    public void execute() {
        walking();
        sleeping();
//        super.execute();
    }
}
