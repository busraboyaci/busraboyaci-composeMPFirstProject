
class WasmPlatform: Platform {
    override val name: String = "Web with Kotlin/Wasm"
}

actual fun getPlatform(): Platform = WasmPlatform()
actual fun getCurrentDate(): String {
//    val date = ()
//    val year = date.getFullYear()
//    val month = (date.getMonth() + 1).toString().padStart(2, '0') // Month is zero-based
//    val day = date.getDate().toString().padStart(2, '0')
//    return "$year-$month-$day"
    return "its on web"
}