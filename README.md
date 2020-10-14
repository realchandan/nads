```groovy
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

## Add below to app level gradle
```groovy
dependencies {
	implementation 'com.github.realchandan:nads:1.0.0'
}
```