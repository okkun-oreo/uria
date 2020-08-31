package me.okkun.uria.utils

import com.okkun.common.utils.Resources

interface UriaResources {
    enum class Config(override val input: String, override val output: String) : Resources {
        CONFIG("config.yaml", "04_Tools/config.yaml")
    }

    enum class View(override val input: String, override val output: String) : Resources {
        CONTROLLER("view/viewcontroller.tp", "Assets/Scripts/%PROJECT_NAME%/View/Scenes/%PASCAL_NAME%/%PASCAL_NAME%ViewController.cs"),
        CONTRUCT("view/contruct.tp", "Assets/Scripts/%PROJECT_NAME%/View/Scenes/%PASCAL_NAME%/%PASCAL_NAME%Contruct.cs"),
        PRESENTER("view/presenter.tp", "Assets/Scripts/%PROJECT_NAME%/View/Scenes/%PASCAL_NAME%/%PASCAL_NAME%Presenter.cs")
    }

    enum class UseCase(override val input: String, override val output: String) : Resources {
        USECASE("domain/usecase.tp", "Assets/Scripts/%PROJECT_NAME%/Domain/UseCase/%PASCAL_NAME%/%PASCAL_NAME%UseCaseImpl.cs"),
        IUSECASE("domain/iusecase.tp", "Assets/Scripts/%PROJECT_NAME%/Domain/UseCase/%PASCAL_NAME%/%PASCAL_NAME%UseCase.cs"),
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
        TIMER("utils/timer.tp", "Assets/%PROJECT_NAME%/Utils/Timer.cs"),
        HTTP_CLIENT("utils/http/client.tp", "Assets/Scripts/%PROJECT_NAME%/Data/Http/HttpClient.cs"),
        HTTP_RESULT("utils/http/result.tp", "Assets/Scripts/%PROJECT_NAME%/Data/Http/HttpResult.cs"),
        ENM_SCENES("utils/scenes.tp", "Assets/Scripts/%PROJECT_NAME%/Configs/Scenes.cs"),
        EDITOR_SCENE("utils/editor/scenemaker.tp", "Assets/Editor/%PROJECT_NAME%/SceneMaker.cs"),
        CONTRACT("utils/contruct.tp", "Assets/Scripts/%PROJECT_NAME%/View/Scenes/BaseContruct.cs")  
    }

    enum class Domain(override val input: String, override val output: String) : Resources {
        MODEL("domain/model.tp", "Assets/Scripts/%PROJECT_NAME%/Domain/Model/%PASCAL_NAME%/%PASCAL_NAME%.cs")
    }



}