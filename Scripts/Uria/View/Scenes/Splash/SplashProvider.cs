namespace Uria.View.Scenes.Splash {
    public sealed class SplashProvider
    {
        public ISplashPresenter provide(ISplashView view) {
            ISplashPresenter presenter = new SplashPresenter();
            return presenter;
        }
    }
}