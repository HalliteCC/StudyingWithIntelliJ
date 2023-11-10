fun main(){

    SmartDevice("Android Tv", "Entertainment").turnOn()
    SmartDevice("Android Tv", "Entertainment").turnOff()
}


class SmartDevice (val name: String, val category: String){

    private var deviceStatus = "Online"

    constructor(name: String, category: String, statusCode: Int): this (name, category){
        deviceStatus = when (statusCode){
            0 -> "Offline"
            1 -> "Online"
            else -> "Unknown"
        }
    }

    var speakerVolume = 2
        set(value){
            if (value in 0..100){
                field = value
            }
        }

    fun turnOn() {
        println("Device  is turned on.")
    }

    fun turnOff() {
        println("Smart device is turned off.")
    }
}