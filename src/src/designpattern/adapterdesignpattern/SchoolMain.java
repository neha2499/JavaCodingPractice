package designpattern.adapterdesignpattern;

public class SchoolMain {

    public static void main(String[] args) {

//        Pen p= new Pen() ;
//
//        AssignmentWork assignmentWork= new AssignmentWork();
//        assignmentWork.setP(p);
//        assignmentWork.writeAssignment("I want to write the assignment");
//        // the above code will throw the error because the interface p is not providing the implementation


        Pen p= new PenAdapter() ;
        AssignmentWork assignmentWork= new AssignmentWork();
        assignmentWork.setP(p);
        assignmentWork.writeAssignment("I want to write the assignment");

    }
}
