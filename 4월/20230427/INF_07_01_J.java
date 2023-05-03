class INF_07_01_J {
    public void Recursive(int n){
        if(n==0) return;
        else{
            Recursive(n-1);
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args){
        Main T = new Main();
        T.Recursive(3);
    }
}
