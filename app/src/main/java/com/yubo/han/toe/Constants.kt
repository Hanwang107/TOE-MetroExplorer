package com.yubo.han.toe

/**
 * Created by han on 9/26/17.
 */
object Constants {
    // Yelp token
    val YELP_QUEST_TOKEN_URL = "https://api.yelp.com/oauth2/token"
    val YELP_CLIENT_ID = "<your yelp id>"
    val YELP_CLIENT_SECRET = "<your yelp secret>"
    val YELP_GRANT_TYPE = "client_credentials"

    // Yelp search
    val YELP_SEARCH_TERM = "landmarks"
    val YELP_SEARCH_URL = "https://api.yelp.com/v3/businesses/search"
    val YELP_JSON_MEMBER_NAME = "businesses"
    val YELP_SEARCH_RADIUS = 2500

    // Yelp search near metro station
    val YELP_SEARCH_NEAR_METRO_TERM = "Metro Stations"
    val YELP_SEARCH_NEAR_METRO_RADIUS = 40000
    val YELP_SEARCH_NEAR_METRO_SORT = "sort_by"
    val YELP_SEARCH_NEAR_METRO_SORT_BY = "distance"

    //WMATA search API
    val METRO_ALLSTATION_SEARCH_URL = "<WMATA URL with your key>"
    val METRO_JSON_MEMBER_NAME = "Stations"
    val LANDMARKS_PREF_KEY = "LANDMARKS"

    val CENTIMETER_TO_MILE = 0.000621371192
}