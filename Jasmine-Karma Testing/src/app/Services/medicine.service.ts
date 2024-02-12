import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MedicineService {

  private url: string = "http://localhost:1324";

  constructor(private http: HttpClient) { }

  getMedicines():Observable<any[]>{
    return this.http.get<any[]>(this.url+"/medicines");
  }
}
