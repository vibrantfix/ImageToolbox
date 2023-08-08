package ru.tech.imageresizershrinker.presentation.root.transformation.filter

import android.content.Context
import android.graphics.Bitmap
import jp.co.cyberagent.android.gpuimage.filter.GPUImageFilter
import jp.co.cyberagent.android.gpuimage.filter.GPUImageWeakPixelInclusionFilter
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue
import ru.tech.imageresizershrinker.R
import ru.tech.imageresizershrinker.domain.image.filters.Filter

@Parcelize
class WeakPixelFilter(
    private val context: @RawValue Context,
) : FilterTransformation<Unit>(
    context = context,
    title = R.string.weak_pixel_inclusion,
    value = Unit
), Filter.WeakPixel<Bitmap> {
    override val cacheKey: String
        get() = (value to context).hashCode().toString()

    override fun createFilter(): GPUImageFilter = GPUImageWeakPixelInclusionFilter()
}