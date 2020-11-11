#!/usr/bin/env kscript
//DEPS khttp:khttp:1.0.0
import khttp.get

val ip = get("http://httpbin.org/ip").jsonObject.getString("origin")
println("Your ip: $ip")
