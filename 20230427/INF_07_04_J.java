class INF_07_04_J {
    public int Recursive(int n){
        if(n==1) return 1;
        else if(n==2) return 1;
        else return Recursive(n-2)+ Recursive(n-1);
    }
    public static void main(String[] args){
        Main T = new Main();
        int n=10;
        System.out.println(T.Recursive(10));
    }
}
