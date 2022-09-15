package com.tns.springaw;

public class Human {
	Heart heart;
	Human()
	{
		
	}
	@Autowired
	@Qualifier("octopusHeart")
	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public void startPumping()
	{
		heart.pump();
		System.out.println("name of the animal is "+heart.getNameOfAnimal());
		System.out.println("name of the animal is "+heart.getNoOfHeart());
	}
}