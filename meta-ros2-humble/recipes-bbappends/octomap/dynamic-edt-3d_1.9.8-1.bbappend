BPN = "dynamicEDT3D"

FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"
SRC_URI:append = " \
    file://0001-Fixing-qa-useless-rpaths.patch \
"

inherit ros_ament_cmake



#fix qa [installed-vs-shipped]
do_install:append() {
    install -m755 -d  ${D}${datadir}/dynamicEDT3D/cmake
    mv ${D}${datadir}/dynamicEDT3D/*.cmake ${D}${datadir}/dynamicEDT3D/cmake
}

#fix qa [dev-so]
FILES:${PN}-dev += " \
    ${libdir}/libdynamicedt3d.so \
"
