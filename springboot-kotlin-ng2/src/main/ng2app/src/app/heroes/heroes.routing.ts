import { ModuleWithProviders } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { HeroesComponent } from './heroes.component';

const routes: Routes = [
  { path: '', component: HeroesComponent }
];

export const HeroesRouting: ModuleWithProviders = RouterModule.forChild(routes);
