package com.challengeteamkotlin.campdaddy.fixture.product

import com.challengeteamkotlin.campdaddy.domain.model.product.Category
import com.challengeteamkotlin.campdaddy.domain.model.product.ProductEntity
import com.challengeteamkotlin.campdaddy.fixture.member.MemberFixture.seller

object ProductFixture {
    val tent = ProductEntity(seller, 100_000, null, "텐트 빌려드려요", "텐트 빌려드림ㅇㅇ", Category.TENTS)
}