package my.learning.designpattern.StructuralDP.FacadeDP

class ACFacade {

    // it "has a" relationship with AC units
    val acExternalUnit = ACExternalUnit()
    val acInternalUnit = ACInternalUnit()

    fun turnONAc() {
        acInternalUnit.acceptUserTempCmd()
        acExternalUnit.checkVoltage()
        acExternalUnit.consumeNitrogen()
        acExternalUnit.startCondenser()
    }

}