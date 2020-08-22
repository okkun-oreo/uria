import java.io.File;

class FileEx {

    companion object {

        fun mkdir(path: String) {
            val file = File(path)
            if(!file.exists()) {
                file.mkdir();
            }
        }


    }


}