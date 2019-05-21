def shift(ls):
    ls.insert(len(ls),ls[0])
    del ls[0]
    return ls

ls = input("Input string :: ").split(" ")
print(" ".join(ls))
for i in range(len(ls)-1):
    newls = shift(ls)
    print(" ".join(newls))
    ls = newls
