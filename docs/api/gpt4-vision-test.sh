curl -X POST "https://api.openai.com/v1/chat/completions" \
     -H "Content-Type: application/json" \
     -H "Authorization: Bearer sk-dWBDoMKgaV6enmfo888b45223e4c426881155156A59cF08f" \
     -d '{
             "frequency_penalty": 0,
             "max_tokens": 4096,
             "messages": [
                 {
                     "content": [
                         {
                             "text": "识别图片内容",
                             "type": "text"
                         }
                     ],
                     "role": "user"
                 },
                 {
                     "content": [
                         {
                             "text": "data:image/png;base64",
                             "type": "image_url"
                         }
                     ],
                     "role": "user"
                 }
             ],
             "model": "gpt-4-vision-preview",
             "presence_penalty": 0,
             "stream": true,
             "temperature": 0
         }'
