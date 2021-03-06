// swift-tools-version:5.1
// The swift-tools-version declares the minimum version of Swift required to build this package.

import PackageDescription

let package = Package(
    name: "TodoWorld",
    dependencies: [
        // Dependencies declare other packages that this package depends on.
        // .package(url: "https://github.com/apple/swift-protobuf.git", .upToNextMinor(from: "1.7.0")),
        .package(url: "https://github.com/grpc/grpc-swift.git", from: "1.0.0-alpha.8")
    ],
    targets: [
        // Targets are the basic building blocks of a package. A target can define a module or a test suite.
        // Targets can depend on other targets in this package, and on products in packages which this package depends on.
        .target(
            name: "TodoWorld",
            dependencies: ["GRPC"]),
        .testTarget(
            name: "TodoWorldTests",
            dependencies: ["TodoWorld","GRPC"]),
    ]
)
