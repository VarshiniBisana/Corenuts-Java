package com.cnf.nov21;

public class StaticPolymorphsimClassObject extends StaticPolymorpshism{
public static void main(String[] args) {
	

	StaticPolymorpshism stat = new StaticPolymorphsimClassObject();
	stat.emotions();
	stat.emotions(5, 9);
	stat.emotions(1, null);
	stat.emotions(stat);


}	
}