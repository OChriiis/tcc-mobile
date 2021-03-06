package com.example.towersadmin.utils

object Constants {
    const val localhost = "192.168.18.35:3333"
    const val BASE_URL = "http://$localhost"
    const val SINDICO_URL = "/sessionsSindicos"
    const val LOGIN_URL = "/sessionsMoradores"
    const val VISITANTE_MORADOR_URL = "/visitantes/morador/{morador_id}"
    const val VISITANTE_SINDICO_URL = "/visitantes/sindico/{sindico_id}"
    const val AVISOS_URL = "/avisos"
    const val LISTAR_AVISOS_URL = "/buscar_avisos/{id}"
    const val DELETAR_AVISO = "/avisos/{id}"
    const val LISTAR_VISIT_SIND_URL = "/visitantes/sindico"
    const val LISTAR_VISIT_MORA_URL = "/visitantes/morador"
    const val AGENDAMENTO_URL = "/agendamentos"
    const val LISTAR_AGENDAMENTOS_URL = "/agendamento/{id}"
    const val CHAT_URL = "http://$localhost"
    const val PAGAMENTO_URL = "http:/$localhost/"

//    const val POSTS_URL = "posts"
}   