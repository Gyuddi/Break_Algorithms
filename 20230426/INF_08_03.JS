let num =1;


function solution(v){

    function DFS(v){
        if(v>7) return;
        else{
            console.log(v);
            DFS(v*2);
            DFS(v*2+1);
        }
    }
    DFS(v);
}
solution(num);

function solution(v){

    function DFS(v){
        if(v>7) return;
        else{
           
            DFS(v*2);
            console.log(v);
            DFS(v*2+1);
        }
    }
    DFS(v);
}
solution(num);

function solution(v){

    function DFS(v){
        if(v>7) return;
        else{
       
            DFS(v*2);
            DFS(v*2+1);
            console.log(v);
        }
    }
    DFS(v);
}
solution(num);
