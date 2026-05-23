package steve;
import robocode.*;

import robocode.AdvancedRobot;
import robocode.HitRobotEvent;
import robocode.ScannedRobotEvent;

import java.awt.*;

import static robocode.util.Utils.normalRelativeAngleDegrees;


/**
 * Steve - Um robô criado por Evaldo Estefano David e Gabriel Rocha Flores.
 */
public class Steve extends AdvancedRobot
{	
	 // Variáveis que são utilizadas no comportamento do robô
	int velocidade = 5;
	boolean direita = true;

	public void run() {

		// Define as cores do robô
		setColors(new Color(127, 3, 252),new Color(2, 199, 217),new Color(110, 62, 42));

		// Loop principal
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

	public void onScannedRobot(ScannedRobotEvent e) {
		// Verifica a distância do robo escaneado e ajusta a potência do tiro de acordo com a mesma
		if (e.getDistance() <= 200 || getOthers() >= 4) {
		fire(3);
		} else if (e.getDistance() <= 400 && getEnergy() > 20) {
		fire(2);
		} else if (e.getEnergy() <= 0) {
		fire(3);
		} else {
		fire(((8 / (e.getDistance()/100))));
		}
		scan();
	}

	public void onHitByBullet(HitByBulletEvent e) {
		// Temporariamente altera as cores do robô ao ser acertado
		setColors(Color.red,Color.red,Color.red);
		// Aleatoriamente altera a velocidade e distância do robô ao ser acertado
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

	public void onHitWall(HitWallEvent e) {
		 // Ao acertar a parede, o robô tenta voltar ao centro
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
		 // Ao colidir com um robô, verifica se há um inimigo a frente, caso verdadeiro, dispara tiros de máxima potência e tenta colidir múltiplas vezes para acúmular dano de colisão
		if (e.getBearing() > -10 && e.getBearing() < 10) {
			fire(3);
			ahead(30);
		} else {
			// Caso contrário, vira o robô para a direção do inimigo colidido
			turnRight(e.getBearing());
		}
	}
}
