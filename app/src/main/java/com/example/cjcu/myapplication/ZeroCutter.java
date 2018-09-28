package com.example.cjcu.myapplication;

public class ZeroCutter {

    String sum;
    public ZeroCutter(String sum){
        this.sum = sum;
    }

    public int ZeroCutter(){
        int ZeroFinalPos = 0;
        for(int i=sum.length()-1;i>=0;i--){
            if(sum.charAt(i) == '.') {
                ZeroFinalPos = i;
                break;
            }
            else if(sum.charAt(i)!= '0'){
                ZeroFinalPos = i+1;
                break;
            }
        }
        return ZeroFinalPos;
    }
}
