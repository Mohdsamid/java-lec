public class lec6 {
    //with int a
    //    class Car{
//        int a;
//        Car(int a){
//            this.a=a; // uses of this keyword for declare local variable to initialize
//            System.out.println("hello");
//        }
//    }
//    public void main(String[] args){
//        Car s1= new Car(5);
//        Car s2= new Car(6);
//    }



    //with String type
//    class Car {
//        String name;
//
//        Car(String name) {
//            this.name = name; // uses of this keyword for declare local variable to initialize
//            System.out.println("Name"+" "+name);
//        }
//    }
//
//    public void main(String[] args) {
//        Car s1 = new Car("Samid");
//        Car s2 = new Car("Aly");
//    }
    class Student{
        String name;
        int rollnum;
        double marks;
        void display(){
            System.out.println("Student no 1\n");
            System.out.println("Name:-"+" "+name);
            System.out.println("Roll Number:-"+" "+rollnum);
            System.out.println("Marks:-"+" "+marks);
        }
    }

        public void main(String[] args){
        Student s1= new Student();
        Student s2= new Student();
        Student s3= new Student();
        s1.name="rakesh";
        s1.rollnum=2201;
        s1.marks=64.4d;
            s2.name="Shiva";
            s2.rollnum=2202;
            s2.marks=99.9d;
            s3.name="Anurag";
            s3.rollnum=2203;
            s3.marks=85.999d;

        s1.display();
        s2.display();
        s3.display();
    }
}
