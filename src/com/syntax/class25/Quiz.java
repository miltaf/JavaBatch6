package com.syntax.class25;

public interface Quiz{

	  default void display() {
		 
		  return;
		  }

		}

interface Functions extends Quiz{

		  void add1(double firstNumber, double secondNumber);

		  void subtract1 (double firstNumber, double secondNumber);

		  void multiply1(double firstNumber, double secondNumber);

		  void divide1(double firstNumber, double secondNumber);

		class Main implements Functions {

		public void add1(double firstNumber, double secondNumber){
		  System.out.println(firstNumber+secondNumber);
		}

		public void subtract1(double firstNumber, double secondNumber){
		  System.out.println(firstNumber-secondNumber);
		}

		public void multiply1(double firstNumber, double secondNumber){
		  System.out.println(firstNumber*secondNumber);
		}

		public void divide1(double firstNumber, double secondNumber){
		  System.out.println(firstNumber/secondNumber);
		}
		
		public void mainMethod(){
		  double firstNumber=100.00;
		  double secondNumber=20.00;
		}
		public static void main (String[] args){
		  Quiz calculate = new Main();
		  (firstNumber, secondNumber).add1();
		  calculate.subtract1();
		  calculate.multiply1();
		  calculate.divide1();
		}

			
		}
		}