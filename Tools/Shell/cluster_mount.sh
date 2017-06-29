sudo sshfs -o allow_other,IdentityFile=~/.ssh/id_rsa yche@gpu1.ust.hk:/ /mnt/mount-gpu
sudo sshfs -o allow_other,IdentityFile=~/.ssh/id_rsa yche@luocpu8.ust.hk:/ /mnt/luocpu8
sudo sshfs -d -o allow_other -o reconnect -o ServerAliveInterval=15 yche@luocpu8.ust.hk:/ /mnt -p 12345 -C
