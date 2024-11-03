curl -X POST "https://api.openai.com/v1/chat/completions" \
     -H "Content-Type: application/json" \
     -H "Authorization: Bearer sk-dWBDoMKgaV6enmfo888b45223e4c426881155156A59cF08f" \
     -d '{
           "model": "gpt-4-vision-preview",
           "max_tokens": 4096,
           "messages": [
             {
               "role": "system",
               "content": [
                {
                  "text": "Role: Tailwind CSS Developer Input: Screenshot(s) of a reference web page or Low-fidelity Output: Single HTML page using Tailwind CSS, HTML",
                  "type": "text"
                }
              ]
             },
             {
               "role": "user",
               "content": [
                 {
                   "type": "image_url",
                   "image_url": {
                     "url": "https://upload.wikimedia.org/wikipedia/commons/thumb/d/dd/Gfp-wisconsin-madison-the-nature-boardwalk.jpg/2560px-Gfp-wisconsin-madison-the-nature-boardwalk.jpg"
                   }
                 }
               ]
             },
             {
                "role": "user",
                "content": [
                  {
                    "text": "Turn this into a single html file using tailwind.",
                    "type": "text"
                  }
                ]
              }
           ]
         }'
