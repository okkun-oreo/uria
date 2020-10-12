package me.okkun.uria.utils.excel

import org.apache.poi.ss.usermodel.Workbook
import org.apache.poi.ss.usermodel.WorkbookFactory
import java.io.File
import java.lang.Exception
import java.nio.file.Paths

class WorkBook(path: String) {
    private val book: Workbook

    init {
        val file = Paths.get(path).toFile()
        book = WorkbookFactory.create(file)
    }

    fun getSheet(name: String) : WorkSheet? {
        return try {
            val sheet = book.getSheet(name)
            WorkSheet(sheet)
        } catch (e: Exception) {
            println(e.message)
            null
        }
    }


}