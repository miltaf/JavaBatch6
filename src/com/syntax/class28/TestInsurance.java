package com.syntax.class28;

public class TestInsurance {

/*Home Work-April15-2020
Create 3 objects of the sub classes of Insurance interface and store them in ArrayList. 
Using for loop/advanced for loop/ iterator access all methods of the class.
*/
	public static void main(String[] args) {
		Insurance car=new CarInsurance("Nationwide","Honda");
		Insurance pet=new PetInsurance("Nationwide","Bulldog");
		Insurance health=new HealthInsurance("Virginia premier");
		ArrayList<Insurance> aList=new ArrayList<>();
		aList.add(car);
		aList.add(pet);
		aList.add(health);
		System.out.println();
		System.out.println("======Using for each loops===================");
		for(Insurance i:aList) {
			i.getQuote();
			i.cancellInsurance();
			System.out.println("=========================");
		}
		System.out.println("======Using regular for loops===================");
		for(int i=0;i<aList.size();i++) {
			aList.get(i).getQuote();
			aList.get(i).cancellInsurance();
			System.out.println("=========================");
		}
		System.out.println("======Using Iterator===================");
		Iterator<Insurance> it=aList.iterator();
		while(it.hasNext()) {
			Insurance s=it.next();
			s.getQuote();
			s.cancellInsurance();
			System.out.println("=========================");
		}
	}
}
/*
Create a class Insurance that will have an attribute as insuranceName and 
unimplemented behaviour as getQuote and cancelInsurance. 
Create 3 subclasses Car, Pet, Health. Car class has it's own attribute as carModel and 
Class Pet has petType attribute. Create 3 objects of the sub classes and store them in ArrayList. 
Using for loop/advanced for loop/ iterator access all methods of the class. 
*/
public abstract class Insurance {
	String insuranceName;
	Insurance(String insuranceName){
		this.insuranceName=insuranceName;
	}
	public abstract void getQuote();
	public abstract void cancellInsurance();
}
class CarInsurance extends Insurance{
	String carModel;
	CarInsurance(String insuranceName, String carModel) {
		super(insuranceName);
		this.carModel=carModel;
	}
	@Override
	public void getQuote() {
		System.out.println("Here is your quote from "+ insuranceName +" for your "+carModel);
	}
	@Override
	public void cancellInsurance() {
		System.out.println("You can cancel your "+insuranceName+" insurance through your online account");
	}
}
class PetInsurance extends Insurance{
	String petType;
	PetInsurance(String insuranceName, String petType) {
		super(insuranceName);
		this.petType=petType;
	}
	@Override
	public void getQuote() {
		System.out.println("Here is your quote from "+ insuranceName +" for your "+petType);
	}
	@Override
	public void cancellInsurance() {
		System.out.println("You can cancel your "+insuranceName+" insurance through your online account");
	}
}
class HealthInsurance extends Insurance{
	HealthInsurance(String insuranceName) {
		super(insuranceName);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void getQuote() {
		System.out.println("Here is your health quote from "+ insuranceName);
	}
	@Override
	public void cancellInsurance() {
		System.out.println("You can cancel your "+insuranceName+" insurance through your online account");
	}
}
