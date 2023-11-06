package lesson_11

fun main() {
    Room(
        cover = "Fox",
        name = "Катя",
        listOfParticipants = mutableListOf(),
    )
    User5(
        cover = "Mouse",
        name = "Mickey",
        speakerStatus = listOf ("разговаривает"),
    )
}

class User5(
    val cover: String,
    val name: String,
    val speakerStatus: List<String>,
)

class Room(
    val cover: String,
    val name: String,
    val listOfParticipants: MutableList<User5>,
) {
    fun clickOnAvatar() {

    }

    fun microphoneAction() {

    }
}