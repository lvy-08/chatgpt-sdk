curl https://api.openai.com/v1/images/generations \
    -H "Content-Type: application/json" \
    -H "Authorization: Bearer sk-kgUPx1vKDywFbsun7c05Ed5eA4C24d4aA7B06aE9F78e8e0e" \
    -d '{
      "model": "dall-e-3",
      "prompt": "画一个程序员",
      "n": 1,
      "size": "1024x1024"
    }'
