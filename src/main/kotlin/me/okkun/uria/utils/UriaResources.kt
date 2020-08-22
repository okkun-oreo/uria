package me.okkun.uria.utils

import com.okkun.common.utils.Resources

interface UriaResources {
    enum class View(override val input: String, override val output: String) : Resources {
        CONTROLLER("view/viewcontroller.tp", "Assets/Scripts/%PROJECT_NAME%/View/Scenes/%PASCAL_NAME%/%PASCAL_NAME%ViewController.cs"),
        CONTRUCT("view/contruct.tp", "Assets/Scripts/%PROJECT_NAME%/View/Scenes/%PASCAL_NAME%/%PASCAL_NAME%Contruct.cs"),
        PRESENTER("view/presenter.tp", "Assets/Scripts/%PROJECT_NAME%/View/Scenes/%PASCAL_NAME%/%PASCAL_NAME%Presenter.cs"),
        BUILDER("view/provider.tp", "Assets/Scripts/%PROJECT_NAME%/View/Scenes/%PASCAL_NAME%/%PASCAL_NAME%Provider.cs")
    }

    enum class MasterData(override val input: String, override val output: String) : Resources {
        ENTITY("data/database/entity.tp", "Assets/Scripts/%PROJECT_NAME%/Data/Local/%PASCAL_NAME%/%PASCAL_NAME%Entity.cs"),
        DATABASE("data/database/database.tp", "Assets/Scripts/%PROJECT_NAME%/Data/Local/%PASCAL_NAME%/%PASCAL_NAME%DataBase.cs"),
        REPOSITORY("data/database/repository.tp", "Assets/Scripts/%PROJECT_NAME%/Data/Local/%PASCAL_NAME%/%PASCAL_NAME%Repository.cs"),
        IREPOSITORY("data/database/interface.tp", "Assets/Scripts/%PROJECT_NAME%/Data/Local/%PASCAL_NAME%/I%PASCAL_NAME%Repository.cs"),
        EDITOR("data/database/editor.tp", "Assets/Editor/%PASCAL_NAME%EntityImporterEditor.cs")
    }

    enum class Utils(override val input: String, override val output: String) : Resources {
        PLATFORM("utils/platform.tp", "Assets/Scripts/%PROJECT_NAME%/Utils/Platform.cs"),
        CSV_IMPORTER("utils/csv.tp", "Assets/Editor/CsvImporter.cs"),
        TIMER("utils/timer.tp", "Assets/Editor/Timer.cs"),
        HTTP_CLIENT("utils/http/client.tp", "Assets/Scripts/%PROJECT_NAME%/Utils/Http/HttpClient.cs"),
        HTTP_RESULT("utils/http/result.tp", "Assets/Scripts/%PROJECT_NAME%/Utils/Http/HttpResult.cs"),
        ENM_SCENES("utils/scenes.tp", "Assets/Scripts/%PROJECT_NAME%/Utils/Scene/Scenes.cs"),
        EDITOR_SCENE("utils/editor/scenemaker.tp", "Assets/Editor/%PROJECT_NAME%/SceneMaker.cs"),        
    }

    enum class Domain(override val input: String, override val output: String) : Resources {
        MODEL("domain/model.tp", "Assets/Scripts/%PROJECT_NAME%/Domain/Model/%PASCAL_NAME%/%PASCAL_NAME%.cs")
    }



}