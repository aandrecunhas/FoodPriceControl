package arrozteriacontrole.enums

/**
 * Created by andrecunha on 06/11/15.
 */
enum Unidade {
    KG('Quilo'),
    GRAMA('Grama'),
    CAIXA('Caixa'),
    LITRO('Litro'),
    ML('MiliLitro'),
    MACO('Maço')

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
        [KG, GRAMA, CAIXA, LITRO, ML, MACO]
    }
}