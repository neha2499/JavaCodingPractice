package designpattern.compositedesignpattern;

public class CompositeTest {

    public static void main(String[] args) {


        ComputerPart.Component hd= new ComputerPart.Leaf(4000, "hdd");
        ComputerPart.Component mouse = new ComputerPart.Leaf(7000,"Mouse");
        ComputerPart.Component monitor= new ComputerPart.Leaf(40200,"Monitor");
        ComputerPart.Component ram= new ComputerPart.Leaf(2120,"ram");
        ComputerPart.Component cpu = new ComputerPart.Leaf(1210, "Cpu");


        ComputerPart.Composite ph = new ComputerPart.Composite("peri");
        ComputerPart.Composite cabinet = new ComputerPart.Composite("Cabinet");
        ComputerPart.Composite mb= new ComputerPart.Composite("MB");
        ComputerPart.Composite computer = new ComputerPart.Composite("Computer");


        mb.addComponent(cpu);
        mb.addComponent(ram);

        ph.addComponent(mouse);
        ph.addComponent(monitor);

        cabinet.addComponent(hd);
        cabinet.addComponent(mb);

        computer.addComponent(ph);
        computer.addComponent(cabinet);



        computer.showPrice();


    }
}
