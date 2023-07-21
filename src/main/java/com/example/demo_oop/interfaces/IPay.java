package com.example.demo_oop.interfaces;

public interface IPay {
    int payMent();
    default String changeCurrency(int money){
        // 3,000,000,000
        // 1 => 9 -> 7
        // 2 => 6 -> 4
        // 3 => 3 -> 1
        // i => [length - 1] - 3*(i-1) -> [length - 1] - 3*(i-1) -2
        //

        String str_money =   String.valueOf(money);
        String[] str_money_arr = str_money.split("\\.");
        int num_block = str_money_arr[0].length()/3;
        int num_mod  = str_money_arr[0].length()%3;
        String result = "";
        if(num_block>=1){
            for (int i = 1 ; i<= num_block; i++ ){
                result = ","+str_money_arr[0].substring( (str_money_arr[0].length())-(3*(i-1))-3,(str_money_arr[0].length()) - 3*(i-1) ).concat(result);
            }

            return num_mod>0? str_money_arr[0].substring(0,num_mod).concat(result) +" VNĐ": result.substring(1,result.length())+" VNĐ"  ;

        }
        else return result;

//         return str_money;

    }
}
