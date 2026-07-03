class Solution(object):
    def findMaxPathScore(self, edges, online, k):
        n = len(online)

        graph = [[] for _ in range(n)]
        indeg = [0] * n
        mx = 0

        for u, v, w in edges:
            graph[u].append((v, w))
            indeg[v] += 1
            mx = max(mx, w)

        q = deque(i for i in range(n) if indeg[i] == 0)
        topo = []

        while q:
            u = q.popleft()
            topo.append(u)
            for v, _ in graph[u]:
                indeg[v] -= 1
                if indeg[v] == 0:
                    q.append(v)

        def check(limit):
            INF = float("inf")
            dp = [INF] * n
            dp[0] = 0

            for u in topo:
                if dp[u] == INF:
                    continue
                for v, w in graph[u]:
                    if w < limit:
                        continue
                    if v != n - 1 and not online[v]:
                        continue
                    dp[v] = min(dp[v], dp[u] + w)

            return dp[-1] <= k

        lo, hi = 0, mx
        ans = -1

        while lo <= hi:
            mid = (lo + hi) // 2
            if check(mid):
                ans = mid
                lo = mid + 1
            else:
                hi = mid - 1

        return ans
        