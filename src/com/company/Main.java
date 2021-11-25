package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s="rus";
        Phrases phrases;
        if(s.equals("rus")){
            phrases=new Russian();
        }
        else{
            phrases=new English();
        }
        phrases.hello();
    }
}
