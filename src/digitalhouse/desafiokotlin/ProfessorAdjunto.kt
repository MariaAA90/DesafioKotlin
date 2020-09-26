package digitalhouse.desafiokotlin

class ProfessorAdjunto(override val nome: String, override val sobrenome: String, override val codigo: Int,
                       val qtdHorasMonitoria: Int) : Professor(nome, sobrenome, codigo) {

}