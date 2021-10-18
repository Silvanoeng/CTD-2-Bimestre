#!/bin/bash
####################################
#
# Backup to NFS mount script.
#
####################################

# What to backup. 
backup_files="D:\Digital-House\2b\Infra\Pasta\teste\*"

# Where to backup to.
dest="D:\Digital-House\2b\Infra\Pasta\Backup\"

FILE=/etc/resolv.conf if ; then echo "$FILE exist" else echo "$FILE does not exist" fi

# Create archive filename.
day=$(date +%A)
hostname=$(silvano -s)
archive_file="$hostname-$day.rar"

# Print start status message.
echo "Backing up $backup_files to $dest/$archive_file"
date
echo

# Backup the files using rar.
rar a $dest/$archive_file $backup_files

# Print end status message.
echo
echo "Backup finished"
date

# Long listing of files in $dest to check file sizes.
ls -lh $dest