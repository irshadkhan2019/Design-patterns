package com.izuku.flyweight;

import java.util.ArrayList;
import java.util.List;

public class PointService {
  private PointIconFactory iconFactory;

  public PointService(PointIconFactory iconFactory) {
    this.iconFactory = iconFactory;
  }

  public List<Point> getPoints(){
    List<Point> points = new ArrayList<>();
    Point point = new Point(1, 2, iconFactory.getPointIcon(PointType.CAFE));
    points.add(point);

    Point point2 = new Point(10, 12, iconFactory.getPointIcon(PointType.RESTAURANT));
    points.add(point2);

    return points;
  } 
}
