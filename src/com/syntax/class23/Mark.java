package com.syntax.class23;

	public abstract class Mark {
		/*/We have to calculate the average of marks obtained in three subjects by student A and by student B. 
		 * Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks. 
		 * Provide implementation of abstract method in classes 'A' and 'B'. 
		 * The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. 
		 * Test your code
		 * 
		 */
		int math, language;
		Mark(int math , int language){
			this.math=math;
			this.language=language;
		}
		abstract void getPercentage();
	}
	class A extends Mark{
		int chemistry;
		A(int math, int language, int chemistry) {
			super(math, language);
			this.chemistry=chemistry;
		}
		void getPercentage() {
			double sum, percent;
			sum=(math+language+chemistry);
			percent=(sum)/3;
			System.out.println("student A average is equal to "+percent);
		}
	}
	class B extends Mark{
		int history, science;
		B(int math, int language, int history, int science){
			super(math, language);
			this.history=history;
			this.science=science;
		}
		@Override
		void getPercentage() {
			double total, percent;
			total=math+language+history+science;
			percent=(total)/4;
			System.out.println("Student B average is equal to "+percent);
		}
	}
	

