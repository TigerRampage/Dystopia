package com.dreamstone.world;

import com.dreamstone.tile.Tile;

public class Coordinate {

	public final int xCoordinate;
	public final int yCoordinate;
	private Tile tileType;

	protected Coordinate() {
		this(0, 0, null);
	}

	protected Coordinate(int x, int y) {
		this(x, y, null);
	}

	protected Coordinate(int x, int y, Tile t) {
		xCoordinate = x;
		yCoordinate = y;
		tileType = t;
	}

	public void setTile(Tile t) {
		tileType = t;
	}

	public Tile getTile() {
		return tileType;
	}

	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Coordinate)) {
			return false;
		}

		Coordinate c = (Coordinate) obj;
		return (this.xCoordinate == c.xCoordinate)
				&& (this.yCoordinate == c.yCoordinate);
	}

	@Override
	public String toString() {
		return "(" + xCoordinate + ", " + yCoordinate + ")";

	}
}