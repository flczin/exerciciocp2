package br.com.flczin.exerciciocp2.model

class TickerResponse(
    val ticker: Ticket
)
class Ticket(
    val high: String,
    val low: String,
    val vol: String,
    val last: String,
    val buy: String,
    val sell: String,
    val date: Long
)