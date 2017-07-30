import { ModuleWithProviders } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HeroDetailComponent } from './hero-detail.component';

const routes: Routes = [
  { path: '', component: HeroDetailComponent }
];

export const HeroDetailRouting: ModuleWithProviders = RouterModule.forChild(routes);
