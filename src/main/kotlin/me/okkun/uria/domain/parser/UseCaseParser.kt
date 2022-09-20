package me.okkun.uria.domain.parser

import com.okkun.common.utils.StringEx
import com.okkun.common.utils.parser.Parser
import me.okkun.uria.domain.model.UseCaseData

class UseCaseParser : Parser<UseCaseData>, StringEx {

    override fun parse(yaml: UseCaseData, content: String): String {
        var res = content
        res = res.replace("%SCRIPTS_DIR%", "%OUT_DIR%/Assets/%PROJECT_NAME%/Scripts")
        res = res.replace("%PROJECT_NAME%", yaml.appName.toPascalCase())
        res = res.replace("%PASCAL_NAME%", yaml.name.toPascalCase())
        return res
    }

}