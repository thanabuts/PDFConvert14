# PDFConvert14 [![Donate](https://img.shields.io/badge/Donate-PayPal-green.svg)](https://paypal.me/worapatk)

## Introduction
```
By default FPDI can "only" handle PDF documents up to PDF version 1.4. Beginning with PDF version 1.5 there were new compression features introduced which involve internal structure changes how a PDF document can be created.

With this seperate parser, as a commercial addon, you're up to date and FPDI will be able to handle PDF documents with a version higher than 1.4 without problems. [More Information](https://www.setasign.com/products/fpdi-pdf-parser/details/)
```

This Java code was created from [PDFBox](https://pdfbox.apache.org) for converting higher version of PDF to 1.4.

## How to use
It's easy to apply it on your project which any languages such as PHP, C# etc.
You need to execute this command in your language that you use on your project.
```
java -jar PDFConvert14.jar original.pdf new.pdf
```

**PHP Examples**
```
exec('java -jar PDFConvert14.jar original.pdf new.pdf');
```

**C# Examples**
```
String CMD = "/c java -jar PDFConvert14.jar original.pdf new.pdf";
Process.Start("cmd.exe", CMD);
```


## License
Copyright (c) 2018 WORAPAT KETENG

Licensed under the [MIT License](https://github.com/thanabuts/watchman/blob/master/LICENSE.md)


## Donation
If you like my project, you can give me a cup of coffee :coffee:

[![paypal](https://www.paypalobjects.com/en_US/i/btn/btn_donateCC_LG.gif)](https://paypal.me/worapatk)
