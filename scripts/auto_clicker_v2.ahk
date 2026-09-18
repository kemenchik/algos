; AutoHotkey v2
; ЛКМ каждые 300 мс; каждые 50 кликов — клавиша E; Пробел — стоп.
;
; Запуск: двойной клик по файлу (нужен AutoHotkey v2).
; Остановка: Пробел.

#SingleInstance Force
CoordMode("Mouse", "Screen")

clickCount := 0

SetTimer(DoClick, 300)

DoClick() {
    global clickCount
    Click
    clickCount++
    if (Mod(clickCount, 50) = 0)
        SendInput("e")
}

; Пробел останавливает скрипт
Space:: {
    global clickCount
    SetTimer(DoClick, 0)
    ToolTip("Кликер остановлен (кликов: " clickCount ")")
    Sleep(800)
    ToolTip()
    ExitApp
}
