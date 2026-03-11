package practice;


import linkedlist.FindLengthLinkedList;

public class PracticeClass {
    class InnerClass{

        void print(){
            System.out.println("Innerclass");
        }
    }
    public static void main(String[] args) {

       PracticeClass practiceClass = new PracticeClass();
        InnerClass innerClass = practiceClass.new InnerClass();
        innerClass.print();

    }

}
