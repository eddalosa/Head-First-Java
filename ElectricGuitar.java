class ElectricGuitar {
	String brand;
	int numOfPickUps;
	boolean rockStarUsesIt;

	string getBrand () {
		return brand;
	}

	void setBrand (String aBrand) {
		brand = aBrand;
	}

	int getNumOfPickups () {
		 return numOfPickups;
	}
	void setNumOfPickups (int num) {
		numOfPickUps = num;
	}

	boolean getRockStarUsesIt() {
		return rockStarUsesIt;
	}

	void setRockStarUsesIt(boolean yesOrNo){
		rockStarUsesIt = yesOrNo;
	}
}