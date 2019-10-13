package exercise;

public class Robot {
	public static final int N = 1;
	public static final int E = 2;
	public static final int S = 3;
	public static final int W = 4;
	int x = 0;
	int y = 0;
	int cp = N;
	
	public Robot() {
	}
	
	public void setPosition(int x, int y, int cp) {
		this.x = x;
		this.y = y;
		this.cp = cp;
	}
	
	public void printPosition() {
		char dir = 'N';
		
		if (cp == N)
			dir = 'N';
		else if (cp == E)
			dir = 'E';
		else if (cp == S)
			dir = 'S';
		else if (cp == W)
			dir = 'W';

		System.out.println(x + " " + y + " " + dir);
	}
	
	public void parseAll(String cmd) {
		for (int idx = 0; idx < cmd.length(); idx++) {
			parseOne(cmd.charAt(idx));
		}
	}
	
	private void parseOne(Character cmd) {
		if (cmd.equals('L'))
			turnLeft();
		else if (cmd.equals('R'))
			turnRight();
		else if (cmd.equals('M'))
			move();
		else
			throw new IllegalArgumentException("Not valid input");
	}
	
	private void move() {
		if (cp == N)
			this.y++;
		else if (cp == E)
			this.x++;
		else if (cp == S)
			this.y--;
		else if (cp == W)
			this.x--;
	}
	
	private void turnLeft() {
		cp = (cp - 1) < N ? W : cp - 1;
	}
	
	private void turnRight() {
		cp = (cp + 1) > W ? N : cp + 1;
	}
	
	public static void main(String args[]) {
		Robot robot = new Robot();
		
		robot.setPosition(1, 2, N);
		robot.parseAll("LMLMLMLMM");
		robot.printPosition();
		
		robot.setPosition(3, 3, E);
		robot.parseAll("MMRMMRMRRM");
		robot.printPosition();
	}
}