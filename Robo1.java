package robo1;
import robocode.*;
//import java.awt.Color;

// API help : https://robocode.sourceforge.io/docs/robocode/robocode/Robot.html
import robocode.AdvancedRobot;
import robocode.HitRobotEvent;
import robocode.ScannedRobotEvent;

import java.awt.*;

import static robocode.util.Utils.normalRelativeAngleDegrees;


/**
 * Robo1 - a robot by (your name here)
 */
public class Robo1 extends AdvancedRobot
{
	int velocidade = 5;
	boolean direita = true;
	/**
	 * run: Robo1's default behavior
	 */
	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		setColors(new Color(127, 3, 252),new Color(2, 199, 217),new Color(110, 62, 42)); // body,gun,radar

		// Robot main loop
		while(true) {
			setColors(new Color(127, 3, 252),new Color(2, 199, 217),new Color(110, 62, 42));
			setMaxVelocity(velocidade);
			setAhead(10000);
			if (direita) {
			turnRight(500);
			} else {
			turnLeft(500);
			}
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		if (e.getDistance() <= 200 || getOthers() >= 4) {
		fire(3);
		}
		else if (e.getDistance() <= 400 && getEnergy() > 20) {
		fire(2);
		} else if (e.getEnergy() <= 0) {
		fire(3);
		}
		scan();
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		setColors(Color.red,Color.red,Color.red);
		if (((e.getBearing() > -160 && e.getBearing() < 160) && getOthers() > 5) && ((getBattleFieldHeight() * getBattleFieldWidth())/2) >= 180000  ) {
			setTurnGunRight(180);
		}
		double variacao = Math.random();
		if (Math.random() >= 0.7) {
			velocidade += Math.round(variacao * 2);
		} else {
			velocidade -= Math.round(variacao * 2);
		}
		if (velocidade > 8 || velocidade < 5) {
			velocidade = 5;
		}
		if (Math.random() >= 0.7) {
			if (direita == true) {
				direita = false;
			} else {
				direita = true;
			} 
		}
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		 // Replace the next line with any behavior you would like
		if (getX() < 50){
		setMaxVelocity(8);
		setTurnRight(normalRelativeAngleDegrees(90 - getHeading()));
		setAhead(getBattleFieldWidth() / 2);
		}
		if (getX() > (getBattleFieldWidth() - 50)){
		setMaxVelocity(8);
		setTurnRight(normalRelativeAngleDegrees(270 - getHeading()));
		setAhead(getBattleFieldWidth() / 2);
		}
		if (getY() < 50){
		setMaxVelocity(8);
		setTurnRight(normalRelativeAngleDegrees(0 - getHeading()));
		setAhead(getBattleFieldHeight() / 2);
		}
		if (getY() > (getBattleFieldHeight() - 50)){
		setMaxVelocity(8);
		setTurnRight(normalRelativeAngleDegrees(180 - getHeading()));
		setAhead(getBattleFieldHeight() / 2);
		}
	}	
	public void onHitRobot(HitRobotEvent e) {
		if (e.getBearing() > -10 && e.getBearing() < 10) {
			fire(3);
			ahead(30);
		} else {
			turnRight(e.getBearing());
		}
	}
}
