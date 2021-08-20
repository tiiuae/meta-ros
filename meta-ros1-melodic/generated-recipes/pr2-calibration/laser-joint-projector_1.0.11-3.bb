# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Projects laser readings into a point cloud, based on a set of recorded joint angles      This package is experimental and unstable.      Expect its APIs to change."
AUTHOR = "Dave Feil-Seifer <dave@cse.unr.edu>"
ROS_AUTHOR = "Vijay Pradeep"
HOMEPAGE = "http://www.ros.org/wiki/laser_joint_projector"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pr2_calibration"
ROS_BPN = "laser_joint_projector"

ROS_BUILD_DEPENDS = " \
    calibration-msgs \
    cmake-modules \
    geometry-msgs \
    kdl-parser \
    orocos-kdl \
    roscpp \
    roscpp-serialization \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    calibration-msgs \
    cmake-modules \
    geometry-msgs \
    kdl-parser \
    orocos-kdl \
    roscpp-serialization \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    calibration-msgs \
    cmake-modules \
    geometry-msgs \
    kdl-parser \
    orocos-kdl \
    roscpp-serialization \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/UNR-RoboticsResearchLab/pr2_calibration-release/archive/release/melodic/laser_joint_projector/1.0.11-3.tar.gz
ROS_BRANCH ?= "branch=release/melodic/laser_joint_projector"
SRC_URI = "git://github.com/UNR-RoboticsResearchLab/pr2_calibration-release;${ROS_BRANCH};protocol=https"
SRCREV = "1cbf2d5de5c3f6659a74efc6437d783cbf635beb"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}