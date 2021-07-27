# [Snippets for Fast Implement](#snippets)
- [ActivityResult](#activityresult)
- [ShapableImageView](#shapableimageview)
- [View Binding](#view-binding)


# [DroidLibs](#droidlibs)
- [Coroutines](#coroutines)
- [Material dependency](#material-dependency)
- [SDP](#sdp)

---------
## Snippets
### ActivityResult
```
registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
     if (result.resultCode == Activity.RESULT_OK) {
        val intent = result.data
        // Handle the Intent
     }
}
```

### ShapableImageView
```
<style name="ShapeAppearanceOverlay.App.CornerSize10Percent" parent="">
  <item name="cornerSize">10%</item>
</style>
```

### View Binding
```
buildFeatures {
  viewBinding true
}
```

---------
## DroidLibs

### Coroutines
```
implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.8'
implementation 'org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.3'
```

### Material dependency
```
implementation 'com.google.android.material:material:1.2.1'
```

### SDP
```
implementation 'com.intuit.sdp:sdp-android:1.0.6'
```

