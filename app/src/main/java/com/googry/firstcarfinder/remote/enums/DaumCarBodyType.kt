package com.googry.firstcarfinder.remote.enums

enum class DaumCarBodyType(val type: String) {
    SEDAN("SEDAN"),
    COUPE("COUPE"),
    HATCHBACK("HATCHBACK"),
    WAGON("WAGON"),
    SUV("SUV"),
    VAN("VAN"),
    CONVERTIBLE("CONVERTIBLE"),
    PICK_UP_TRUCK("PICK_UP_TRUCK");

    companion object {
        const val KEY = "etcInfo.bodyType"

        fun getParam(bodyTypeList: List<DaumCarBodyType>) =
            "IN" + bodyTypeList.map { it.type }.reduce { acc, salesStatus -> "${acc}__$salesStatus" }
    }
}