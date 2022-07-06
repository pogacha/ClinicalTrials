import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
    providedIn: 'root'
})
export class ComparatorService {

    private baseUrl = 'http://localhost:8080/clinical-trials-bio/api/v1';

    constructor(private http: HttpClient) { }

    getComparatorsByEudraCTNumber(id: number): Observable<any> {
        return this.http.get(`${this.baseUrl}/comparators/trial/${id}`);
    }
}