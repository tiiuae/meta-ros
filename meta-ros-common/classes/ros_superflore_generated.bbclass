# Inherited by every recipe that superflore generates.
#
# Copyright (c) 2019 LG Electronics, Inc.

ROS_SUPERFLORE_GENERATED = "1"

# If superflore found this BPN listed as a build tool, extend the recipe to build BPN-native and BPN-nativesdk.
# BBCLASSEXTEND:append = "${@bb.utils.contains('ROS_SUPERFLORE_GENERATED_BUILDTOOLS', '${BPN}-native', ' native nativesdk ', '', d)}"
# BBCLASSEXTEND:append = "${@bb.utils.contains('ROS_DEPENDS_NATIVESDK_LIBRARIES', '${BPN}-native', ' native nativesdk ', '', d)}"
# BBCLASSEXTEND:append = "${@bb.utils.contains('ROS_DEPENDS_NATIVESDK_LIBRARIES', 'nativesdk-${BPN}', ' native nativesdk ', '', d)}"

# BBCLASSEXTEND =+ "${BPN}-native native nativesdk"
BBCLASSEXTEND:append = "${@bb.utils.contains_any('ROS_WORLD_SKIP_GROUPS', '${BPN}', '', ' native nativesdk ', d)}"
CFLAGS:container-riscv64:append = "${@bb.utils.contains_any('ROS_WORLD_SKIP_GROUPS', '${BPN}', '', ' -latomic ', d)}"
CXXFLAGS:container-riscv64:append = "${@bb.utils.contains_any('ROS_WORLD_SKIP_GROUPS', '${BPN}', '', ' -latomic ', d)}"
# BBCLASSEXTEND:remove = "${@bb.utils.contains('ROS_SUPERFLORE_GENERATED_RECIPES', 'spdlog', 'native', '', d)}"
# BBCLASSEXTEND:remove = "${@bb.utils.contains('ROS_SUPERFLORE_GENERATED_RECIPES', 'spdlog', 'nativesdk', '', d)}"
inherit ros_component
