class INF_07_02_J {
    public void Recursive(int n){
        if(n==0) return;
        else{
            Recursive(n/2);
            System.out.print(n%2);
        }
    }
    public static void main(String[] args){
        Main T = new Main();
        T.Recursive(11);
    }
}
