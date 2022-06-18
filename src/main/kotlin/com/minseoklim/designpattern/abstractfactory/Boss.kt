package com.minseoklim.designpattern.abstractfactory

abstract class Boss : Cloneable {
    public override fun clone(): Any {
        return super.clone()
    }
}

class StrongAttackBoss : Boss()
class CloningAttackBoss : Boss()
