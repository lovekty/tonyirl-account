plugins {
    alias { libs.plugins.kotlin.jvm }
    alias { libs.plugins.kotlin.plugin.spring }
}

dependencies {
    implementation(libs.bundles.springweb)
}