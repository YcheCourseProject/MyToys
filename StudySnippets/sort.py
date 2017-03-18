import random

minimal_num = -1


class Node:
    def __init__(self, node_val):
        self.val = node_val
        self.next_list = []
        self.prev = None

    def __str__(self):
        pre_str = 'None' if self.prev is None else str(self.prev.val)
        info_list = ['value:' + str(self.val), 'next_lst:' + str(map(lambda ele: ele.val, self.next_list)),
                     'prev:' + pre_str]
        return '{' + ','.join(info_list) + '}'


def depth_first_search(global_list, node):
    if node.val != minimal_num:
        global_list.append(node.val)
    for ele in node.next_list:
        print ele
        depth_first_search(global_list, ele)


def rand_sort(number_list):
    # init
    node_list = map(lambda num: Node(num), number_list)
    numb_node = Node(minimal_num)
    max_node = numb_node

    for new_node in node_list:
        # find the place to insert
        if max_node == numb_node:
            first_less_prev = numb_node
        else:
            first_less_prev = max_node.prev
            while first_less_prev.val > new_node.val:
                first_less_prev = first_less_prev.prev

        new_node.prev = first_less_prev
        first_less_prev.next_list.append(new_node)

        # insert check
        to_remove = []
        for ele in first_less_prev.next_list:
            if ele != new_node and ele.val > new_node.val:
                ele.prev = new_node
                new_node.next_list.append(ele)
                to_remove.append(ele)

        for ele in to_remove:
            first_less_prev.next_list.remove(ele)

        # update max_node
        if new_node.val > max_node.val:
            max_node = new_node

    global_list = []
    depth_first_search(global_list, numb_node)
    return global_list


print rand_sort([3, 1, 4, 6, 2, 5, 7])
my_lst = [i for i in range(15)]
random.shuffle(my_lst)
print my_lst
print rand_sort(my_lst)