package se.nackademin;

public class MagicNumbers {

    private String name;
    private int income;
    private String location;
    private int age;
    private int height;

    public int calculateA() {
        //calculate A
        int n = 0;
        int nNames = name.length() - name.replace(" ", "").length()+1;
        n = nNames + age;
        while(n>=10)
            n-=7;
        return n;
    }

    public int calculateB() {
        //calculate B
        int n = location.length();
        n += income;
        while(n>=10)
            n-=7;
        return n;
    }

    public int calculateC() {
        //calculate C
        int n = (calculateA() + calculateB())- height;
        while(n<0)
            n+=10;
        return n;
    }

    public int calculateD() {
        //calculate D
        int n = calculateA();
        if (n>5) n+=calculateB();
        else n+=calculateC();
        n-=income;
        while(n<0)
            n+=10;
        return n;
    }

    public int calculateE() {
        //calculate E
        double n = age * income;
        n = n * income;
        n = n * height;
        Math.sqrt(n);
        while (n>=10)
            n=n/2;
        return (int) Math.round(n);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
