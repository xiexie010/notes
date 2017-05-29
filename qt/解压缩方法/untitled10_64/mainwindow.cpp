#include "mainwindow.h"
#include "ui_mainwindow.h"
#include "JlCompress.h"
#include <QString>
#include <QStringList>
#include <qdebug>
#pragma execution_character_set("utf-8")
MainWindow::MainWindow(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::MainWindow)
{
    ui->setupUi(this);

}

MainWindow::~MainWindow()
{

    delete ui;


}

void MainWindow::on_pushButton_clicked()
{
    //    JlCompress::extractDir("C:/Users/xie010/Desktop/testzip/test1.zip","C:/Users/xie010/Desktop/testzip");

    Extract("C:/Users/xie010/Desktop/testzip/bb.zip","C:\\Users\\xie010\\Desktop\\testzip\\12\\34");

}
bool MainWindow::Extract(const QString& in_file_path, const QString& out_file_path)
{
    QuaZip archive(in_file_path);
      if (!archive.open(QuaZip::mdUnzip))
          return false;

      QString path = out_file_path;
      if (!path.endsWith("/") && !out_file_path.endsWith("\\"))
          path += "/";

      QDir dir(out_file_path);
      if (!dir.exists())
          dir.mkpath(out_file_path);

      for( bool f = archive.goToFirstFile(); f; f = archive.goToNextFile() )
      {
          QString filePath = archive.getCurrentFileName();
          QuaZipFile zFile(archive.getZipName(), filePath);
          zFile.open(QIODevice::ReadOnly );
          QByteArray ba = zFile.readAll();
          zFile.close();

          if (filePath.endsWith("/"))
          {
              dir.mkpath(filePath);
          }
          else
          {
              //先判断文件夹是否存在，不存在就创建文件夹
              QString pp=path+filePath;
              QFile dstFile(path + filePath);
               //先判断文件夹是否存在，不存在就创建文件夹
              pp=pp.left(pp.lastIndexOf("/"));
                QDir dir(pp);
                if(!dir.exists())
                {
                    dir.mkpath(pp);
                }

              qDebug()<<path+filePath;
              if (!dstFile.open(QIODevice::WriteOnly))
                  return false;
              dstFile.write(ba);
              dstFile.close();
          }
      }

      return true;
}
