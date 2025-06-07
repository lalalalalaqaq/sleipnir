import random
import requests

# API endpoint
url = "http://127.0.0.1:8080/master2/order/create"

# 设置请求头
headers = {
    "Content-Type": "application/json"
}

# 发送1000次请求
for i in range(1000):
    account_id = random.randint(100, 200)
    user_id = random.randint(100, 200)

    payload = {
        "accountId": account_id,
        "userId": user_id
    }

    try:
        response = requests.post(url, json=payload, headers=headers)
        print(f"Request {i+1}: Status Code {response.status_code}, Body: {response.text}")
    except Exception as e:
        print(f"Request {i+1} failed: {e}")