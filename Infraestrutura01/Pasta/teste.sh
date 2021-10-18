FILE = "D:\Digital-House\2b\Infra\Pasta\Backup"
if [ -f "$FILE"]; then
    echo "$FILE existe"
else
    echo "$FILE não existe"
fi