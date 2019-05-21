import zipfile
import os
import shutil

APCSPATH = "C:\\Users\\mlgpr\\Desktop\\APCS"

def zipfolder(foldername):
    shutil.make_archive("temp","zip",APCSPATH+"\\"+foldername)

def getFolder():
    folders = [name for name in os.listdir(APCSPATH)]
    count = 1
    for folder in folders:
        print(f"{count}: {folder}")
        count+=1
    return folders[int(input("Enter selection :: "))-1]

def delTemp():
    os.remove("temp.zip")

usrfolder = getFolder()
zipfolder(usrfolder)
