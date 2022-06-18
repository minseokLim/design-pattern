package com.minseoklim.designpattern.abstractfactory

abstract class SmallFlight : Cloneable {
    public override fun clone(): Any {
        return super.clone()
    }
}

class DashSmallFlight : SmallFlight()
class MissileSmallFlight : SmallFlight()
