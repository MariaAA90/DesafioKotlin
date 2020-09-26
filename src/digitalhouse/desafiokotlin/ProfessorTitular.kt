package digitalhouse.desafiokotlin

class ProfessorTitular(override val nome: String, override val sobrenome: String, override val codigo: Int,
                       val especialidade: String) : Professor(nome, sobrenome, codigo) {

}