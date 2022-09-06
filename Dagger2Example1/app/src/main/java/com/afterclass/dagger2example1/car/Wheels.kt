package com.afterclass.dagger2example1.car



class Wheels {
    //Let's say we don't own this class so we cannot annotate it with @Inject
    private var Rims : Rims
    private var Tires : Tires

    constructor(Rims: Rims, Tires: Tires) {
        this.Rims = Rims
        this.Tires = Tires
    }
}