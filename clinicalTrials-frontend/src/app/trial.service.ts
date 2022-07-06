import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
    providedIn: 'root'
})
export class TrialService {

    private baseUrl = 'http://localhost:8080/clinical-trials-bio/api/v1';

    constructor(private http: HttpClient) { }

    getTrial(id: number): Observable<any> {
        console.log(id)
        return this.http.get(`${this.baseUrl}/trials/${id}`);
    }

    createTrial(trial: Object): Observable<Object> {
        return this.http.post(`${this.baseUrl}/trials`, trial);
    }

    updateTrial(id: number, value: any): Observable<Object> {
        return this.http.put(`${this.baseUrl}/trials/${id}`, value);
    }

    deleteTrial(id: String): Observable<any> {
        return this.http.delete(`${this.baseUrl}/trials/${id}`, { responseType: 'text' });
    }

    getTrialsList(): Observable<any> {
        return this.http.get(`${this.baseUrl}/trials`);
    }
}