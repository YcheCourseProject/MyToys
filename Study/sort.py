minimal_num = -1


class Node:
    def __init__(self, node_val):
        self.val = node_val
        self.next_list = []
        self.prev = None

    def __str__(self):
        info_list = ['value:', self.val, 'next_lst:', self.next_list, 'prev:', self.prev]
        info_list = map(str, info_list)
        return ' '.join(info_list)


def depth_first_search(global_list, node):
    if node.val != -minimal_num:
        global_list.append(node)
    for ele in node:
        depth_first_search(global_list, ele)


def sort(number_list):
    node_list = map(lambda num: Node(num), number_list)
    numb_node = Node(minimal_num)
    max_node = numb_node
