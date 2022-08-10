import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ImpMoreInfoComponent } from './imp-more-info.component';

describe('ImpMoreInfoComponent', () => {
  let component: ImpMoreInfoComponent;
  let fixture: ComponentFixture<ImpMoreInfoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ImpMoreInfoComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ImpMoreInfoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
