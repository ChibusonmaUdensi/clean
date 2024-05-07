int principal = 1000;
       int nnumberOfYear = 30;
       double r = 0.07;
       double bracket = 1 +r;
       
       double bracketSquare = bracket* nnumberOfYear;
       
       double a = principal * bracketSquare;
       
       System.out.println(a);