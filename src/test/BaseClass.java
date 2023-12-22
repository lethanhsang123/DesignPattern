package test;

public class BaseClass {

    protected void walking() {
        System.out.println("Base class walking");
    }

    protected void sleeping() {
        System.out.println("Base class sleeping");
    }

    protected void execute() {
        walking();
        sleeping();
    }

}
