import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
    providedIn: 'root'
})
export class ImpService {

    private baseUrl = 'http://localhost:8080/clinical-trials-bio/api/v1';

    constructor(private http: HttpClient) { }

    getImpFromEudraCTNumber(id: String): Observable<any> {
        return this.http.get(`${this.baseUrl}/imps/trial/${id}`);
    }

    getImps(): Observable<any> {
        return this.http.get(`${this.baseUrl}/imps`);
    }
}