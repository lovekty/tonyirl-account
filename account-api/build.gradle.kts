plugins{
    `java-library`
    id("org.jruyi.thrift")
}

dependencies {
    implementation("org.apache.thrift:libthrift")
}

tasks.withType<org.jruyi.gradle.thrift.plugin.CompileThrift> {
    generator("java", "private-members", "fullcamel", "option_type", "generated_annotations=undated")
}
