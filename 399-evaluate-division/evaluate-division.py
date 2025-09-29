class Solution(object):
    def calcEquation(self, equations, values, queries):
        """
        :type equations: List[List[str]]
        :type values: List[float]
        :type queries: List[List[str]]
        :rtype: List[float]
        """

        pairs = defaultdict(list)

        for i, eq in enumerate(equations):
            a, b = eq
            pairs[a].append([b, values[i]])
            pairs[b].append([a, 1 / values[i]])

        def bfs(src, target):
            if src not in pairs or target not in pairs:
                return -1
            visited = set()
            q = deque()
            q.append([src, 1])
            visited.add(src)

            while q:
                n, w = q.popleft()
                if n == target:
                    return w

                for nei, weight in pairs[n]:
                    if nei not in visited:
                        q.append([nei, w * weight])
                        visited.add(nei)
                
            return -1

        return [bfs(q[0], q[1]) for q in queries]
        