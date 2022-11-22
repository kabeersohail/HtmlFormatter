package com.example.htmlformatter

object Constants {
    const val SAMPLE_HTML = "<h3>Rich text test</h3>\n" +
            "<p>\n" +
            "     Hi Sohail please&#160;\n" +
            "     <a href=\"https://www.google.com\" target=\"_blank\">click here</a>&#160;\n" +
            "      to open Google.\n" +
            "</p>"

    const val SAMPLE_HTML_WITH_VIDEO = "<h4><font face=\"Calibri\">Rich text Editor<br></font><font face=\"Calibri\">Hello There</font></h4><p><font face=\"Calibri\">This is the link for google&#160;</font><a href=\"https://www.google.com\" target=\"_blank\"><u>click here</u></a>&#160;to open Google</p><p>You tube video&#160;</p><div>&#10;        <a href=\"https://www.youtube.com/watch?v=J9mIUzz-tr4\" target=\"_blank\">&#10;          <img src=\"https://img.youtube.com/vi/J9mIUzz-tr4/0.jpg\" alt=\"click to watch\">&#10;          <img src=\"https://img.icons8.com/color/96/000000/youtube-play.png\">&#10;        </a></div>"
}