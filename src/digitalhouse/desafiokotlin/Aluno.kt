package digitalhouse.desafiokotlin

class Aluno(val nome: String, val sobrenome: String, val codigo: Int) {
    override fun equals(other: Any?): Boolean {
        if (other !is Aluno) return false

        return this.codigo == other.codigo
    }

    override fun toString(): String {
        return "$codigo - $nome $sobrenome"
    }
}