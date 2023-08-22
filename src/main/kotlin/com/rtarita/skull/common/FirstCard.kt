package com.rtarita.skull.common

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@SerialName("FirstCard")
public data class FirstCard(val card: Card) : Move {
    override fun toString(): String {
        return "First Card: $card"
    }
}