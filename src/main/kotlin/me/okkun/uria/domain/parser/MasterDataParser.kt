package me.okkun.uria.domain.parser

import com.okkun.common.utils.StringEx
import com.okkun.common.utils.parser.Parser
import me.okkun.uria.domain.model.MasterData
import me.okkun.uria.domain.model.PropertyData

class MasterDataParser : Parser<MasterData>, StringEx {
    override fun parse(yaml: MasterData, content: String): String {
        var res = content
        res = res.replace("%PROJECT_NAME%", yaml.applicationName.toPascalCase())
        res = res.replace("%PASCAL_NAME%", yaml.name.toPascalCase())
        res = res.replace("%CAMEL_NAME%", yaml.name.toCamelCase())
        res = res.replace("%PROPS%", makeProps(yaml.props))
        return res
    }

    private fun makeProps(props: List<PropertyData>) : String {
        var res = ""
        for (prop in props) {
            res += "        public ${prop.type} ${prop.name};\n"
        }
        return res
    }

}