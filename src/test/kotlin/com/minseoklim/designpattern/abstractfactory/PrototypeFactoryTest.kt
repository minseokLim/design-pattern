package com.minseoklim.designpattern.abstractfactory

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrototypeFactoryTest {
    @Test
    fun test() {
        val specialFactory = PrototypeFactory(CloningAttackBoss(), DashSmallFlight(), BombObstacle())
        val specialStage = Stage(3, specialFactory)

        assertThat(specialStage.boss).matches { it is CloningAttackBoss }
        assertThat(specialStage.smallFlights).allMatch { it is DashSmallFlight }
        assertThat(specialStage.obstacles).allMatch { it is BombObstacle }
    }
}
