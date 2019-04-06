package com.ashim.solution2.diagram;

import com.ashim.solution2.behaviour.IRefillBehaviour;
import com.ashim.solution2.behaviour.IRepairBehaviour;
import com.ashim.solution2.weapon.IWeapon;

public class Robot extends Soldier implements IRefillBehaviour, IRepairBehaviour {

	public Robot(IWeapon weapon, IRefillBehaviour refillBehavior, IRepairBehaviour repairBehavior) {
		super(weapon, refillBehavior, repairBehavior);
		System.out.println("I am robot");
	}
}