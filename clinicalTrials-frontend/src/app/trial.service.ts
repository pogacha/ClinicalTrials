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
        console.log(this.http.get(`${this.baseUrl}/${id}`));
        return this.http.get(`${this.baseUrl}/${id}`);
    }

    createTrial(trial: Object): Observable<Object> {
        return this.http.post(`${this.baseUrl}`, trial);
    }

    updateTrial(id: number, value: any): Observable<Object> {
        return this.http.put(`${this.baseUrl}/${id}`, value);
    }

    deleteTrial(id: number): Observable<any> {
        return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
    }

    getTrialsList(): Observable<any> {
        return this.http.get(`${this.baseUrl}/trials`);
    }
}