package com.mack.zoo;

public class Mammal {
	
	    protected int energyLevel;
	    protected static int mammalCount;

	    public Mammal(){
	        this.energyLevel = 100;
	        mammalCount++;

	    }

	    public Mammal(int eLevel){
	        this.energyLevel = eLevel;
	    }
	    // this dot only means the member variables we crated at the beginning
	    //
	    // when we write a method, we need construcotr 
	    // 

	    public double displayEnergy(){
	        System.out.println("Energy Level is: " + this.energyLevel);
	        return this.energyLevel;
	    }






}
