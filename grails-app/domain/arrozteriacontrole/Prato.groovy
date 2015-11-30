package arrozteriacontrole

import arrozteriacontrole.enums.TipoPrato

class Prato extends Alimento {
    static hasMany = [ingredientes: Alimento]
    TipoPrato tipoPrato

    static constraints = {

    }
}
