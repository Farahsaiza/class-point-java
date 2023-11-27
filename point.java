public class Point {
private float abscisse;
private float cordonne;

// Default constructor
public Point() {
    this.abscisse = 0;
    this.ordonne = 0;
}

// Constructor with parameters
public Point(float abscisse, float ordonne) {
    this.abscisse = abscisse;
    this.ordonne = ordonne;
}


public float getabscisse() {
    return this.abscisse;
}

public float getordonne() {
    return this.ordonne;
}


public void setabscisse(float abscisse) {
    this.abscisse = abscisse;
}

public void setordonne(float ordonne) {
    this.ordonne = ordonne;
}


public float distance(Point p1) {

    float distance =Math.pow(Math.pow(p1.getabsciss()-this.getabscisse , 2) + Math.pow(p1.getordonne- this.getordonne, 2), 0.5);

    return distance;
}


public float norm() {


    float norm = Math.pow(this.abscisse * this.abscisse + this.ordoone * this.ordoone, 0.5);

    return norm;
  }


  public static void  main (string[] arg){
    Point  p1 = new point();
    point  p2 = new point(5,10);
      systeme.out.println(p2.distance(p1));
      sysyeme.out .println(p2.norm());
  
  }