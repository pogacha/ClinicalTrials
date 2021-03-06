import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TrialFormComponent } from './trial-form.component';

describe('TrialFormComponent', () => {
  let component: TrialFormComponent;
  let fixture: ComponentFixture<TrialFormComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ TrialFormComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(TrialFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
