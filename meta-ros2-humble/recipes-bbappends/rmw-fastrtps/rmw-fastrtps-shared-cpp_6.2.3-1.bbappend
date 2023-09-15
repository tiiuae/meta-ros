# Copyright (c) 2019 LG Electronics, Inc.

ROS_BUILD_DEPENDS += " \
    rosidl-cmake \
    rosidl-default-runtime \
    rosidl-generator-cpp \
    rosidl-adapter \
"
BPN = "rmw_fastrtps_shared_cpp"

FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"
# This fix is originally from the repository below.
# https://github.com/eProsima/rmw_fastrtps/tree/vulcanexus-humble
SRC_URI += " \
    file://0001-Add-PKCS-11-changes-to-Humble-branch-12.patch \
"