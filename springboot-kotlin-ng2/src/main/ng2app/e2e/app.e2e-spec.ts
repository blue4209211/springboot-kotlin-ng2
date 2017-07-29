import { Ng2appPage } from './app.po';

describe('ng2app App', () => {
  let page: Ng2appPage;

  beforeEach(() => {
    page = new Ng2appPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!');
  });
});
