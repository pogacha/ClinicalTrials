import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
    providedIn: 'root'
})
export class SponsorService {

    private baseUrl = 'http://localhost:8080/clinical-trials-bio/api/v1';

    constructor(private http: HttpClient) { }

    getSponsor(id: string): Observable<any> {
        return this.http.get(`${this.baseUrl}/sponsors/${id}`);
    }

    getSponsors(): Observable<any> {
        return this.http.get(`${this.baseUrl}/sponsors`);
    }
}