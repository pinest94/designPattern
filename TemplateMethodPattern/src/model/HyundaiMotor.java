/*
 * name        : HyundaiMotor.java
 * description : Hyundai motor model
 * date        : 2019.11.07
 * writer      : hansol kim
 */

package model;

import enumeration.Direction;
import enumeration.DoorStatus;
import enumeration.MotorStatus;

public class HyundaiMotor extends Motor{

	public HyundaiMotor(Door door) {
		super(door);
	}
	
	private void moveHyundaiMotor(Direction direction) {
		// TODO: Hyundai Motor를 구동시킴
	}

	public void move(Direction direction) {
		MotorStatus motorStatus = getMotorStatus();
		if(motorStatus == MotorStatus.MOVING)
			return;
		
		DoorStatus doorStatus = door.getDoorStatus();
		if(doorStatus == DoorStatus.OPENED)
			door.close();
		
		// motor와 door체크 후 이상 없으면 작업수행
		// 작업 : moveHyundaiMotor메서드 수행 및 motorStatus에 status기록
		moveHyundaiMotor(direction);
		setMotorStatus(MotorStatus.MOVING);
	}
}
