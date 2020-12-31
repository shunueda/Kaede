class KanjiComponent(object):
    component = str()

    def __init__(self, component):
        self.component = component

    def format(self):
        temp = self.component
        counter = None
        temp = temp.substring(1, 1 - len(temp))
        eachArr = temp.trim().split("")
        index = 0
        for s in eachArr:
            if counter == None:
                counter = 0
            elif s == "[":
                counter = counter + 1
            elif s == "]":
                counter = counter - 1
            elif counter == 0:
                temp = temp.substring(0, index - 1) + ";" + temp.substring(index)
            index += 1
        arr = temp.split(";")
        res = StringBuilder()
        inner = ""
        for it in arr:
            inner = it.substring(it.indexOf(",") + 2, 1 - len(it))
            res.append(inner.split(",")[0].replace("\"", ""))
        return res.__str__()