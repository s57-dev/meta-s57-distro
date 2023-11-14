SUMMARY = "Debug package group"

inherit packagegroup features_check

# REQUIRED_DISTRO_FEATURES = ""

RDEPENDS:${PN} = " \
    strace \
"

