package com.syntax.class28;

interface HasTail{

		abstract int getNumberOfSections();

		 }

		abstract class Insect implements HasTail {

		  abstract int getNumberOfLegs();

		 }

		 public class Beetle extends Insect {

		 int getNumberOfLegs() { return 6; }

		}