package lesson_11

fun main() {
    Room(
        cover = "Fox",
        name = "Катя",
        speakerStatus = listOf("разговаривает", "микрафон выключен", "пользователь заглушин"),
    )

    Member(
        listOfParticipants = mutableListOf("Александр"),
    )

    User5(
        cover = "Mouse",
        name = "Mickey",
    )

    Room(
        cover = "Sun",
        name = "Александр",
        speakerStatus = listOf("разговаривает"),
    )
}

class Member(
    val listOfParticipants: MutableList<String>,
)

class User5(
    val cover: String,
    val name: String,
)

class Room(
    val cover: String,
    val name: String,
    val speakerStatus: List<String>,
) {
    fun clickOnAvatar() {

    }
    fun microphoneAction() {

    }
}