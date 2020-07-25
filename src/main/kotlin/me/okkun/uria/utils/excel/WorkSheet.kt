package me.okkun.uria.utils.excel

import org.apache.poi.ss.usermodel.CellType
import org.apache.poi.ss.usermodel.Sheet
import kotlin.math.ceil

class WorkSheet(private val sheet: Sheet) {

    fun getAll() : List<List<String?>> {
        val list: MutableList<List<String?>> = mutableListOf()
        sheet.rowIterator().asSequence().forEach { row ->
            val values = row.cellIterator().asSequence().map { cell ->
                when (cell.cellType) {
                    CellType.NUMERIC -> cell.numericCellValue.toString()
                    CellType.STRING  -> cell.stringCellValue
                    else -> null
                }
            }
            list.add(values.toList())
        }
        return list
    }

}