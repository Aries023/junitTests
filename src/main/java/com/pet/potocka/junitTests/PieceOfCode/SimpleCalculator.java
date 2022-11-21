package com.pet.potocka.junitTests.PieceOfCode;

public class SimpleCalculator {

    //this method give you sum of 2 numbers
    public int add(int a, int b){
        return a + b;
    }

    // this method give you degree (for example if you pass exam (F means you failed, A means you are the best))
    public char degree (int arg){
        if (arg < 0 || arg > 100){
            throw new IllegalArgumentException("Degree number is under 0, or upper 100");
        }
        else {
            if (arg < 60){
                return 'F';
            }else {
                if (arg < 70){
                    return 'D';
                }else {
                    if (arg<80){
                        return 'C';
                    }else {
                        if (arg<90){
                            return 'B';
                        }
                        else {
                            return 'A';
                        }
                    }
                }
            }
        }

    }
}
