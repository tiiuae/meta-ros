ROS_DISTRO = "humble"

EXTRA_OECMAKE += " \
    -DPYTHON_INSTALL_DIR=lib/${PYTHON_DIR}/site-packages \
"

inherit setuptools3-base

inherit ${ROS_DISTRO_TYPE}_distro
