package lesson_11

fun main() {
    Rooms(
        cover = "Fox",
        name = "Катя",
        listOfParticipants = mutableListOf("Александр", "Сергей", "Анастасия", "Мария", "Григорий"),
        speakerStatus = listOf("разговаривает", "микрафон выключен", "пользователь заглушин"),
    )
    Rooms(
        cover = "Sun",
        name = "Александр",
        listOfParticipants = mutableListOf("Александр"),
        speakerStatus = listOf("разговаривает"),
    )
}

class Rooms(
    val cover: String,
    val name: String,
    val listOfParticipants: MutableList<String>,
    val speakerStatus: List<String>,
) {
    fun clickOnAvatar() {

    }

    fun microphoneAction() {

    }
}