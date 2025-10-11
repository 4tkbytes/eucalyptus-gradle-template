// Template script for your convenience. Take a look at the docs at TODO

import com.dropbear.DropbearEngine
import com.dropbear.Runnable
import com.dropbear.System

@Runnable
class Script: System {
    override fun load(engine: DropbearEngine) {
        println("I have awoken")
    }

    override fun update(engine: DropbearEngine, deltaTime: Float) {
        println("Updating!")
    }

    override fun destroy(engine: DropbearEngine) {
        println("I have fallen")
    }
}