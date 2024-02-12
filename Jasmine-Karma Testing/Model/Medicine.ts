import { DecimalPipe } from "@angular/common";

export class Medicine{
    id!:number;
    medicinename!:string;
    description!:Text;
    price!: DecimalPipe;
}