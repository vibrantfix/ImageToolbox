package ru.tech.imageresizershrinker.main_screen.components

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.compose.animation.*
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.border
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Margin
import androidx.compose.material.icons.rounded.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.tech.imageresizershrinker.R
import ru.tech.imageresizershrinker.common.APP_LINK
import ru.tech.imageresizershrinker.theme.icons.Github
import ru.tech.imageresizershrinker.theme.icons.PaletteSwatch
import ru.tech.imageresizershrinker.theme.outlineVariant
import ru.tech.imageresizershrinker.widget.utils.LocalSettingsState


@Composable
fun SourceCodePreference(
    @SuppressLint("ModifierParameter") modifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 12.dp),
    color: Color = MaterialTheme.colorScheme.primaryContainer
) {
    val context = LocalContext.current
    PreferenceItem(
        onClick = {
            context.startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(APP_LINK)
                )
            )
        },
        icon = Icons.Rounded.Github,
        title = stringResource(R.string.check_source_code),
        subtitle = stringResource(R.string.check_source_code_sub),
        color = color,
        modifier = modifier
    )
}

@Composable
fun SingleResizePreference(
    onClick: () -> Unit,
    color: Color = MaterialTheme.colorScheme.surfaceColorAtElevation(1.dp),
    @SuppressLint("ModifierParameter") modifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 12.dp)
) {
    PreferenceItem(
        onClick = onClick,
        icon = Icons.Rounded.PhotoSizeSelectLarge,
        title = stringResource(R.string.single_resize),
        subtitle = stringResource(R.string.resize_single_image),
        color = color,
        modifier = modifier
    )
}

@Composable
fun CipherPreference(
    onClick: () -> Unit,
    color: Color = MaterialTheme.colorScheme.surfaceColorAtElevation(1.dp),
    @SuppressLint("ModifierParameter") modifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 12.dp)
) {
    PreferenceItem(
        onClick = onClick,
        icon = Icons.Rounded.Security,
        title = stringResource(R.string.cipher),
        subtitle = stringResource(R.string.cipher_sub),
        color = color,
        modifier = modifier
    )
}

@Composable
fun DrawPreference(
    onClick: () -> Unit,
    color: Color = MaterialTheme.colorScheme.surfaceColorAtElevation(1.dp),
    @SuppressLint("ModifierParameter") modifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 12.dp)
) {
    PreferenceItem(
        onClick = onClick,
        icon = Icons.Rounded.Draw,
        title = stringResource(R.string.draw),
        subtitle = stringResource(R.string.draw_sub),
        color = color,
        modifier = modifier
    )
}

@Composable
fun FilterPreference(
    onClick: () -> Unit,
    color: Color = MaterialTheme.colorScheme.surfaceColorAtElevation(1.dp),
    @SuppressLint("ModifierParameter") modifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 12.dp)
) {
    PreferenceItem(
        onClick = onClick,
        icon = Icons.Rounded.PhotoFilter,
        title = stringResource(R.string.filter),
        subtitle = stringResource(R.string.filter_sub),
        color = color,
        modifier = modifier
    )
}

@Composable
fun BytesResizePreference(
    onClick: () -> Unit,
    color: Color = MaterialTheme.colorScheme.surfaceColorAtElevation(1.dp),
    @SuppressLint("ModifierParameter") modifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 12.dp)
) {
    PreferenceItem(
        onClick = onClick,
        icon = Icons.Rounded.InsertDriveFile,
        title = stringResource(R.string.by_bytes_resize),
        subtitle = stringResource(R.string.by_bytes_resize_sub),
        color = color,
        modifier = modifier
    )
}

@Composable
fun DeleteExifPreference(
    onClick: () -> Unit,
    color: Color = MaterialTheme.colorScheme.surfaceColorAtElevation(1.dp),
    @SuppressLint("ModifierParameter") modifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 12.dp)
) {
    PreferenceItem(
        onClick = onClick,
        icon = Icons.Rounded.Dataset,
        title = stringResource(R.string.delete_exif),
        subtitle = stringResource(R.string.delete_exif_sub),
        color = color,
        modifier = modifier
    )
}

@Composable
fun BatchResizePreference(
    onClick: () -> Unit,
    color: Color = MaterialTheme.colorScheme.surfaceColorAtElevation(1.dp),
    @SuppressLint("ModifierParameter") modifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 12.dp)
) {
    PreferenceItem(
        onClick = onClick,
        icon = Icons.Rounded.PhotoLibrary,
        title = stringResource(R.string.batch_resize),
        subtitle = stringResource(R.string.resize_batch_image),
        modifier = modifier,
        color = color
    )
}

@Composable
fun GeneratePalettePreference(
    onClick: () -> Unit,
    @SuppressLint("ModifierParameter") modifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 12.dp),
    color: Color = MaterialTheme.colorScheme.surfaceColorAtElevation(1.dp)
) {
    PreferenceItem(
        onClick = onClick,
        icon = Icons.Rounded.PaletteSwatch,
        title = stringResource(R.string.generate_palette),
        subtitle = stringResource(R.string.palette_sub),
        modifier = modifier,
        color = color
    )
}

@Composable
fun CropPreference(
    onClick: () -> Unit,
    color: Color = MaterialTheme.colorScheme.surfaceColorAtElevation(1.dp),
    @SuppressLint("ModifierParameter") modifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 12.dp)
) {
    PreferenceItem(
        onClick = onClick,
        icon = Icons.Rounded.Crop,
        title = stringResource(R.string.crop),
        subtitle = stringResource(R.string.crop_sub),
        color = color,
        modifier = modifier
    )
}

