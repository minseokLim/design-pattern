package com.minseoklim.designpattern.abstractfactory

class Stage(
    val level: Int,
    enemyFactory: EnemyFactory,
    smallFlightCount: Int = 100,
    obstacleCount: Int = 100
) {
    val boss = enemyFactory.createBoss()
    val smallFlights = (1..smallFlightCount).map { enemyFactory.createSmallFlight() }
    val obstacles = (1..obstacleCount).map { enemyFactory.createObstacle() }
}
