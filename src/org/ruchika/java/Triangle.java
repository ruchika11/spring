package org.ruchika.java;

import java.util.List;

public class Triangle {

	// this code is related to setter and constructor injection

	// private String type;
	// private int height;
	//
	// public String getType() {
	// return type;
	// }
	//
	// public int getHeight() {
	// return height;
	// }
	//
	//
	//// public Triangle(String type,int height){
	//// this.height = height;
	//// this.type = type;
	//// }
	//
	// public Triangle(int height){
	// this.height = height;
	// }
	// public Triangle(String type){
	// this.type = type;
	// }
	//// public void setType(String type) {
	//// this.type = type;
	//// }
	// public void draw(){
	// System.out.println(getType()+" Triangle drawn");
	// }
	// ----------------------------------------------------------------------------------------------------------------------------------

	// this code is related to object injection

	// private Point pointA;
	// private Point pointB;
	// private Point pointC;
	//
	// public Point getPointA() {
	// return pointA;
	// }
	//
	// public void setPointA(Point pointA) {
	// this.pointA = pointA;
	// }
	//
	// public Point getPointB() {
	// return pointB;
	// }
	//
	// public void setPointB(Point pointB) {
	// this.pointB = pointB;
	// }
	//
	// public Point getPointC() {
	// return pointC;
	// }
	//
	// public void setPointC(Point pointC) {
	// this.pointC = pointC;
	// }
	//
	// public void draw(){
	// System.out.println("Point A is (" +getPointA().getX()+")");
	// }

	// --------------------------------------------------------------------------------------------------------------------------------
	// This code is related to use of collection
	// private List<Point> points;
	//
	//
	// public List<Point> getPoints() {
	// return points;
	// }
	//
	//
	//
	// public void setPoints(List<Point> points) {
	// this.points = points;
	// }
	//
	//
	//
	// public void draw(){
	// for(Point point:points){
	// System.out.println("Point A is (" +point.getX()+")");
	// }
	// }

	// ---------------------------------------------------------------------------------------------------------------------------------
	// This code is related to auto wiring
	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
		System.out.println("Point A is (" + getPointA().getX() + ")");
	}

}
