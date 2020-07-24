package me.okkun.uria.utils

import com.okkun.utils.Resources

interface UriaResources {
    enum class View(override val input: String, override val output: String) : Resources {
        CONTROLLER("view/viewcontroller.tp", "Assets/Scripts/%PROJECT_NAME%/View/Scenes/%PASCAL_NAME%/%PASCAL_NAME%ViewController.cs"),
        CONTRUCT("view/contruct.tp", "Assets/Scripts/%PROJECT_NAME%/View/Scenes/%PASCAL_NAME%/%PASCAL_NAME%Contruct.cs"),
        PRESENTER("view/presenter.tp", "Assets/Scripts/%PROJECT_NAME%/View/Scenes/%PASCAL_NAME%/%PASCAL_NAME%Presenter.cs"),
        BUILDER("view/provider.tp", "Assets/Scripts/%PROJECT_NAME%/View/Scenes/%PASCAL_NAME%/%PASCAL_NAME%Provider.cs"),
        UNITY("view/unity.tp", "Assets/Scenes/%PASCAL_NAME%.unity")
    }

    enum class MasterData(override val input: String, override val output: String) : Resources {
        ENTITY("data/database/entity.tp", "Assets/Scripts/%PROJECT_NAME%/Data/Local/%PASCAL_NAME%/%PASCAL_NAME%Entity.cs"),
        DATABASE("data/database/database.tp", "Assets/Scripts/%PROJECT_NAME%/Data/Local/%PASCAL_NAME%/%PASCAL_NAME%DataBase.cs"),
        REPOSITORY("data/database/repository.tp", "Assets/Scripts/%PROJECT_NAME%/Data/Local/%PASCAL_NAME%/%PASCAL_NAME%Repository.cs"),
        IREPOSITORY("data/database/interface.tp", "Assets/Scripts/%PROJECT_NAME%/Data/Local/%PASCAL_NAME%/I%PASCAL_NAME%Repository.cs")
    }


}