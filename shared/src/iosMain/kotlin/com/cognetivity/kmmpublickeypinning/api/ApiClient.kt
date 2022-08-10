package com.cognetivity.kmmpublickeypinning.api

import io.ktor.client.HttpClient
import io.ktor.client.engine.darwin.Darwin

actual val apiClient: HttpClient = HttpClient(Darwin)