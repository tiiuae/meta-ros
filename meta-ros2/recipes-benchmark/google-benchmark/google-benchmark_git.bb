# Copyright (c) 2020-2021 LG Electronics, Inc.

SUMMARY = "A library to benchmark code snippets, similar to unit tests."
HOMEPAGE = "https://github.com/google/benchmark"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

PV = "1.7.0+git${SRCPV}"

# matches with tag 1.7.0
SRCREV = "361e8d1cfe0c6c36d30b39f1b61302ece5507320"
SRC_URI = "git://github.com/google/benchmark;branch=main;protocol=https"

S = "${WORKDIR}/git"

# Needs gtest
EXTRA_OECMAKE += "-DBENCHMARK_ENABLE_GTEST_TESTS=OFF -DBENCHMARK_ENABLE_TESTING=OFF"

# Build shared libraries
EXTRA_OECMAKE += "-DBUILD_SHARED_LIBS=ON"

inherit cmake

