./gradlew clean
./gradlew build
mv build/libs/uria-all.jar ~/tools/uria.jar

echo "please add alias uria='java -jar ~/tools/uria.jar'"