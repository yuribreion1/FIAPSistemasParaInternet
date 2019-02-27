---
layout: post
title: Listando alunos
--- 
<ul>
{% for i in site.data.alunos %}
    <li>{{ i.nome }}</li>
{% endfor %}
</ul>