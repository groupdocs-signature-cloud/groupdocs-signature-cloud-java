/**
 * --------------------------------------------------------------------------------------------------------------------
 * <copyright company="Aspose Pty Ltd" file="Color.java">
 *   Copyright (c) 2003-2018 Aspose Pty Ltd
 * </copyright>
 * <summary>
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------------------------------------------
 */

package com.groupdocs.cloud.signature.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Utility class for  serialization
 */
@ApiModel(description = "Utility class for  serialization")
public class Color
{
    @SerializedName("web")
    private String web = null;

    @SerializedName("alpha")
    private Integer alpha = null;

    public Color web(String web)
    {
        this.web = web;
        return this;
    }

    /**
    * HTML string color representation
    * @return web
   **/
    @ApiModelProperty(value = "HTML string color representation")
    public String getWeb()
    {
        return web;
    }

    public void setWeb(String web)
    {
        this.web = web;
    }

    public Color alpha(Integer alpha)
    {
        this.alpha = alpha;
        return this;
    }

    /**
    * Alpha component of color structure
    * @return alpha
   **/
    @ApiModelProperty(required = true, value = "Alpha component of color structure")
    public Integer getAlpha()
    {
        return alpha;
    }

    public void setAlpha(Integer alpha)
    {
        this.alpha = alpha;
    }


    @Override
    public boolean equals(java.lang.Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        Color color = (Color)o;
        return Objects.equals(this.web, color.web) &&
            Objects.equals(this.alpha, color.alpha);
    }

