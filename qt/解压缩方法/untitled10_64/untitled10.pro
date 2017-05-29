#-------------------------------------------------
#
# Project created by QtCreator 2017-05-28T20:52:07
#
#-------------------------------------------------

QT       += core gui

greaterThan(QT_MAJOR_VERSION, 4): QT += widgets

TARGET = untitled10
TEMPLATE = app


SOURCES += main.cpp\
        mainwindow.cpp

HEADERS  += mainwindow.h

FORMS    += mainwindow.ui


INCLUDEPATH+="C:/Users/xie010/Desktop/last2/quazip-0.7/quazip"
LIBS+=-L"C:/Users/xie010/Desktop/last2/quazip-0.7/build-quazip-Desktop_Qt_5_7_0_MSVC2015_64bit-Release/release"
LIBS+=-lquazip
