package arrozteriacontrole.enums

/**
 * Created by andrecunha on 06/11/15.
 */
enum TipoPrato {

    MISTURA('Quilo'),
    MOLHO('Molho'),
    ARROZ('Arroz')

    String tipo

    public Status(String tipo) {
        this.tipo = tipo
    }

    @Override
    String toString() {
        return tipo
    }

    String getKey() { name() }

    def toList() {
        [MISTURA, MOLHO, ARROZ]
    }
}
