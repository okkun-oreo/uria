package me.okkun.uria.utils

import com.okkun.common.utils.Resources

interface UriaResources {
    enum class Config(override val input: String, override val output: String) : Resources {
        CONFIG("config.yaml", "04_Tools/config.yaml"),
        ZENJECT("README.md", "00_Documents/README.md")
    }

    enum class View(override val input: String, override val output: String) : Resources {
        CONTROLLER("view/viewcontroller.tp", "04_Tools/Assets/Scripts/%PROJECT_NAME%/View/Scenes/%PASCAL_NAME%/%PASCAL_NAME%ViewController.cs"),
        CONTRUCT("view/contruct.tp", "04_Tools/Assets/Scripts/%PROJECT_NAME%/View/Scenes/%PASCAL_NAME%/%PASCAL_NAME%Contruct.cs"),
        PRESENTER("view/presenter.tp", "04_Tools/Assets/Scripts/%PROJECT_NAME%/View/Scenes/%PASCAL_NAME%/%PASCAL_NAME%Presenter.cs"),
        VIEW_INSTALLER("view/viewinstaller.tp", "04_Tools/Assets/Scripts/%PROJECT_NAME%/View/Scenes/%PASCAL_NAME%/%PASCAL_NAME%Installer.cs")
    }

    enum class UseCase(override val input: String, override val output: String) : Resources {
        USECASE("domain/usecase.tp", "04_Tools/Assets/Scripts/%PROJECT_NAME%/Domain/UseCase/%PASCAL_NAME%/%PASCAL_NAME%UseCase.cs"),
        IUSECASE("domain/iusecase.tp", "04_Tools/Assets/Scripts/%PROJECT_NAME%/Domain/UseCase/%PASCAL_NAME%/I%PASCAL_NAME%UseCase.cs"),
        TEST("domain/usecase_test.tp", "04_Tools/Assets/Editor/Tests/%PROJECT_NAME%/Domain/UseCase/%PASCAL_NAME%/%PASCAL_NAME%UseCaseTest.cs")
    }


    enum class MasterData(override val input: String, override val output: String) : Resources {
        ENTITY("data/database/entity.tp", "04_Tools/Assets/Scripts/%PROJECT_NAME%/Data/Local/%PASCAL_NAME%/%PASCAL_NAME%Entity.cs"),
        DATABASE("data/database/database.tp", "04_Tools/Assets/Scripts/%PROJECT_NAME%/Data/Local/%PASCAL_NAME%/%PASCAL_NAME%DataBase.cs"),
        REPOSITORY("data/database/repository.tp", "04_Tools/Assets/Scripts/%PROJECT_NAME%/Data/Local/%PASCAL_NAME%/%PASCAL_NAME%Repository.cs"),
        IREPOSITORY("data/database/interface.tp", "04_Tools/Assets/Scripts/%PROJECT_NAME%/Data/Local/%PASCAL_NAME%/I%PASCAL_NAME%Repository.cs"),
        EDITOR("data/database/editor.tp", "04_Tools/Assets/Editor/%PASCAL_NAME%EntityImporterEditor.cs")
    }

    enum class Utils(override val input: String, override val output: String) : Resources {
        PLATFORM("utils/platform.tp", "04_Tools/Assets/Scripts/%PROJECT_NAME%/Utils/Platform.cs"),
        CSV_IMPORTER("utils/csv.tp", "04_Tools/Assets/Editor/CsvImporter.cs"),
        TIMER("utils/timer.tp", "04_Tools/Assets/Scripts/%PROJECT_NAME%/Utils/Timer.cs"),
        HTTP_CLIENT("utils/http/client.tp", "04_Tools/Assets/Scripts/%PROJECT_NAME%/Data/Http/HttpClient.cs"),
        HTTP_RESULT("utils/http/result.tp", "04_Tools/Assets/Scripts/%PROJECT_NAME%/Data/Http/HttpResult.cs"),
        ENM_SCENES("utils/scenes.tp", "04_Tools/Assets/Scripts/%PROJECT_NAME%/Configs/Scenes.cs"),
        EDITOR_SCENE("utils/editor/scenemaker.tp", "04_Tools/Assets/Editor/%PROJECT_NAME%/SceneMaker.cs"),
        CONTRACT("utils/contruct.tp", "04_Tools/Assets/Scripts/%PROJECT_NAME%/View/Scenes/BaseContruct.cs"),
        SCENE_MANAGER("utils/scenemanager.tp", "04_Tools/Assets/Scripts/%PROJECT_NAME%/Utils/Scene/AppSceneManager.cs"),
        SCENE_DATA("utils/scenedata.tp", "04_Tools/Assets/Scripts/%PROJECT_NAME%/Utils/Scene/AppSceneData.cs")
    }

    enum class Domain(override val input: String, override val output: String) : Resources {
        MODEL("domain/model.tp", "04_Tools/Assets/Scripts/%PROJECT_NAME%/Domain/Model/%PASCAL_NAME%/%PASCAL_NAME%.cs")
    }



}