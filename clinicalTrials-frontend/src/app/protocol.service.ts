import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
    providedIn: 'root'
})
export class ProtocolService {

    private baseUrl = 'http://localhost:8080/clinical-trials-bio/api/v1';

    constructor(private http: HttpClient) { }

    getProtocolByEudraCTNumber(id: number): Observable<any> {
        return this.http.get(`${this.baseUrl}/protocol/trial/${id}`);
    }

    getProtocolsList(): Observable<any> {
        return this.http.get(`${this.baseUrl}/protocols`);
    }
}