package com.example.chucknorrisapp

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Serializable
class Joke(val categories:List<String>,@SerialName("created_at") val createdAt: String, @SerialName("icon_url") val iconUrl:String, val id :String, @SerialName("updated_at") val updatedAt:String, val url : String, val value : String)

fun main() {
    val data = Joke(emptyList(),"2020-01-05 13:42:26.766831", "https://assets.chucknorris.host/img/avatar/chuck-norris.png","pyNXTV7WThiNLRykGsQmrg","2020-01-05 13:42:26.766831","https://api.chucknorris.io/jokes/pyNXTV7WThiNLRykGsQmrg","The hills are alive with the sound of Chuck Norris' dong slapping against his legs while he walks.")
    println(Json.encodeToString(data))
}