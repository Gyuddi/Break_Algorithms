class INF_07_03_J {
    public int Recursive(int n){
        if(n==1) return 1;
        else return n* Recursive(n-1);
    }
    public static void main(String[] args){
        Main T = new Main();
        System.out.println(T.Recursive(5));
    }
}
