import requests

# API endpoint
url = "http://127.0.0.1:8080/master2/order/create"

# 设置请求头
headers = {
    "Content-Type": "application/json"
}

# 构建 100 组固定的 (accountId, userId)
account_user_pairs = [
    (100 + i, 2000 + i) for i in range(100)  # 可按需修改起始值
]

# 发送 1000 次请求，循环使用这 100 组数据
for i in range(2000):
    account_id, user_id = account_user_pairs[i % len(account_user_pairs)]
    
    payload = {
        "accountId": account_id,
        "userId": user_id
    }

    try:
        response = requests.post(url, json=payload, headers=headers)
        print(f"Request {i+1}: Status Code {response.status_code}, Body: {response.text}")
    except Exception as e:
        print(f"Request {i+1} failed: {e}")