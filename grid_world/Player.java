package grid_world;

public class Player {
	
		private String name;
		private int playerX;
		private int playerY;
		
		public Player (String name) {
			this.name = name;
			this.playerX = 0;
			this.playerY = 0;
		}
		
		public String getName() {
			return this.name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public int getPlayerX() {
			return this.playerX;
		}
		
		public void setPlayerX(int playerX) {
			this.playerX = playerX;
		}
		
		public int getPlayerY() {
			return this.playerY;
		}
		
		public void setPlayerY(int playerY) {
			this.playerY = playerY;
		}
		
		public void moveRight() {
			this.playerX += 1;
		}
		
		public void moveLeft() {
			this.playerX -= 1;
		}
		
		public void moveUp() {
			this.playerY -= 1;
		}
		
		public void moveDown() {
			this.playerY += 1;
		}
	}

