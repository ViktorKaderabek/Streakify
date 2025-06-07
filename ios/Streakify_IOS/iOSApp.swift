import SwiftUI
import shared


@main
struct iOSApp: App {
    
    init(){
        PlatformIOSKt.doInitKoinIos()
    }
    
	var body: some Scene {
		WindowGroup {
            ContentView().ignoresSafeArea(.all)
		}
	}
}

struct ContentView: UIViewControllerRepresentable {
    func makeUIViewController(context: Context) -> UIViewController {
        return AppKt.App()
    }

    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {
        // Updates will be handled by Compose
    }
}

