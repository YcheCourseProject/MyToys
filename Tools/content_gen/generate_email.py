import os

if __name__ == '__main__':
    with open('users.txt') as ifs:
        user_lst = map(lambda my_str: my_str.strip(), ifs.readlines())
        print user_lst

    with open('accounts.txt') as ifs:
        account_lst = map(lambda my_str: my_str.strip().split(), ifs.readlines())
        print account_lst

    with open('email_addr.txt') as ifs:
        email_lst = map(lambda my_str: my_str.strip(), ifs.readlines())
        print email_lst

    grouped_lst = zip(user_lst, map(lambda my_pair: my_pair[0], account_lst),
                      map(lambda my_pair: my_pair[1], account_lst), email_lst)
    print grouped_lst, '\n'


    def get_email(my_tuple):
        with open('email_body.txt') as ifs:
            lines = ifs.readlines()
            my_str = ''.join(lines)
            my_str = my_str.replace('student_name', my_tuple[0])
            my_str = my_str.replace('account_name', my_tuple[1])
            my_str = my_str.replace('passwd_info', my_tuple[2])
            my_str = my_str.replace('email_addr', my_tuple[3])
            return my_str


    os.system('mkdir -p emails')
    for idx, my_tuple in enumerate(grouped_lst):
        print 'cur num:', idx
        with open('emails/' + my_tuple[0] + '-' + str(idx + 1) + '.txt', 'w') as ofs:
            ofs.write(get_email(my_tuple))
