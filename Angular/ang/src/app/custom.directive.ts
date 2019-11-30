import { ElementRef, Directive, HostBinding, HostListener } from "@angular/core";

@Directive({
    selector : '[custDir]'
})

export class CustomDirective{
    constructor( private el : ElementRef){
        this.el.nativeElement.style.backgroundColor ='red';


    }
    @HostBinding('style.backgroundColor') backgroundColor = 'blue';

    @HostListener('mouseenter') mouseEnterEvent(){

        this.el.nativeElement.style.backgroundColor ='yellow';


    }
    @HostListener('mouseleave') mouseLeave(){
        
        this.el.nativeElement.style.backgroundColor='brown';
    }
}