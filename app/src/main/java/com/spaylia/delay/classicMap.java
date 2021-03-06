package com.spaylia.delay;

public class classicMap {

	private int[][] map;

	public classicMap() {
		map = new int[][]{	{1, 1, 1, 1, 1, 1, 1},
							{1, 0, 0, 0, 0, 3, 1},
							{1, 0, 1, 1, 1, 1, 1},
							{1, 0, 0, 0, 0, 0, 1},
							{1, 1, 1, 1, 1, 0, 1},
							{1, 2, 0, 0, 0, 0, 1},
							{1, 1, 1, 1, 1, 1, 1}};
	}

	public void setMap(int level) {
		if(level == 2)
			map = new int[][]{	{1, 1, 1, 1, 1, 1, 1},
								{1, 2, 0, 0, 0, 0, 1},
								{1, 0, 1, 1, 1, 0, 1},
								{1, 0, 0, 0, 1, 0, 1},
								{1, 0, 1, 0, 1, 1, 1},
								{1, 0, 1, 0, 0, 3, 1},
								{1, 1, 1, 1, 1, 1, 1}};
		if(level == 3)
			map = new int[][]{	{1, 1, 1, 1, 1, 1, 1, 1, 1},
								{1, 2, 0, 0, 0, 0, 0, 0, 1},
								{1, 1, 1, 0, 1, 1, 1, 0, 1},
								{1, 0, 0, 0, 1, 0, 0, 0, 1},
								{1, 1, 1, 1, 1, 0, 1, 1, 1},
								{1, 0, 0, 0, 0, 0, 1, 0, 1},
								{1, 0, 1, 1, 0, 1, 1, 0, 1},
								{1, 0, 1, 1, 0, 0, 0, 3, 1},
								{1, 1, 1, 1, 1, 1, 1, 1, 1}};
		if(level == 4)
			map = new int[][]{	{1, 1, 1, 1, 1, 1, 1, 1, 1},
								{1, 2, 0, 0, 1, 0, 0, 0, 1},
								{1, 1, 1, 0, 1, 0, 1, 0, 1},
								{1, 0, 0, 0, 1, 3, 1, 0, 1},
								{1, 0, 1, 0, 1, 1, 1, 0, 1},
								{1, 0, 1, 0, 1, 0, 0, 0, 1},
								{1, 0, 1, 1, 1, 0, 1, 0, 1},
								{1, 0, 0, 0, 0, 0, 1, 0, 1},
								{1, 1, 1, 1, 1, 1, 1, 1, 1}};
	}

	public int[][] getMap() {
		return map;
	}

	public int getNbRow() {
		return map.length;
	}

	public int getNbColumn() {
		return map[0].length;
	}
}