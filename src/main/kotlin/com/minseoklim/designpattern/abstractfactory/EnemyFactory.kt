package com.minseoklim.designpattern.abstractfactory

interface EnemyFactory {
    fun createBoss(): Boss
    fun createSmallFlight(): SmallFlight
    fun createObstacle(): Obstacle
}

class EasyEnemyFactory : EnemyFactory {
    override fun createBoss(): Boss {
        return StrongAttackBoss()
    }

    override fun createSmallFlight(): SmallFlight {
        return DashSmallFlight()
    }

    override fun createObstacle(): Obstacle {
        return RockObstacle()
    }
}

class HardEnemyFactory : EnemyFactory {
    override fun createBoss(): Boss {
        return CloningAttackBoss()
    }

    override fun createSmallFlight(): SmallFlight {
        return MissileSmallFlight()
    }

    override fun createObstacle(): Obstacle {
        return BombObstacle()
    }
}
