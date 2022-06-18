package com.minseoklim.designpattern.abstractfactory

class PrototypeFactory(
    private val boss: Boss,
    private val smallFlight: SmallFlight,
    private val obstacle: Obstacle
) : EnemyFactory {
    override fun createBoss(): Boss {
        return boss.clone() as Boss
    }

    override fun createSmallFlight(): SmallFlight {
        return smallFlight.clone() as SmallFlight
    }

    override fun createObstacle(): Obstacle {
        return obstacle.clone() as Obstacle
    }
}
