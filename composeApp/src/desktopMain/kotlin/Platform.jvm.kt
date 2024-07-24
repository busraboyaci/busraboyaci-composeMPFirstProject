import java.time.LocalDate
import java.time.format.DateTimeFormatter

class JVMPlatform: Platform {
    override val name: String = "JVM"
}

actual fun getPlatform(): Platform = JVMPlatform()

actual fun getCurrentDate(): String {
    val current = LocalDate.now()
    val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
    return current.format(formatter)
}