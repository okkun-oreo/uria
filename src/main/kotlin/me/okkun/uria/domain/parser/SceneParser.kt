package me.okkun.uria.domain.parser

import com.okkun.common.utils.StringEx
import com.okkun.common.utils.parser.Parser
import me.okkun.uria.data.entity.UnityEntity
import me.okkun.uria.domain.model.SceneData

class SceneParser : Parser<SceneData>, StringEx {
    override fun parse(yaml: SceneData, content: String): String {
        var res = content
        res = res.replace("%DESCRIPTION%", yaml.description)
        res = res.replace("%PROJECT_NAME%", yaml.applicationName.toPascalCase())
        res = res.replace("%PASCAL_NAME%", yaml.sceneName.toPascalCase())
        res = res.replace("%CAMEL_NAME%", yaml.sceneName.toCamelCase())
        return res
    }


}