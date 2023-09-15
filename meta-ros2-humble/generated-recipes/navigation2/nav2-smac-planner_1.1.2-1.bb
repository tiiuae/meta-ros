# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Smac global planning plugin: A*, Hybrid-A*, State Lattice"
AUTHOR = "Steve Macenski <stevenmacenski@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "navigation2"
ROS_BPN = "nav2_smac_planner"

ROS_BUILD_DEPENDS = " \
    angles \
    builtin-interfaces \
    eigen3-cmake-module \
    geometry-msgs \
    libeigen \
    nav-msgs \
    nav2-common \
    nav2-core \
    nav2-costmap-2d \
    nav2-msgs \
    nav2-util \
    nlohmann-json \
    ompl \
    pluginlib \
    rclcpp \
    rclcpp-action \
    rclcpp-lifecycle \
    tf2-ros \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    angles \
    builtin-interfaces \
    eigen3-cmake-module \
    geometry-msgs \
    libeigen \
    nav-msgs \
    nav2-common \
    nav2-core \
    nav2-costmap-2d \
    nav2-msgs \
    nav2-util \
    nlohmann-json \
    ompl \
    pluginlib \
    rclcpp \
    rclcpp-action \
    rclcpp-lifecycle \
    tf2-ros \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    angles \
    builtin-interfaces \
    eigen3-cmake-module \
    geometry-msgs \
    libeigen \
    nav-msgs \
    nav2-common \
    nav2-core \
    nav2-costmap-2d \
    nav2-msgs \
    nav2-util \
    nlohmann-json \
    ompl \
    pluginlib \
    rclcpp \
    rclcpp-action \
    rclcpp-lifecycle \
    tf2-ros \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/SteveMacenski/navigation2-release/archive/release/humble/nav2_smac_planner/1.1.2-1.tar.gz
ROS_BRANCH ?= "branch=release/humble/nav2_smac_planner"
SRC_URI = "git://github.com/SteveMacenski/navigation2-release;${ROS_BRANCH};protocol=https"
SRCREV = "a97707c2335131d24308bb04c198bc33b1166499"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
