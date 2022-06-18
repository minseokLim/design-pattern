package com.minseoklim.designpattern.abstractfactory

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StageTest {
    @Test
    fun test() {
        val easyStage = Stage(1, EasyEnemyFactory())
        assertThat(easyStage.boss).isInstanceOf(StrongAttackBoss::class.java)
        assertThat(easyStage.smallFlights).allMatch { it is DashSmallFlight }
        assertThat(easyStage.obstacles).allMatch { it is RockObstacle }

        val hardStage = Stage(100, HardEnemyFactory())
        assertThat(hardStage.boss).isInstanceOf(CloningAttackBoss::class.java)
        assertThat(hardStage.smallFlights).allMatch { it is MissileSmallFlight }
        assertThat(hardStage.obstacles).allMatch { it is BombObstacle }
    }
}
