package digitalhouse.desafiokotlin

fun main() {
    val manager = DigitalHouseManager()

    manager.registrarProfessorTitular("João", "Silva", 1, "Kotlin")
    manager.registrarProfessorTitular("Vitória", "Silva", 2, "Java")
    manager.registrarProfessorAdjunto("Maria", "Souza", 3, 2)
    manager.registrarProfessorAdjunto("Victor", "Santos", 4, 3)

    manager.registrarCurso("Full Stack", 20001, 3)
    manager.registrarCurso("Android", 20002, 2)

    manager.alocarProfessores(20001, 1, 3)
    manager.alocarProfessores(20002, 2, 4)

    manager.registrarAluno("Maria", "Armelin", 1)
    manager.registrarAluno("Rafael", "Alves", 2)
    manager.registrarAluno("André", "Gomes", 3)
    manager.registrarAluno("Michele", "Fernandes", 4)
    manager.registrarAluno("Allan", "Figueira", 5)

    manager.matricularAluno(1, 20001)
    manager.matricularAluno(2, 20001)
    
    manager.matricularAluno(3, 20002)
    manager.matricularAluno(4, 20002)
    manager.matricularAluno(5, 20002)
}