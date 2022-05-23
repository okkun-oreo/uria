./gradlew clean build
cp build/libs/uria-all.jar ~/tools/uria.jar
cp build/libs/uria-all.jar ./test/UnityCodeGen.jar
chown `whoami` ~/tools/uria.jar
