class Sum{
    public Sum(int a,int b){
       System.out.println((a+b));
    }

    Public Sum(int a,int b ,int c){
       System.out.println((a+b+c));
    }
    public Sum(Double a,Double b){
        System.out.println((a+b));
    }
}

class Ques1{
    public static void main(String[] args) {
        
        Sum obj1 = new Sum(3,4);
        Sum obj2 = new Sum(5,1,3);
        Sum obj3 = new Sum(2.4,5.2);
    }
}
