package com.praj.test;

public class PetOwner {
	
	private Pet pet;

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
	public void TamePet()
	{
		this.pet.MakeSound();
	}

}
