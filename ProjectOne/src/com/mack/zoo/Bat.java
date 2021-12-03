package com.mack.zoo;

public class Bat extends Mammal {
	
	    public Bat(){
	        super();
	        this.energyLevel = 300;
	    }

	    public void fly(){
	    	if(this.energyLevel < 50) {
	    		System.out.println("Bat is a weak lame ho and can't fly right now, feed it more bodies");
	    	}
	    	else {
	    	System.out.println("Past Energy Level Is: " + this.energyLevel);
	        System.out.println("WHOOSH WHOOSH Bat is Flying");
	        
	        this.energyLevel -= 50;
	        System.out.println("New Energy Level Is After Flying: " + this.energyLevel); }
	        

	    } 

//	    public void eatHumans(){
//	        System.out.println("MUNCH MUNCH, humans taste good");
//	        System.out.println("Current Energy Level: " + this.energyLevel);
//	        this.energyLevel += 25;
//	        System.out.println("Energy Level After Eating Human: " + this.energyLevel);
//
//	    }

	    public void attackTown(){
	        System.out.println("TOWN ON FIRE");
	        System.out.println("Current Energy Level: " + this.energyLevel);
	        this.energyLevel -= 100;
	        System.out.println("Energy Level After Attacking Town: " + this.energyLevel);

	    }
	    
	    public void eatHumans(){
	        System.out.println("MUNCH MUNCH, humans taste good");
	        System.out.println("Current Energy Level: " + this.energyLevel);
	        this.energyLevel += 25;
	        this.displayEnergy();

	    }


	
	
}
