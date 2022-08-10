package com.cognetivity.kmmpublickeypinning.api

import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp

actual val apiClient: HttpClient = HttpClient(OkHttp)