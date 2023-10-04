/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tank_Destroyer;º
import java.awt.Color;
import robocode.BulletHitEvent;
import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.HitWallEvent;
import robocode.Robot;
import robocode.ScannedRobotEvent;

/**
 *
 * @author Alumne
 */
public class Tank_Destroyer extends Robot{

public void run() {
		int i=0;

		if((300 < getY() && getY() < 400)&&(350 < getX() && getX() < 450)){ //Estamos en el centro y no nos combiene
			back(400);
		}
		setColors(Color.black,Color.red,Color.red); // cuerpo,arma,radar

		while(true) {
			if (getOthers() == 1 && getEnergy() > 50) {
				turnGunRight(30);
				ahead(50);
				turnRight(30);
			} else if (getOthers() == 1 && getEnergy() <= 50) {
				turnGunRight(30);
				ahead(100);
				turnRight(30);
			} else {
				for(i=0;i<4;i++) {
					ahead(100);
					turnRight(90);
				}
			}
		}
	}

	/**
	 * onScannedRobot: Que hacer cuando ve otro robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		if (e.getDistance() > 300)
			fire(1);
		else if (e.getDistance() > 200)
			fire(2);
		else if (e.getDistance() > 100)
			fire(3);	
		
		if (getOthers()==1)
			turnGunLeft(40);
	}

	/**
	 * onHitByBullet: Que hacer cuando recibo un disparo
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		ahead(20);
		if (getOthers()==1)
			turnGunLeft(20);
	}	
	/**
	 * onHitWall: Que hacer cuando choco con la pared
	 */
	public void onHitWall(HitWallEvent e) {
		if(e.getBearing() > -90 && e.getBearing() <= 0){	//Chocamos por la parte delante izquierda
			turnRight(135);
			ahead(100);
		}
		if(e.getBearing() > 0 && e.getBearing() <= 90){		//Chocamos por la parte delante derecha
			turnLeft(135);
			ahead(100);
		}
		if(e.getBearing() > 90 && e.getBearing() <= 180){	//Chocamos por la parte trasera derecha
			turnLeft(75);
			ahead(100);
		}
		if(e.getBearing() > -180 && e.getBearing() < -90){	//Chocamos por la parte trasera izquierda
			turnRight(75);
			ahead(100);
		}
	}
	public void onHitRobot(HitRobotEvent e) {
		if (e.getBearing() > -20 && e.getBearing() < 20) {	//Tiro seguro
			fire(3);
		}
		back(30);
		turnRight(30);
	}
	public void onBulletHit(BulletHitEvent e) {
		if (getOthers()==1)
			turnGunRight(30);
	}
}

