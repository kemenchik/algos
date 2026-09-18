; AutoHotkey v2
; ЛКМ каждые 300 мс; каждые 50 кликов — клавиша E;
; максимум 120 кликов или Пробел — стоп.
;
; Запуск: двойной клик по файлу (нужен AutoHotkey v2).
; Остановка: Пробел или достижение 120 кликов.

#SingleInstance Force
CoordMode("Mouse", "Screen")

clickCount := 0
maxClicks := 120

SetTimer(DoClick, 300)

DoClick() {
    global clickCount, maxClicks
    Click
    clickCount++
    if (Mod(clickCount, 50) = 0)
        SendInput("e")
    if (clickCount >= maxClicks)
        StopClicker()
}

StopClicker() {
    global clickCount
    SetTimer(DoClick, 0)
    ToolTip("Кликер остановлен (кликов: " clickCount ")")
    Sleep(800)
    ToolTip()
    ExitApp
}

; Пробел останавливает скрипт
Space:: {
    StopClicker()
}
