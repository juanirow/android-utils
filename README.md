# Android Utils
Dependencies and Libraries with helpers for gerneral projects

### Installing
1.- Add it in your root build.gradle at the end of repositories:

```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io'  }
    }
}
```
2.- Add Dependency

```
dependencies {
    compile 'com.github.juanirow:android-utils:x.x.x'
}
```

## Dependencies

### Dialog Creator

Show Generic Dialog: 

1.- Full Params
```
DialogCreator.showDialogMessage(context,
        R.string.title,
        R.string.message,
        R.string.ok,
        listenerPositiveBtn,
        showNegativeBtn,
        R.string.cancel,
        listenerNegativeBtn,
        listenerDismissDialog,
        R.drawable.ic_alert_dialog)
```

2.- Show only title and message with defailt OK positive button
```
DialogCreator.showDialogMessage(context,
        R.string.title,
        R.string.message)
```

4.- Show Error with OK positive button
```
DialogCreator.showError(context,
        R.string.message)
```

5.- Show Error with OK positive button and with callback in the onDismiss listener
```
DialogCreator.showError(context,
        R.string.message)
```

