group = "cn.bootz.account"
version = "1.0.0"

allprojects {
    tasks.withType<Test> {
        useJUnitPlatform()
    }
}