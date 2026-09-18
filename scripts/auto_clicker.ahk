; AutoHotkey v1.1
; ЛКМ каждые 300 мс; каждые 50 кликов — клавиша E; Пробел — стоп.
;
; Запуск: двойной клик по файлу (нужен установленный AutoHotkey).
; Остановка: Пробел.

#NoEnv
#SingleInstance Force
#MaxThreadsPerHotkey 2
SetBatchLines -1
CoordMode, Mouse, Screen

clickCount := 0

SetTimer, DoClick, 300
return

DoClick:
    Click
    clickCount++
    if (Mod(clickCount, 50) = 0)
        SendInput, e
return

; Пробел останавливает скрипт
Space::
    SetTimer, DoClick, Off
    ToolTip, Кликер остановлен (кликов: %clickCount%)
    Sleep, 800
    ToolTip
    ExitApp
return
