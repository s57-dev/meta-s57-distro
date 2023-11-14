DESCRIPTION = "My Custom Image based on core-image-minimal"
LICENSE = "MIT"
inherit core-image

IMAGE_INSTALL +="\
    packagegroup-s57-debug \
    "

IMAGE_BOOT_FILES = "bzImage"

WKS_FILE="bootimg_demo.wks"

IMAGE_FSTYPES:append = " ext4"
IMAGE_TYPEDEP_wic = "ext4"

do_image_wic[depends] += "syslinux:do_populate_sysroot syslinux-native:do_populate_sysroot mtools-native:do_populate_sysroot dosfstools-native:do_populate_sysroot"

