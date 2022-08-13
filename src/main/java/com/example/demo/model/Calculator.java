package com.example.demo.model;

public class Calculator {
    private  char operator;
    private  int  number1;
    private  int number2;

    public Calculator() {
    }

    public Calculator(char operator, int number1, int number2) {
        this.operator = operator;
        this.number1 = number1;
        this.number2 = number2;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "operator=" + operator +
                ", number1=" + number1 +
                ", Number2=" + number2 +
                '}';
    }
}
