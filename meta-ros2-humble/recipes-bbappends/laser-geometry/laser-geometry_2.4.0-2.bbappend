# ROS_BUILDTOOL_DEPENDS += " \
#     python3-numpy-native \
# "
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
SRC_URI += " \
    file://0001-update-cpp-version.patch \
    file://0001-PATCH-CMakeListstxt-making-package-relocatable.patch \
"