    @Override
  public int hashCode()
    {
        return Objects.hash(web, alpha);
    }


    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class Color {\n");

        sb.append("    web: ").append(toIndentedString(web)).append("\n");
        sb.append("    alpha: ").append(toIndentedString(alpha)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o)
    {
        if (o == null)
        {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    /**
     * Default ctor
    */
    public Color()
    {

    }
    /**
    * Creates Color with predefined Color in web string format
    */
    public Color(String webColor)
    {
        this.web = webColor;
    }

    /// Gets a predefined color that has an ARGB value of AliceBlue or #F0F8FF.
    public static final Color AliceBlue = new Color("#F0F8FF");

    /// Gets a predefined color that has an ARGB value of AntiqueWhite or #FAEBD7.
    public static final Color AntiqueWhite = new Color("#FAEBD7");

    /// Gets a predefined color that has an ARGB value of Aqua or #00FFFF.
    public static final Color Aqua = new Color("#00FFFF");

    /// Gets a predefined color that has an ARGB value of Aquamarine or #7FFFD4.
    public static final Color Aquamarine = new Color("#7FFFD4");

    /// Gets a predefined color that has an ARGB value of Azure or #F0FFFF.
    public static final Color Azure = new Color("#F0FFFF");

    /// Gets a predefined color that has an ARGB value of Beige or #F5F5DC.
    public static final Color Beige = new Color("#F5F5DC");

    /// Gets a predefined color that has an ARGB value of Bisque or #FFE4C4.
    public static final Color Bisque = new Color("#FFE4C4");

    /// Gets a predefined color that has an ARGB value of Black or #000000.
    public static final Color Black = new Color("#000000");

    /// Gets a predefined color that has an ARGB value of BlanchedAlmond or #FFEBCD.
    public static final Color BlanchedAlmond = new Color("#FFEBCD");

    /// Gets a predefined color that has an ARGB value of Blue or #0000FF.
    public static final Color Blue = new Color("#0000FF");

    /// Gets a predefined color that has an ARGB value of BlueViolet or #8A2BE2.
    public static final Color BlueViolet = new Color("#8A2BE2");

    /// Gets a predefined color that has an ARGB value of Brown or #A52A2A.
    public static final Color Brown = new Color("#A52A2A");

    /// Gets a predefined color that has an ARGB value of BurlyWood or #DEB887.
    public static final Color BurlyWood = new Color("#DEB887");

    /// Gets a predefined color that has an ARGB value of CadetBlue or #5F9EA0.
    public static final Color CadetBlue = new Color("#5F9EA0");

    /// Gets a predefined color that has an ARGB value of Chartreuse or #7FFF00.
    public static final Color Chartreuse = new Color("#7FFF00");

    /// Gets a predefined color that has an ARGB value of Chocolate or #D2691E.
    public static final Color Chocolate = new Color("#D2691E");

    /// Gets a predefined color that has an ARGB value of Coral or #FF7F50.
    public static final Color Coral = new Color("#FF7F50");

    /// Gets a predefined color that has an ARGB value of CornflowerBlue or #6495ED.
    public static final Color CornflowerBlue = new Color("#6495ED");

    /// Gets a predefined color that has an ARGB value of Cornsilk or #FFF8DC.
    public static final Color Cornsilk = new Color("#FFF8DC");

    /// Gets a predefined color that has an ARGB value of Crimson or #DC143C.
    public static final Color Crimson = new Color("#DC143C");

    /// Gets a predefined color that has an ARGB value of Cyan or #00FFFF.
    public static final Color Cyan = new Color("#00FFFF");

    /// Gets a predefined color that has an ARGB value of DarkBlue or #00008B.
    public static final Color DarkBlue = new Color("#00008B");

    /// Gets a predefined color that has an ARGB value of DarkCyan or #008B8B.
    public static final Color DarkCyan = new Color("#008B8B");

    /// Gets a predefined color that has an ARGB value of DarkGoldenrod or #B8860B.
    public static final Color DarkGoldenrod = new Color("#B8860B");

    /// Gets a predefined color that has an ARGB value of DarkGray or #A9A9A9.
    public static final Color DarkGray = new Color("#A9A9A9");

    /// Gets a predefined color that has an ARGB value of DarkGreen or #006400.
    public static final Color DarkGreen = new Color("#006400");

    /// Gets a predefined color that has an ARGB value of DarkKhaki or #BDB76B.
    public static final Color DarkKhaki = new Color("#BDB76B");

    /// Gets a predefined color that has an ARGB value of DarkMagenta or #8B008B.
    public static final Color DarkMagenta = new Color("#8B008B");

    /// Gets a predefined color that has an ARGB value of DarkOliveGreen or #556B2F.
    public static final Color DarkOliveGreen = new Color("#556B2F");

    /// Gets a predefined color that has an ARGB value of DarkOrange or #FF8C00.
    public static final Color DarkOrange = new Color("#FF8C00");

    /// Gets a predefined color that has an ARGB value of DarkOrchid or #9932CC.
    public static final Color DarkOrchid = new Color("#9932CC");

    /// Gets a predefined color that has an ARGB value of DarkRed or #8B0000.
    public static final Color DarkRed = new Color("#8B0000");

    /// Gets a predefined color that has an ARGB value of DarkSalmon or #E9967A.
    public static final Color DarkSalmon = new Color("#E9967A");

    /// Gets a predefined color that has an ARGB value of DarkSeaGreen or #8FBC8B.
    public static final Color DarkSeaGreen = new Color("#8FBC8B");

    /// Gets a predefined color that has an ARGB value of DarkSlateBlue or #483D8B.
    public static final Color DarkSlateBlue = new Color("#483D8B");

    /// Gets a predefined color that has an ARGB value of DarkSlateGray or #2F4F4F.
    public static final Color DarkSlateGray = new Color("#2F4F4F");

    /// Gets a predefined color that has an ARGB value of DarkTurquoise or #00CED1.
    public static final Color DarkTurquoise = new Color("#00CED1");

    /// Gets a predefined color that has an ARGB value of DarkViolet or #9400D3.
    public static final Color DarkViolet = new Color("#9400D3");

    /// Gets a predefined color that has an ARGB value of DeepPink or #FF1493.
    public static final Color DeepPink = new Color("#FF1493");

    /// Gets a predefined color that has an ARGB value of DeepSkyBlue or #00BFFF.
    public static final Color DeepSkyBlue = new Color("#00BFFF");

    /// Gets a predefined color that has an ARGB value of DimGray or #696969.
    public static final Color DimGray = new Color("#696969");

    /// Gets a predefined color that has an ARGB value of DodgerBlue or #1E90FF.
    public static final Color DodgerBlue = new Color("#1E90FF");

    /// Gets a predefined color that has an ARGB value of Firebrick or #B22222.
    public static final Color Firebrick = new Color("#B22222");

    /// Gets a predefined color that has an ARGB value of FloralWhite or #FFFAF0.
    public static final Color FloralWhite = new Color("#FFFAF0");

    /// Gets a predefined color that has an ARGB value of ForestGreen or #228B22.
    public static final Color ForestGreen = new Color("#228B22");

    /// Gets a predefined color that has an ARGB value of Fuchsia or #FF00FF.
    public static final Color Fuchsia = new Color("#FF00FF");

    /// Gets a predefined color that has an ARGB value of Gainsboro or #DCDCDC.
    public static final Color Gainsboro = new Color("#DCDCDC");

    /// Gets a predefined color that has an ARGB value of GhostWhite or #F8F8FF.
    public static final Color GhostWhite = new Color("#F8F8FF");

    /// Gets a predefined color that has an ARGB value of Gold or #FFD700.
    public static final Color Gold = new Color("#FFD700");

    /// Gets a predefined color that has an ARGB value of Goldenrod or #DAA520.
    public static final Color Goldenrod = new Color("#DAA520");

    /// Gets a predefined color that has an ARGB value of Gray or #808080.
    public static final Color Gray = new Color("#808080");

    /// Gets a predefined color that has an ARGB value of Green or #008000.
    public static final Color Green = new Color("#008000");

    /// Gets a predefined color that has an ARGB value of GreenYellow or #ADFF2F.
    public static final Color GreenYellow = new Color("#ADFF2F");

    /// Gets a predefined color that has an ARGB value of Honeydew or #F0FFF0.
    public static final Color Honeydew = new Color("#F0FFF0");

    /// Gets a predefined color that has an ARGB value of HotPink or #FF69B4.
    public static final Color HotPink = new Color("#FF69B4");

    /// Gets a predefined color that has an ARGB value of IndianRed or #CD5C5C.
    public static final Color IndianRed = new Color("#CD5C5C");

    /// Gets a predefined color that has an ARGB value of Indigo or #4B0082.
    public static final Color Indigo = new Color("#4B0082");

    /// Gets a predefined color that has an ARGB value of Ivory or #FFFFF0.
    public static final Color Ivory = new Color("#FFFFF0");

    /// Gets a predefined color that has an ARGB value of Khaki or #F0E68C.
    public static final Color Khaki = new Color("#F0E68C");

    /// Gets a predefined color that has an ARGB value of Lavender or #E6E6FA.
    public static final Color Lavender = new Color("#E6E6FA");

    /// Gets a predefined color that has an ARGB value of LavenderBlush or #FFF0F5.
    public static final Color LavenderBlush = new Color("#FFF0F5");

    /// Gets a predefined color that has an ARGB value of LawnGreen or #7CFC00.
    public static final Color LawnGreen = new Color("#7CFC00");

    /// Gets a predefined color that has an ARGB value of LemonChiffon or #FFFACD.
    public static final Color LemonChiffon = new Color("#FFFACD");

    /// Gets a predefined color that has an ARGB value of LightBlue or #ADD8E6.
    public static final Color LightBlue = new Color("#ADD8E6");

    /// Gets a predefined color that has an ARGB value of LightCoral or #F08080.
    public static final Color LightCoral = new Color("#F08080");

    /// Gets a predefined color that has an ARGB value of LightCyan or #E0FFFF.
    public static final Color LightCyan = new Color("#E0FFFF");

    /// Gets a predefined color that has an ARGB value of LightGoldenrodYellow or #FAFAD2.
    public static final Color LightGoldenrodYellow = new Color("#FAFAD2");

    /// Gets a predefined color that has an ARGB value of LightGrey or #D3D3D3.
    public static final Color LightGray = new Color("#D3D3D3");

    /// Gets a predefined color that has an ARGB value of LightGreen or #90EE90.
    public static final Color LightGreen = new Color("#90EE90");

    /// Gets a predefined color that has an ARGB value of LightPink or #FFB6C1.
    public static final Color LightPink = new Color("#FFB6C1");

    /// Gets a predefined color that has an ARGB value of LightSalmon or #FFA07A.
    public static final Color LightSalmon = new Color("#FFA07A");

    /// Gets a predefined color that has an ARGB value of LightSeaGreen or #20B2AA.
    public static final Color LightSeaGreen = new Color("#20B2AA");

    /// Gets a predefined color that has an ARGB value of LightSkyBlue or #87CEFA.
    public static final Color LightSkyBlue = new Color("#87CEFA");

    /// Gets a predefined color that has an ARGB value of LightSlateGray or #778899.
    public static final Color LightSlateGray = new Color("#778899");

    /// Gets a predefined color that has an ARGB value of LightSteelBlue or #B0C4DE.
    public static final Color LightSteelBlue = new Color("#B0C4DE");

    /// Gets a predefined color that has an ARGB value of LightYellow or #FFFFE0.
    public static final Color LightYellow = new Color("#FFFFE0");

    /// Gets a predefined color that has an ARGB value of Lime or #00FF00.
    public static final Color Lime = new Color("#00FF00");

    /// Gets a predefined color that has an ARGB value of LimeGreen or #32CD32.
    public static final Color LimeGreen = new Color("#32CD32");

    /// Gets a predefined color that has an ARGB value of Linen or #FAF0E6.
    public static final Color Linen = new Color("#FAF0E6");

    /// Gets a predefined color that has an ARGB value of Magenta or #FF00FF.
    public static final Color Magenta = new Color("#FF00FF");

    /// Gets a predefined color that has an ARGB value of Maroon or #800000.
    public static final Color Maroon = new Color("#800000");

    /// Gets a predefined color that has an ARGB value of MediumAquamarine or #66CDAA.
    public static final Color MediumAquamarine = new Color("#66CDAA");

    /// Gets a predefined color that has an ARGB value of MediumBlue or #0000CD.
    public static final Color MediumBlue = new Color("#0000CD");

    /// Gets a predefined color that has an ARGB value of MediumOrchid or #BA55D3.
    public static final Color MediumOrchid = new Color("#BA55D3");

    /// Gets a predefined color that has an ARGB value of MediumPurple or #9370DB.
    public static final Color MediumPurple = new Color("#9370DB");

    /// Gets a predefined color that has an ARGB value of MediumSeaGreen or #3CB371.
    public static final Color MediumSeaGreen = new Color("#3CB371");

    /// Gets a predefined color that has an ARGB value of MediumSlateBlue or #7B68EE.
    public static final Color MediumSlateBlue = new Color("#7B68EE");

    /// Gets a predefined color that has an ARGB value of MediumSpringGreen or #00FA9A.
    public static final Color MediumSpringGreen = new Color("#00FA9A");

    /// Gets a predefined color that has an ARGB value of MediumTurquoise or #48D1CC.
    public static final Color MediumTurquoise = new Color("#48D1CC");

    /// Gets a predefined color that has an ARGB value of MediumVioletRed or #C71585.
    public static final Color MediumVioletRed = new Color("#C71585");

    /// Gets a predefined color that has an ARGB value of MidnightBlue or #191970.
    public static final Color MidnightBlue = new Color("#191970");

    /// Gets a predefined color that has an ARGB value of MintCream or #F5FFFA.
    public static final Color MintCream = new Color("#F5FFFA");

    /// Gets a predefined color that has an ARGB value of MistyRose or #FFE4E1.
    public static final Color MistyRose = new Color("#FFE4E1");

    /// Gets a predefined color that has an ARGB value of Moccasin or #FFE4B5.
    public static final Color Moccasin = new Color("#FFE4B5");

    /// Gets a predefined color that has an ARGB value of NavajoWhite or #FFDEAD.
    public static final Color NavajoWhite = new Color("#FFDEAD");

    /// Gets a predefined color that has an ARGB value of Navy or #000080.
    public static final Color Navy = new Color("#000080");

    /// Gets a predefined color that has an ARGB value of OldLace or #FDF5E6.
    public static final Color OldLace = new Color("#FDF5E6");

    /// Gets a predefined color that has an ARGB value of Olive or #808000.
    public static final Color Olive = new Color("#808000");

    /// Gets a predefined color that has an ARGB value of OliveDrab or #6B8E23.
    public static final Color OliveDrab = new Color("#6B8E23");

    /// Gets a predefined color that has an ARGB value of Orange or #FFA500.
    public static final Color Orange = new Color("#FFA500");

    /// Gets a predefined color that has an ARGB value of OrangeRed or #FF4500.
    public static final Color OrangeRed = new Color("#FF4500");

    /// Gets a predefined color that has an ARGB value of Orchid or #DA70D6.
    public static final Color Orchid = new Color("#DA70D6");

    /// Gets a predefined color that has an ARGB value of PaleGoldenrod or #EEE8AA.
    public static final Color PaleGoldenrod = new Color("#EEE8AA");

    /// Gets a predefined color that has an ARGB value of PaleGreen or #98FB98.
    public static final Color PaleGreen = new Color("#98FB98");

    /// Gets a predefined color that has an ARGB value of PaleTurquoise or #AFEEEE.
    public static final Color PaleTurquoise = new Color("#AFEEEE");

    /// Gets a predefined color that has an ARGB value of PaleVioletRed or #DB7093.
    public static final Color PaleVioletRed = new Color("#DB7093");

    /// Gets a predefined color that has an ARGB value of PapayaWhip or #FFEFD5.
    public static final Color PapayaWhip = new Color("#FFEFD5");

    /// Gets a predefined color that has an ARGB value of PeachPuff or #FFDAB9.
    public static final Color PeachPuff = new Color("#FFDAB9");

    /// Gets a predefined color that has an ARGB value of Peru or #CD853F.
    public static final Color Peru = new Color("#CD853F");

    /// Gets a predefined color that has an ARGB value of Pink or #FFC0CB.
    public static final Color Pink = new Color("#FFC0CB");

    /// Gets a predefined color that has an ARGB value of Plum or #DDA0DD.
    public static final Color Plum = new Color("#DDA0DD");

    /// Gets a predefined color that has an ARGB value of PowderBlue or #B0E0E6.
    public static final Color PowderBlue = new Color("#B0E0E6");

    /// Gets a predefined color that has an ARGB value of Purple or #800080.
    public static final Color Purple = new Color("#800080");

    /// Gets a predefined color that has an ARGB value of Red or #FF0000.
    public static final Color Red = new Color("#FF0000");

    /// Gets a predefined color that has an ARGB value of RosyBrown or #BC8F8F.
    public static final Color RosyBrown = new Color("#BC8F8F");

    /// Gets a predefined color that has an ARGB value of RoyalBlue or #4169E1.
    public static final Color RoyalBlue = new Color("#4169E1");

    /// Gets a predefined color that has an ARGB value of SaddleBrown or #8B4513.
    public static final Color SaddleBrown = new Color("#8B4513");

    /// Gets a predefined color that has an ARGB value of Salmon or #FA8072.
    public static final Color Salmon = new Color("#FA8072");

    /// Gets a predefined color that has an ARGB value of SandyBrown or #F4A460.
    public static final Color SandyBrown = new Color("#F4A460");

    /// Gets a predefined color that has an ARGB value of SeaGreen or #2E8B57.
    public static final Color SeaGreen = new Color("#2E8B57");

    /// Gets a predefined color that has an ARGB value of SeaShell or #FFF5EE.
    public static final Color SeaShell = new Color("#FFF5EE");

    /// Gets a predefined color that has an ARGB value of Sienna or #A0522D.
    public static final Color Sienna = new Color("#A0522D");

    /// Gets a predefined color that has an ARGB value of Silver or #C0C0C0.
    public static final Color Silver = new Color("#C0C0C0");

    /// Gets a predefined color that has an ARGB value of SkyBlue or #87CEEB.
    public static final Color SkyBlue = new Color("#87CEEB");

    /// Gets a predefined color that has an ARGB value of SlateBlue or #6A5ACD.
    public static final Color SlateBlue = new Color("#6A5ACD");

    /// Gets a predefined color that has an ARGB value of SlateGray or #708090.
    public static final Color SlateGray = new Color("#708090");

    /// Gets a predefined color that has an ARGB value of Snow or #FFFAFA.
    public static final Color Snow = new Color("#FFFAFA");

    /// Gets a predefined color that has an ARGB value of SpringGreen or #00FF7F.
    public static final Color SpringGreen = new Color("#00FF7F");

    /// Gets a predefined color that has an ARGB value of SteelBlue or #4682B4.
    public static final Color SteelBlue = new Color("#4682B4");

    /// Gets a predefined color that has an ARGB value of Tan or #D2B48C.
    public static final Color Tan = new Color("#D2B48C");

    /// Gets a predefined color that has an ARGB value of Teal or #008080.
    public static final Color Teal = new Color("#008080");

    /// Gets a predefined color that has an ARGB value of Thistle or #D8BFD8.
    public static final Color Thistle = new Color("#D8BFD8");

    /// Gets a predefined color that has an ARGB value of Tomato or #FF6347.
    public static final Color Tomato = new Color("#FF6347");

    /// Gets a predefined color that has an ARGB value of Transparent or #FFFFFF.
    public static final Color Transparent = new Color("#FFFFFF");

    /// Gets a predefined color that has an ARGB value of Turquoise or #40E0D0.
    public static final Color Turquoise = new Color("#40E0D0");

    /// Gets a predefined color that has an ARGB value of Violet or #EE82EE.
    public static final Color Violet = new Color("#EE82EE");

    /// Gets a predefined color that has an ARGB value of Wheat or #F5DEB3.
    public static final Color Wheat = new Color("#F5DEB3");

    /// Gets a predefined color that has an ARGB value of White or #FFFFFF.
    public static final Color White = new Color("#FFFFFF");

    /// Gets a predefined color that has an ARGB value of WhiteSmoke or #F5F5F5.
    public static final Color WhiteSmoke = new Color("#F5F5F5");

    /// Gets a predefined color that has an ARGB value of Yellow or #FFFF00.
    public static final Color Yellow = new Color("#FFFF00");

    /// Gets a predefined color that has an ARGB value of YellowGreen or #9ACD32.
    public static final Color YellowGreen = new Color("#9ACD32");
}
