package digitalhouse.desafiokotlin

abstract class Professor(open val nome: String, open val sobrenome: String, open val codigo: Int) {
    var tempoDeCasa = 0

    override fun equals(other: Any?): Boolean {
        if (other !is Professor) return false

        return this.codigo == other.codigo
    }
}