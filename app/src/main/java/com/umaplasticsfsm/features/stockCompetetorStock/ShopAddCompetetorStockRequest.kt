package com.umaplasticsfsm.features.stockCompetetorStock

import com.umaplasticsfsm.features.stockAddCurrentStock.ShopAddCurrentStockList

class ShopAddCompetetorStockRequest {
    var user_id: String? = null
    var session_token: String? = null
    var competitor_stock_id: String? = null
    var shop_id: String? = null
    var visited_datetime: String? = null
    var competitor_stock_list: List<ShopAddCompetetorStockProductList>? = null

}