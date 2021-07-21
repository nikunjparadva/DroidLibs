# DroidLibs & Snippets for Fast Implement

ActivityResult
```
registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
     if (result.resultCode == Activity.RESULT_OK) {
        val intent = result.data
        // Handle the Intent
     }
}
```


View Binding
```
buildFeatures {
  viewBinding true
}
```

ShapableImageView corner
```
<style name="ShapeAppearanceOverlay.App.CornerSize10Percent" parent="">
  <item name="cornerSize">10%</item>
</style>
```

Google material dependency
```
implementation 'com.google.android.material:material:1.2.1'
```

Kotlin Coroutines
```
implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.8'
implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.3'
```

SDP for Developement
```
implementation 'com.intuit.sdp:sdp-android:1.0.6'
```

