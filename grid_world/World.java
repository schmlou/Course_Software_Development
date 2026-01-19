package grid_world;

public class World {

		private int size;
		private int treasure_x;
		private int treasure_y;
		
		public World (int size ) {
			this.size = size;
			this.treasure_x  = (int) Math.random()*size;
			this.treasure_y  = (int) Math.random()*size;
		}
		
		public int getSize() {
			return this.size;
		}
		
		public void setSize(int size) {
			this.size = size;
		}
		
		public boolean hasTreasure(int px, int py) {
			if (px == this.treasure_x && py == this.treasure_y) {
				return true;
			} else {
				return false;
			}
		}
		
	}
