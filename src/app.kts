#!/usr/bin/env kscript
//DEPS khttp:khttp:1.0.0
//DEPS io.github.cdimascio:dotenv-kotlin:6.2.1

import khttp.get

val ip = get("http://httpbin.org/ip").jsonObject.getString("origin")
println("Your ip: $ip")