@Composable
fun PickColorPreference(
    onClick: () -> Unit,
    color: Color = MaterialTheme.colorScheme.surfaceColorAtElevation(1.dp),
    @SuppressLint("ModifierParameter") modifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 12.dp)
) {
    PreferenceItem(
        onClick = onClick,
        icon = Icons.Rounded.Colorize,
        title = stringResource(R.string.pick_color),
        subtitle = stringResource(R.string.pick_color_sub),
        color = color,
        modifier = modifier
    )
}

@Composable
fun ImagePreviewPreference(
    onClick: () -> Unit,
    color: Color = MaterialTheme.colorScheme.surfaceColorAtElevation(1.dp),
    @SuppressLint("ModifierParameter") modifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 12.dp)
) {
    PreferenceItem(
        onClick = onClick,
        icon = Icons.Rounded.Image,
        title = stringResource(R.string.image_preview),
        subtitle = stringResource(R.string.image_preview_sub),
        color = color,
        modifier = modifier
    )
}

@Composable
fun ComparePreference(
    onClick: () -> Unit,
    color: Color = MaterialTheme.colorScheme.surfaceColorAtElevation(1.dp),
    @SuppressLint("ModifierParameter") modifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 12.dp)
) {
    PreferenceItem(
        onClick = onClick,
        icon = Icons.Rounded.Compare,
        title = stringResource(R.string.compare),
        subtitle = stringResource(R.string.compare_sub),
        color = color,
        modifier = modifier
    )
}

@Composable
fun LimitsPreference(
    onClick: () -> Unit,
    color: Color = MaterialTheme.colorScheme.surfaceColorAtElevation(1.dp),
    @SuppressLint("ModifierParameter") modifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 12.dp)
) {
    PreferenceItem(
        onClick = onClick,
        icon = Icons.Outlined.Margin,
        title = stringResource(R.string.limits_resize),
        subtitle = stringResource(R.string.limits_resize_sub),
        color = color,
        modifier = modifier
    )
}

@Composable
fun PreferenceItem(
    onClick: (() -> Unit)? = null,
    title: String,
    subtitle: String? = null,
    icon: ImageVector? = null,
    endIcon: ImageVector? = null,
    shape: Shape = RoundedCornerShape(16.dp),
    color: Color = MaterialTheme.colorScheme.surfaceColorAtElevation(1.dp),
    @SuppressLint("ModifierParameter") modifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 12.dp)
) {
    val _icon: (@Composable () -> Unit)? = if (icon == null) null else {
        { Icon(icon, null) }
    }
    val _icon2: (@Composable () -> Unit)? = if (endIcon == null) null else {
        { Icon(endIcon, null) }
    }
    PreferenceItemOverload(
        onClick = onClick,
        title = title,
        subtitle = subtitle,
        icon = _icon,
        endIcon = _icon2,
        shape = shape,
        color = color,
        modifier = modifier
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun PreferenceItemOverload(
    onClick: (() -> Unit)? = null,
    onLongClick: (() -> Unit)? = null,
    title: String,
    subtitle: String? = null,
    icon: (@Composable () -> Unit)? = null,
    endIcon: (@Composable () -> Unit)? = null,
    shape: Shape = RoundedCornerShape(16.dp),
    color: Color = MaterialTheme.colorScheme.surfaceColorAtElevation(1.dp),
    @SuppressLint("ModifierParameter") modifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 12.dp)
) {
    val contentColor =
        if (color == MaterialTheme.colorScheme.surfaceColorAtElevation(1.dp)) contentColorFor(
            backgroundColor = MaterialTheme.colorScheme.surfaceVariant
        ) else contentColorFor(backgroundColor = color)

    val settingsState = LocalSettingsState.current

    ProvideTextStyle(value = LocalTextStyle.current.copy(textAlign = TextAlign.Start)) {
        Card(
            shape = shape,
            modifier = modifier
                .border(
                    settingsState.borderWidth,
                    MaterialTheme.colorScheme.outlineVariant(0.1f, color),
                    shape
                )
                .clip(shape)
                .then(
                    if (onClick != null) {
                        Modifier.combinedClickable(onClick = onClick, onLongClick = onLongClick)
                    } else Modifier
                ),
            colors = CardDefaults.cardColors(
                containerColor = color,
                contentColor = contentColor
            )
        ) {
            Row(
                Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                AnimatedContent(
                    targetState = icon,
                    transitionSpec = { fadeIn() togetherWith fadeOut() }
                ) { icon ->
                    icon?.let {
                        Row {
                            it()
                            Spacer(modifier = Modifier.width(16.dp))
                        }
                    }
                }
                Column(
                    Modifier
                        .weight(1f)
                        .padding(end = 16.dp)
                ) {
                    AnimatedContent(
                        targetState = title,
                        transitionSpec = { fadeIn() togetherWith fadeOut() }
                    ) { title ->
                        Text(
                            text = title,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium,
                            lineHeight = 18.sp
                        )
                    }
                    AnimatedContent(
                        targetState = subtitle,
                        transitionSpec = { fadeIn() togetherWith fadeOut() }
                    ) { sub ->
                        sub?.let {
                            Column {
                                Spacer(modifier = Modifier.height(2.dp))
                                Text(
                                    text = sub,
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Normal,
                                    lineHeight = 14.sp,
                                    color = LocalContentColor.current.copy(alpha = 0.5f)
                                )
                            }
                        }
                    }
                }
                AnimatedContent(
                    targetState = endIcon,
                    transitionSpec = { fadeIn() + scaleIn() togetherWith fadeOut() + scaleOut() }
                ) { icon ->
                    icon?.let {
                        it()
                    }
                }
            }
        }
    }
}