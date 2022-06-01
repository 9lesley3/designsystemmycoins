package com.designsystemmycoins.data

data class DetailsData(
    var description: String = "state",
    var value: Double = 0.5,
    var country: String = "Brasil",
    var conservationState: String = "FC",
    var year: Int = 2015,
){
    fun getDetail(): Map<String, Any> {
        return mapOf(
            "Descrição" to description,
            "Valor" to value,
            "País" to country,
            "Estado de Conservação" to conservationState,
            "Ano" to year
        )
    }
}