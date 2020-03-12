package com.syntax.class01;

public class NestingIf {

	public static void main(String[] args) {
		/*
		 * if student completed the quiz, we will check for a score if score >90 --> Great job, you studied a lot
		 * great job if score >80 --> well done if score >70 --> you could have done better
		 * if student did not complete the quiz --> not good, please do homework ontime
		 */

		boolean quizCompleted=false;
		int score=60;

		if (quizCompleted) {
			System.out.println("let's check your score");
			if(score>90) {
				System.out.println("Great job, you studied a lot");
			} else if (score>80) {
				System.out.println("well done");
			}else if (score>70) {
				System.out.println("you could have done better");
		}else {
				System.out.println("You failed");
			}
		}else {
			System.out.println("you did not take the quiz");
		}
	}
}
