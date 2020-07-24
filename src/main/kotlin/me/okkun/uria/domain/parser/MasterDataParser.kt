package me.okkun.uria.domain.parser

import com.okkun.utils.StringEx
import com.okkun.utils.parser.Parser
import me.okkun.uria.domain.model.MasterData

class MasterDataParser : Parser<MasterData>, StringEx {
    override fun parse(yaml: MasterData, content: String): String {
        var res = content
        res = res.replace("%PROJECT_NAME%", yaml.applicationName.toPascalCase())
        res = res.replace("%PASCAL_NAME%", yaml.name.toPascalCase())
        res = res.replace("%CAMEL_NAME%", yaml.name.toCamelCase())
        return res
    }
}