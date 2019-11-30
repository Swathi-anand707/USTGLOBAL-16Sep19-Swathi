import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mobile',
  templateUrl: './mobile.component.html',
  styleUrls: ['./mobile.component.css']
})
export class MobileComponent implements OnInit {
selectedMobile;

  Mobiles = [
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2016/11/10/16/18/android-1814600__340.jpg',
      name : 'Asus Zenfone 5',
      price : 'Rs : 14999',
      Description : 'ASUS Mobile X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.'

    }, {
      imgUrl : 'https://cdn.pixabay.com/photo/2017/01/06/13/50/smartphone-1957740__340.jpg',
      name : 'Samsung galaxy s5',
      price : 'Rs : 35999',
      Description : 'Samsung Galaxy With Alexa In-built. Freedom To Do More w/ Power Of Your Voice. Shop Now! Accidental Protection. Protegent Antivirus. Additional Warranty. Theft Insurance. Models: HP Pavilion x360 14, HP Gaming Pavilion - 15, OMEN by HP 15, HP Notebook - 15.',


    }, {
      imgUrl : 'https://cdn.pixabay.com/photo/2016/12/09/11/33/smartphone-1894723__340.jpg',
      name : 'Iphone 5',
      price : 'Rs : 41999',

      Description : 'Iphone 5 Crafted From Brushed Aluminium. Laptop W/ Intel Core. Shop Today! Sennheiser Headset @ 299. Get 3Yr Premium Support. Cash off on MS Office. Get Warranty Worth@₹3999. Amenities: Dell Power Companion, Dell Bluetooth Mouse.',

    }, {
      imgUrl : 'https://cdn.pixabay.com/photo/2013/07/12/18/39/smartphone-153650__340.png',
      name : 'Iphone 4',
      price : 'Rs : 24999',

      Description : '2.4GHz 8-core Intel Core i9, Turbo Boost up to 5.0GHz, with 16MB shared L3 cache. 32GB of 2400MHz DDR4 memory. Radeon Pro 560X with 4GB of GDDR5 memory. 2.4GHz 8-core Intel Core i9, Turbo Boost up to 5.0GHz, with 16MB shared L3 cache. 32GB of 2400MHz DDR4 memory. Radeon Pro 560X with 4GB of GDDR5 memory.',

    }, {
      imgUrl : 'https://cdn.pixabay.com/photo/2015/01/20/13/13/ipad-605439__340.jpg',
      name : 'Intex',
      price : 'Rs : 4999',

      Description : 'This item 2015 Intex Satellite 15.6-inch Laptop- 5th Gen Intel Core i7-5500U Processor 3.0GHz, 4MB Cache, 8GB Memory, 1TB HDD, HDMI, Bluetooth, Webcam, WIFI, AMD R7 M260, Windows 8.1/Windows 10.',

    }, {
      imgUrl : 'https://cdn.pixabay.com/photo/2015/05/12/09/13/social-media-763731__340.jpg',
      name : 'Karbonn',
      price : 'Rs : 24999',
      
      Description : 'Comes W/ Infinity Edge IPS Display. Mobiles W/ Intel® Core™ Processor, Buy Now! Cash off on MS Office. Get 3Yr Hardware Warranty. Get 3Yr Premium Support. Amenities: Dell Pro Backpack, Dell Bluetooth Mouse, Dell Professional Headset, Accidental Damage Service.',

    }, {
      imgUrl : 'https://cdn.pixabay.com/photo/2017/04/03/15/52/mobile-phone-2198770__340.png',
      name : 'Ikall',
      price : 'Rs : 2999',

      Description : 'CPU: 1GHz Intel Core i5-6300U (dual-core, 3MB cache, up to 3GHz with Turbo Boost) Graphics: Intel HD Graphics 520. RAM: 1GB LPDDR3. Screen: 12.3-inch, 2,736 x 1,824 PixelSense display (Contrast ratio: 1,300:1, 100% sRGB color, 10-point multi-touch, 3:2 aspect ratio) Storage: 256GB SSD (PCIe 3.0)',

    }, {
      imgUrl : 'https://cdn.pixabay.com/photo/2015/11/17/21/46/navigation-1048294__340.jpg',
      name : 'Moto G2',
      price : 'Rs : 23000',

      Description : 'Motorola Mobile 2nd Generation X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.',
      
    }, {
      imgUrl : 'https://cdn.pixabay.com/photo/2016/11/22/23/40/electronics-1851218__340.jpg',
      name : 'Sony',
      price : 'Rs : 46666',

      Description : 'Sony Xperia M2 X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.',
    }, {
      imgUrl : 'https://cdn.pixabay.com/photo/2018/05/01/13/04/sport-3365503__340.jpg',
      name : 'Iphone 8',
      price : 'Rs : 70999',

      Description : 'Iphone * X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.',
    }, {
      imgUrl : 'https://cdn.pixabay.com/photo/2016/11/29/12/30/android-1869510__340.jpg',
      name : 'Redmi MI4A',
      price : 'Rs : 25666',

      Description : 'Redmi 4A X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.',
    }, {
      imgUrl : 'https://cdn.pixabay.com/photo/2016/03/27/19/43/smartphone-1283938__340.jpg',
      name : 'Samsung S6 Edge',
      price : 'Rs : 53000',

      Description : 'Samsung s6 edge X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.',
    }





  ];

  constructor() { }

  ngOnInit() {
  }
  sendMobile(mobile) {
    console.log(mobile);
    this.selectedMobile = mobile;
  }

}












