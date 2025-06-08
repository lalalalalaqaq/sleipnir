import requests
import random
import string

# API 地址
url = "http://127.0.0.1:8080/boardcast/address/create"

# 设置请求头
headers = {
    "Content-Type": "application/json"
}

# 随机生成长度为 min_length ~ max_length 的英文字符串（包含大小写字母和数字）
def random_string(min_length=10, max_length=30):
    length = random.randint(min_length, max_length)
    letters = string.ascii_letters + string.digits  # a-z, A-Z, 0-9
    return ''.join(random.choice(letters) for _ in range(length))

# 发送 1000 次请求
for i in range(1000):
    address_name = random_string(10, 30)   # 生成 10~30 字符的英文字符串
    user_id = random.randint(1, 1000000)   # 随机生成 userId（1~1000000）

    payload = {
        "addressName": address_name,
        "userId": user_id
    }

    try:
        response = requests.post(url, json=payload, headers=headers)
        print(f"Request {i+1}: Status Code {response.status_code}, Body: {response.text}")
    except Exception as e:
        print(f"Request {i+1} failed: {e}")