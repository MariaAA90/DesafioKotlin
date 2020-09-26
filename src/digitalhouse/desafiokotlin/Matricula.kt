package digitalhouse.desafiokotlin

import java.util.*

class Matricula(val aluno: Aluno, val curso: Curso) {
    val data: Date

    init {
        data = Date()
    }
}
