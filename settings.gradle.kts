plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "customer-module"
include("domain")
include("entry-point")
include("out-point")
include("data-provider")
