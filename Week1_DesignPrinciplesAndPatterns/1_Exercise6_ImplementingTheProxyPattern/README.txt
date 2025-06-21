Project: ProxyPatternExample

This project demonstrates the Proxy Pattern for lazy initialization and caching of image loading.

Behavior:
- RealImage simulates loading from a remote server.
- ProxyImage caches RealImage instances and loads only once per image.

Run ProxyTest.java:
- Only the first load triggers "Loading from server".
- Repeated displays reuse cached images.

Useful for resource-heavy operations like image loading, video streaming, or large datasets.