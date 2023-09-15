# This patch did not work as its supposed to do, causing hardcoded paths
# to libzstd.
# FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
# SRC_URI:append = " \
#     file://0001-CMakeLists.txt-using-pkgconfig-for-libzstd.patch \
# "
