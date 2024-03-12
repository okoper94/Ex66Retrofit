package com.kys2024.ex66retrofit

data class DissItem(var response: DissItemResponse)

data class DissItemResponse(var header: ResHeader, var body: ResBody)

data class ResHeader(var resultCod: Int, var resultMsg:String, var type:String)
data class ResBody(var items: List<Item>)

data class Item(var dissCd:String, var dt:String, var znCd:String)


