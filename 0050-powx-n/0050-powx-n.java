class Solution {
    public double myPow(double n, int p) {
        long P = p;

        if(P<0){
            // n = 1/n;
            P = -P;
        }

        if(p<0){
            return 1.0/solve(n, P);
        }else{
            return solve(n, P);
        }
        

    }


    double solve(double n, Long p){
        if(p == 0){
            return 1;
        }

        double half = solve(n, p/2);

        if(p%2 == 0){

            return half*half;
            
        }else{

            return n*half*half;

        }
    }
}








// long P = p;

//         if(P<0){
//             n = 1/n;
//             P = -P; 
//         }
//         return solve(n, P);
        
//     }
//     private double solve(double n, long p){
//         if(p == 0){
//             return 1.0;        
//         }


//         double h = solve(n, p/2);

//         if( p % 2 == 0){
//             return h*h;
//         }else{
//             return n*h*h;
//         }
