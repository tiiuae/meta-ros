# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_eloquent
inherit ros_superflore_generated

DESCRIPTION = "<p>       amcl is a probabilistic localization system for a robot moving in       2D. It implements the adaptive (or KLD-sampling) Monte Carlo       localization approach (as described by Dieter Fox), which uses a       particle filter to track the pose of a robot against a known map.     </p>     <p>       This node is derived, with thanks, from Andrew Howard's excellent       'amcl' Player driver.     </p>"
AUTHOR = "Mohammad Haghighipanah <mohammad.haghighipanah@intel.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "LGPL-2.1-or-later"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=d94c5c8f30151b2fe7d07ba53ed6444b"

ROS_CN = "navigation2"
ROS_BPN = "nav2_amcl"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    launch-ros \
    launch-testing \
    message-filters \
    nav-msgs \
    nav2-common \
    nav2-util \
    rclcpp \
    sensor-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    launch-ros \
    launch-testing \
    message-filters \
    nav-msgs \
    nav2-util \
    rclcpp \
    sensor-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    launch-ros \
    launch-testing \
    message-filters \
    nav-msgs \
    nav2-util \
    rclcpp \
    sensor-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
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

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/SteveMacenski/navigation2-release/archive/release/eloquent/nav2_amcl/0.3.5-1.tar.gz
ROS_BRANCH ?= "branch=release/eloquent/nav2_amcl"
SRC_URI = "git://github.com/SteveMacenski/navigation2-release;${ROS_BRANCH};protocol=https"
SRCREV = "9e0a7412b916747bc6bb34696eb4c9a16e9e3609"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
