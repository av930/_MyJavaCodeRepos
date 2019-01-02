package oop;

/**
 * Created by joongkeun.kim on 16/12/19/019.
 * data 은닉을 제공하고, get/set함수로 interface제공할 수 있다.
 * data 은닉은 class와 class를 분리하여, 변경에서 비교적 상호 자유로워, interface만 고려하면 된다.
 *
 * get/set함수로 제공되니 interface만 유지하면 실제 encapsulatedClass의 변경은 자유로울수 있다는 example
 */
class encapsulatedClass {
    private int ssn;
    private String empName;
    private int empAge;

    //Getter and Setter methods
    public int getEmpSSN(){return ssn;}
    public String getEmpName(){return empName;}
    public int getEmpAge(){return empAge;}
    public void setEmpAge(int newValue){empAge = newValue;}
    public void setEmpName(String newValue){empName = newValue;}
    public void setEmpSSN(int newValue){ssn = newValue;}
}
public class encapsulation{
    public static void main(String args[]){
        encapsulatedClass obj = new encapsulatedClass();
        obj.setEmpName("Mario");
        obj.setEmpAge(32);
        obj.setEmpSSN(112233);
        System.out.println("Employee Name: " + obj.getEmpName());
        System.out.println("Employee SSN: " + obj.getEmpSSN());
        System.out.println("Employee Age: " + obj.getEmpAge());
    }
}
