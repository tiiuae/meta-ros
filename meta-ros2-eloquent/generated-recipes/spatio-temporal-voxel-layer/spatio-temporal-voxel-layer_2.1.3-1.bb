# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_eloquent
inherit ros_superflore_generated

DESCRIPTION = "The spatio-temporal 3D obstacle costmap package"
AUTHOR = "Steve Macenski <stevenmacenski@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "LGPL v2.1"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=51cb7c4da723adcc172e438a5d750382"

ROS_CN = "spatio_temporal_voxel_layer"
ROS_BPN = "spatio_temporal_voxel_layer"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libopenexr-dev} \
    ${ROS_UNRESOLVED_DEP-libopenvdb-dev} \
    ${ROS_UNRESOLVED_DEP-libopenvdb} \
    builtin-interfaces \
    geometry-msgs \
    laser-geometry \
    message-filters \
    nav2-costmap-2d \
    pcl \
    pcl-conversions \
    pluginlib \
    rclcpp \
    rosidl-default-generators \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tbb \
    tf2-geometry-msgs \
    tf2-ros \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libopenexr-dev} \
    ${ROS_UNRESOLVED_DEP-libopenvdb-dev} \
    ${ROS_UNRESOLVED_DEP-libopenvdb} \
    builtin-interfaces \
    geometry-msgs \
    laser-geometry \
    message-filters \
    nav2-costmap-2d \
    pcl \
    pcl-conversions \
    pluginlib \
    rclcpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tbb \
    tf2-geometry-msgs \
    tf2-ros \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libopenexr-dev} \
    ${ROS_UNRESOLVED_DEP-libopenvdb-dev} \
    ${ROS_UNRESOLVED_DEP-libopenvdb} \
    builtin-interfaces \
    geometry-msgs \
    laser-geometry \
    message-filters \
    nav2-costmap-2d \
    pcl \
    pcl-conversions \
    pluginlib \
    rclcpp \
    rosidl-default-runtime \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tbb \
    tf2-geometry-msgs \
    tf2-ros \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/SteveMacenski/spatio_temporal_voxel_layer-release/archive/release/eloquent/spatio_temporal_voxel_layer/2.1.3-1.tar.gz
ROS_BRANCH ?= "branch=release/eloquent/spatio_temporal_voxel_layer"
SRC_URI = "git://github.com/SteveMacenski/spatio_temporal_voxel_layer-release;${ROS_BRANCH};protocol=https"
SRCREV = "94077047b931d4dbbf2ea0a8d66ef115d1bcfcdf"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
