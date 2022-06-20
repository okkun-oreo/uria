package me.okkun.uria.domain.parser

import com.okkun.common.utils.StringEx
import com.okkun.common.utils.parser.Parser
import me.okkun.uria.domain.model.UtilData
import me.okkun.uria.domain.model.SceneData

class UtilsParser : Parser<UtilData>, StringEx {

    override fun parse(yaml: UtilData, content: String): String {
        var res = content
        res = res.replace("%SCRIPTS_DIR%", "%OUT_DIR%/Assets/%PROJECT_NAME%/Scripts")
        res = res.replace("%OUT_DIR%", yaml.outDir)
        res = res.replace("%PROJECT_NAME%", yaml.applicationName.toPascalCase())
        res = res.replace("%ENM_SCENES%", makeEnm(yaml.scenes))
        return res
    }

    private fun makeEnm(scenes: List<SceneData>) : String{
        var res = ""

        for (scene in scenes) {
            res += "        ${scene.sceneName.toPascalCase()}, // ${scene.description}\n"
        }
        return res
    }

}