package com;

public class Position {
	public int x=0, y=0; 
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString()
	{
		return "X:" +  Integer.toString(x) + " Y:" + Integer.toString(y);
	}
}
