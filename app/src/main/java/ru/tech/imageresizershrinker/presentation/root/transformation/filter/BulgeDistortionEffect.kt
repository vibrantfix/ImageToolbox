package ru.tech.imageresizershrinker.presentation.root.transformation.filter

import android.content.Context
import android.graphics.Bitmap
import android.graphics.PointF
import jp.co.cyberagent.android.gpuimage.filter.GPUImageBulgeDistortionFilter
import jp.co.cyberagent.android.gpuimage.filter.GPUImageFilter
import ru.tech.imageresizershrinker.R
import ru.tech.imageresizershrinker.domain.image.filters.Filter


class BulgeDistortionEffect(
    private val context: Context,
    override val value: Pair<Float, Float> = 0.25f to 0.5f,
) : FilterTransformation<Pair<Float, Float>>(
    context = context,
    title = R.string.bulge,
    value = value,
    paramsInfo = listOf(
        R.string.radius paramTo 0f..1f,
        R.string.scale paramTo -1f..1f
    )
), Filter.BulgeDistortion<Bitmap> {
    override val cacheKey: String
        get() = (value to context).hashCode().toString()

    override fun createFilter(): GPUImageFilter = GPUImageBulgeDistortionFilter(
        /* radius = */ value.first,
        /* scale = */value.second,
        /* center = */PointF(0.5f, 0.5f)
    )
}