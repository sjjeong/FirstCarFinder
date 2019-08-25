package com.googry.firstcarfinder.remote.api

import com.googry.firstcarfinder.remote.model.DaumCarResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface DaumAutoApi {
    @GET("proxy/api/mc2/v2/clusters.json?service=auto&type=models")
    suspend fun getCarInfo(
        // @Query("service") service: String,
        // @Query("type") type: String,
        @Query("pageSize") pageSize: Int,
        @Query("page") page: Int,
        @Query("sortField") sortField: String,
        @Query("sortOrder") sortOrder: String,
        @Query("filterKey") filterKey: String,
        @Query("filterVal") filterVal: String
    ): DaumCarResponse
}
/**
https://media.daum.net/proxy/api/mc2/v2/clusters.json?
pageSize=18
page=1
service=auto
type=models
sortField=ranking.pv,
sortOrder=desc
filterKey=etcInfo.salesStatus,etcInfo.segment
filterVal=IN__S__N


https://media.daum.net/proxy/api/mc2/v2/clusters.json?pageSize=18&page=1&service=auto&type=models&sortField=ranking.pv&sortOrder=desc&filterKey=&filterVal=
시판 추가
https://media.daum.net/proxy/api/mc2/v2/clusters.json?pageSize=18&page=1&service=auto&type=models&sortField=ranking.pv&sortOrder=desc&filterKey=etcInfo.salesStatus&filterVal=IN__S__N
시판 단총 추가
https://media.daum.net/proxy/api/mc2/v2/clusters.json?pageSize=18&page=1&service=auto&type=models&sortField=ranking.pv&sortOrder=desc&filterKey=etcInfo.salesStatus&filterVal=IN__S__N__D
시판 단총 미정 추가
https://media.daum.net/proxy/api/mc2/v2/clusters.json?pageSize=18&page=1&service=auto&type=models&sortField=ranking.pv&sortOrder=desc&filterKey=etcInfo.salesStatus&filterVal=IN__S__N__D__U
시판 단종 미정 예정 추가
https://media.daum.net/proxy/api/mc2/v2/clusters.json?pageSize=18&page=1&service=auto&type=models&sortField=ranking.pv&sortOrder=desc&filterKey=etcInfo.salesStatus&filterVal=IN__S__N__D__U__E

시판/경차/해치백
https://media.daum.net/proxy/api/mc2/v2/clusters.json?pageSize=18&page=1&service=auto&type=models&sortField=ranking.pv&sortOrder=desc&filterKey=etcInfo.salesStatus,etcInfo.segment,etcInfo.bodyType&filterVal=IN__S__N,IN__B,IN__HATCHBACK

전부다
https://media.daum.net/proxy/api/mc2/v2/clusters.json?pageSize=18&page=1&service=auto&type=models&sortField=ranking.pv&sortOrder=desc&filterKey=etcInfo.salesStatus,etcInfo.segment,etcInfo.bodyType&filterVal=IN__S__N,IN__A__B__C__D__E,IN__SEDAN__COUPE__HATCHBACK__WAGON__SUV__VAN__CONVERTIBLE__PICK_UP_TRUCK


인기순
https://media.daum.net/proxy/api/mc2/v2/clusters.json?pageSize=18&page=1&service=auto&type=models&sortField=ranking.pv&sortOrder=desc&filterKey=&filterVal=
최신순
https://media.daum.net/proxy/api/mc2/v2/clusters.json?pageSize=18&page=1&service=auto&type=models&sortField=etcInfo.latestReleaseDate&sortOrder=desc&filterKey=&filterVal=
높은가격순
https://media.daum.net/proxy/api/mc2/v2/clusters.json?pageSize=18&page=1&service=auto&type=models&sortField=ranking.maxPrice&sortOrder=desc&filterKey=ranking.maxPrice&filterVal=GT_100
낮은가격순
https://media.daum.net/proxy/api/mc2/v2/clusters.json?pageSize=18&page=1&service=auto&type=models&sortField=ranking.minPrice&sortOrder=asc&filterKey=ranking.maxPrice&filterVal=GT_100
높은 연비순
https://media.daum.net/proxy/api/mc2/v2/clusters.json?pageSize=18&page=1&service=auto&type=models&sortField=ranking.maxEfficiency&sortOrder=desc&filterKey=ranking.maxEfficiency&filterVal=GT_10
낮은 연비순
https://media.daum.net/proxy/api/mc2/v2/clusters.json?pageSize=18&page=1&service=auto&type=models&sortField=ranking.minEfficiency&sortOrder=asc&filterKey=ranking.maxEfficiency&filterVal=GT_10

https://media.daum.net/proxy/api/mc2/v2/clusters.json?pageSize=19&page=1&sortField=etcInfo.latestReleaseDate&sortValue=desc&service=auto&type=models&filterKey=etcInfo.brand&filterVal=buf0002p0038

 */