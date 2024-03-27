package com.moddy.passwordsmanager.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.moddy.passwordsmanager.R

object StylesAndShapes {
    object Fonts {
        val RobotoCondensed = FontFamily(Font(R.font.roboto_condensed_regular))
    }

    object Shapes {
        val Rounded8 = RoundedCornerShape(8.dp)
    }

    object Styles {
        val BtFont = TextStyle(
            fontSize = 20.sp,
            fontFamily = Fonts.RobotoCondensed,
            fontWeight = FontWeight.Bold
        )
        val TextLink = TextStyle(
            fontSize = 14.sp,
            fontFamily = Fonts.RobotoCondensed,
            color = OrangeLink
        )
    }
}