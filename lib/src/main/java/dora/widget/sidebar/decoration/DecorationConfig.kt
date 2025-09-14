package dora.widget.sidebar.decoration

import android.graphics.Color
import androidx.annotation.ColorInt

class DecorationConfig {
    var lineHeight = 0
        private set
    var lineColor = 0
        private set
    var selectedBgColorR = 0
        private set
    var selectedBgColorG = 0
        private set
    var selectedBgColorB = 0
        private set
    var unSelectBgColorR = 0
        private set
    var unSelectBgColorG = 0
        private set
    var unSelectBgColorB = 0
        private set
    var selectedTextColorR = 0
        private set
    var selectedTextColorG = 0
        private set
    var selectedTextColorB = 0
        private set
    var unSelectTextColorR = 0
        private set
    var unSelectTextColorG = 0
        private set
    var unSelectTextColorB = 0
        private set
    var textXOffset = 0f
        private set
    var textSize = 0f
        private set
    var height = 0
        private set

    class Builder {

        private val config: DecorationConfig = DecorationConfig()

        fun setLine(height: Int, color: Int): Builder {
            config.lineHeight = height
            config.lineColor = color
            return this
        }

        fun setSelectedBgColor(@ColorInt color: Int): Builder {
            config.selectedBgColorR = Color.red(color)
            config.selectedBgColorG = Color.green(color)
            config.selectedBgColorB = Color.blue(color)
            return this
        }

        fun setUnSelectBgColor(@ColorInt color: Int): Builder {
            config.unSelectBgColorR = Color.red(color)
            config.unSelectBgColorG = Color.green(color)
            config.unSelectBgColorB = Color.blue(color)
            return this
        }

        fun setSelectedTextColor(@ColorInt color: Int): Builder {
            config.selectedTextColorR = Color.red(color)
            config.selectedTextColorG = Color.green(color)
            config.selectedTextColorB = Color.blue(color)
            return this
        }

        fun setUnSelectTextColor(@ColorInt color: Int): Builder {
            config.unSelectTextColorR = Color.red(color)
            config.unSelectTextColorG = Color.green(color)
            config.unSelectTextColorB = Color.blue(color)
            return this
        }

        fun setSelectedBgColor(r: Int, g: Int, b: Int): Builder {
            config.selectedBgColorR = r
            config.selectedBgColorG = g
            config.selectedBgColorB = b
            return this
        }

        fun setUnSelectBgColor(r: Int, g: Int, b: Int): Builder {
            config.unSelectBgColorR = r
            config.unSelectBgColorG = g
            config.unSelectBgColorB = b
            return this
        }

        fun setSelectedTextColor(r: Int, g: Int, b: Int): Builder {
            config.selectedTextColorR = r
            config.selectedTextColorG = g
            config.selectedTextColorB = b
            return this
        }

        fun setUnSelectTextColor(r: Int, g: Int, b: Int): Builder {
            config.unSelectTextColorR = r
            config.unSelectTextColorG = g
            config.unSelectTextColorB = b
            return this
        }

        fun setTextXOffset(textXOffset: Float): Builder {
            config.textXOffset = textXOffset
            return this
        }

        fun setTextSize(textSize: Float): Builder {
            config.textSize = textSize
            return this
        }

        fun setHeight(height: Int): Builder {
            config.height = height
            return this
        }

        fun build(): DecorationConfig {
            return config
        }
    }
}