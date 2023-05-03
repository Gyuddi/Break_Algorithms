class INF_07_06_J {
    static int n;
    static int[] ch;
    public void Recursive(int L){
        if(L==n+1){
            String tmp="";
            for(int i=1; i<=n; i++){
                if(ch[i]==1) tmp+=(i+" ");
            }
            if(tmp.length()>0) System.out.println(tmp);
        }
        else{
            ch[L]=1;
            Recursive(L+1);
            ch[L]=0;
            Recursive(L+1);
        }
    }

    public static void main(String[] args){
        Main T = new Main();
        n=3;
        ch=new int[n+1];
        T.Recursive(1);
    }
}
