; AutoHotkey v1.1
; ЛКМ каждые 300 мс; каждые 50 кликов — клавиша E;
; максимум 120 кликов или Пробел — стоп.
;
; Запуск: двойной клик по файлу (нужен установленный AutoHotkey).
; Остановка: Пробел или достижение 120 кликов.

#NoEnv
#SingleInstance Force
#MaxThreadsPerHotkey 2
SetBatchLines -1
CoordMode, Mouse, Screen

clickCount := 0
maxClicks := 120

SetTimer, DoClick, 300
return

DoClick:
    Click
    clickCount++
    if (Mod(clickCount, 50) = 0)
        SendInput, e
    if (clickCount >= maxClicks)
        Gosub, StopClicker
return

; Пробел останавливает скрипт
Space::
    Gosub, StopClicker
return

StopClicker:
    SetTimer, DoClick, Off
    ToolTip, Кликер остановлен (кликов: %clickCount%)
    Sleep, 800
    ToolTip
    ExitApp
return
