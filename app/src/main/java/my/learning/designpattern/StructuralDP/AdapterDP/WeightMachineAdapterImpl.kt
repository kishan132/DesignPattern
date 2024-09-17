package my.learning.designpattern.StructuralDP.AdapterDP

class WeightMachineAdapterImpl : WeightMachineAdapter {

    private val weightMachine = WeightMachineImpl()

    override fun getWeightInKg(): Int {
        return convertPoundToKg(weightMachine.getWeightInPound())
    }

    private fun convertPoundToKg(pound: Int): Int {
        return (pound * 0.453592).toInt()
    }
}