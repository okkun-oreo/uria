package me.okkun.uria.domain.parser

import com.okkun.common.utils.StringEx
import me.okkun.uria.domain.model.DomainModelData
import com.okkun.common.utils.parser.Parser

class DomainModelParser : Parser<DomainModelData>, StringEx {

    override fun parse(yaml: DomainModelData, content: String): String {
        var res = content
        res = res.replace("%SCRIPTS_DIR%", "%OUT_DIR%/Assets/%PROJECT_NAME%/Scripts")
        res = res.replace("%PROJECT_NAME%", yaml.applicationName.toPascalCase())
        res = res.replace("%PASCAL_NAME%", yaml.modelName.toPascalCase())
        res = res.replace("%CAMEL_NAME%", yaml.modelName.toCamelCase())
        return res
    }

}