# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "Launch files and scripts needed to configure     the controllers of the PMB2 robot."
AUTHOR = "Victor Lopez <victor.lopez@pal-robotics.com>"
ROS_AUTHOR = "Enrique Fernandez <enrique.fernandez@pal-robotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "pmb2_robot"
ROS_BPN = "pmb2_controller_configuration"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-auto-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    controller-manager \
    diff-drive-controller \
    imu-sensor-broadcaster \
    joint-state-controller \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/pal-gbp/pmb2_robot-gbp/archive/release/foxy/pmb2_controller_configuration/4.0.2-1.tar.gz
ROS_BRANCH ?= "branch=release/foxy/pmb2_controller_configuration"
SRC_URI = "git://github.com/pal-gbp/pmb2_robot-gbp;${ROS_BRANCH};protocol=https"
SRCREV = "aac5f581131427bb46d9f93cfc190b9f5dcc3688"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
