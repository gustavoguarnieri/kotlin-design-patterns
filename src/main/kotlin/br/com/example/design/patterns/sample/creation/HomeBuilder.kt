package br.com.example.design.patterns.sample.creation

class HomeBuilder private constructor(builder: Builder) {
    var wall: Boolean? = null
    var roof: Boolean? = null
    var door: Boolean? = null
    var pool: Boolean? = null
    var backyard: Boolean? = null

    class Builder {
        private var wall: Boolean? = null
        private var roof: Boolean? = null
        private var door: Boolean? = null
        private var pool: Boolean? = null
        private var backyard: Boolean? = null

        fun setWall(wall: Boolean) = apply { this.wall = wall }
        fun setRoof(roof: Boolean) = apply { this.roof = roof }
        fun setDoor(door: Boolean) = apply { this.door = door }
        fun setPool(pool: Boolean) = apply { this.pool = pool }
        fun setBackyard(backyard: Boolean) = apply { this.backyard = backyard }
        fun build() = HomeBuilder(this)

        fun getWall() = wall
        fun getRoof() = roof
        fun getDoor() = door
        fun getPool() = pool
        fun getBackyard() = backyard
    }

    init {
        wall = builder.getWall()
        roof = builder.getRoof()
        door = builder.getDoor()
        pool = builder.getPool()
        backyard = builder.getBackyard()
    }
}