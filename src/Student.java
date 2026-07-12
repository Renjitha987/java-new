class Student{
    static String college="ABC colege";
    String name;
    Student(String n){
        name=n;
    }
    void display(){
        System.out.println(name + "studies in" + college);
    }
    public static void main(String[] args){
        Student s1=new Student("Anu");
        Student s2= new Student("Rahul");
        s1.display();
        s2.display();

    }

}