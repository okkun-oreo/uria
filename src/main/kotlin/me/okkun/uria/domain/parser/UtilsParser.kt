package me.okkun.uria.domain.parser

import com.okkun.common.utils.StringEx
import com.okkun.common.utils.parser.Parser
import me.okkun.uria.domain.model.UtilData

class UtilsParser : Parser<UtilData>, StringEx {

    override fun parse(yaml: UtilData, content: String): String {
        var res = content
        res = res.replace("%PROJECT_NAME%", yaml.applicationName.toPascalCase())
        return res
    }

}