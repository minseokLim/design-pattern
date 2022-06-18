package com.minseoklim.designpattern.abstractfactory

abstract class Obstacle : Cloneable {
    public override fun clone(): Any {
        return super.clone()
    }
}

class RockObstacle : Obstacle()
class BombObstacle : Obstacle()
