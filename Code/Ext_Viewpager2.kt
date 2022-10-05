package aani.brothers.iconchanger.util

import android.content.Context
import android.graphics.Rect
import android.view.View
import androidx.annotation.DimenRes
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2

/**
 * Created by Nikunj Paradva on 05-10-2022
 *
 *   binding.pager.setPreviewBothSide(
 *       com.intuit.sdp.R.dimen._30sdp, // nextItemVisibleSize
 *       com.intuit.sdp.R.dimen._35sdp  // currentItemHorizontalMargin
 *   )
 * */

fun ViewPager2.setPreviewBothSide(
    @DimenRes nextItemVisibleSize: Int,
    @DimenRes currentItemHorizontalMargin: Int
) {
    this.offscreenPageLimit = 1
    val nextItemVisiblePx = resources.getDimension(nextItemVisibleSize)
    val currentItemHorizontalMarginPx = resources.getDimension(currentItemHorizontalMargin)
    val pageTranslationX = nextItemVisiblePx + currentItemHorizontalMarginPx
    val pageTransformer = ViewPager2.PageTransformer { page: View, position: Float ->
        page.translationX = -pageTranslationX * position
        page.scaleY = 1 - (0.25f * kotlin.math.abs(position))
    }
    this.setPageTransformer(pageTransformer)

    val itemDecoration = HorizontalMarginItemDecoration(
        context,
        currentItemHorizontalMargin
    )
    this.addItemDecoration(itemDecoration)
}

class HorizontalMarginItemDecoration(context: Context, @DimenRes horizontalMarginInDp: Int) :
    RecyclerView.ItemDecoration() {
    private val horizontalMarginInPx: Int =
        context.resources.getDimension(horizontalMarginInDp).toInt()

    override fun getItemOffsets(
        outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State
    ) {
        outRect.right = horizontalMarginInPx
        outRect.left = horizontalMarginInPx
    }
}