package com.example.towersadmin.data

data class Aviso(
    var avisoId: Int,
    var titulo: String,
    var mensagem: String,
    var link: String?,
    var status: String?,
    var data: String?,
)
