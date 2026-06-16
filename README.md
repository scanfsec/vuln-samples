# vuln-samples

**VulnForge 创建的漏洞代码测试用例。**

> **警告：本仓库代码均为故意编写的漏洞示例，仅用于 VulnForge 静态分析、规则评测与安全教育。禁止用于任何未授权测试或恶意用途。**

每个语言目录包含两类样本：

1. **`01`–`10`** — 对齐 [OWASP Top 10 (2021)](https://owasp.org/Top10/) 的 Web/应用层典型漏洞
2. **`native_*`** — 该语言运行时或内存模型下的特有漏洞（不限于 Web）

## 语言目录

| 目录 | 语言 | OWASP 样本 | 语言特有样本 |
|------|------|------------|--------------|
| `python/` | Python | 10 | YAML 反序列化、ReDoS、路径穿越等 |
| `java/` | Java | 10 | XXE、JNDI 注入、JNI 边界等 |
| `javascript/` | JavaScript | 10 | 原型污染、ReDoS、`vm` 沙箱逃逸等 |
| `php/` | PHP | 10 | 弱类型比较、LFI/RFI、变量覆盖等 |
| `c/` | C | 10 | 栈/堆溢出、UAF、双重释放、整型溢出等 |
| `go/` | Go | 10 | 竞态、不安全指针、`unsafe` 滥用等 |

## OWASP Top 10 对照

| # | 类别 | CWE 示例 |
|---|------|----------|
| 01 | Broken Access Control | CWE-639, CWE-22 |
| 02 | Cryptographic Failures | CWE-327, CWE-798 |
| 03 | Injection | CWE-89, CWE-78, CWE-79 |
| 04 | Insecure Design | CWE-840, CWE-602 |
| 05 | Security Misconfiguration | CWE-16, CWE-215 |
| 06 | Vulnerable Components | CWE-1104 |
| 07 | Auth Failures | CWE-287, CWE-384 |
| 08 | Integrity Failures | CWE-502, CWE-829 |
| 09 | Logging Failures | CWE-778, CWE-532 |
| 10 | SSRF | CWE-918 |

## 语言特有漏洞索引

| 语言 | 文件 | CWE |
|------|------|-----|
| C | `native_stack_overflow.c` | CWE-121 |
| C | `native_heap_overflow.c` | CWE-122 |
| C | `native_use_after_free.c` | CWE-416 |
| C | `native_double_free.c` | CWE-415 |
| C | `native_format_string.c` | CWE-134 |
| C | `native_integer_overflow.c` | CWE-190 |
| C | `native_null_deref.c` | CWE-476 |
| Python | `native_yaml_load.py` | CWE-502 |
| Python | `native_regex_dos.py` | CWE-1333 |
| Python | `native_path_traversal.py` | CWE-22 |
| Python | `native_subprocess_shell.py` | CWE-78 |
| Java | `native_xxe.java` | CWE-611 |
| Java | `native_jndi_injection.java` | CWE-917 |
| Java | `native_ldap_injection.java` | CWE-90 |
| JavaScript | `native_prototype_pollution.js` | CWE-1321 |
| JavaScript | `native_redos.js` | CWE-1333 |
| JavaScript | `native_vm_escape.js` | CWE-94 |
| PHP | `native_type_juggling.php` | CWE-843 |
| PHP | `native_file_inclusion.php` | CWE-98 |
| PHP | `native_variable_overwrite.php` | CWE-621 |
| Go | `native_race_condition.go` | CWE-362 |
| Go | `native_unsafe_pointer.go` | CWE-822 |
| Go | `native_slice_bounds.go` | CWE-787 |

## 使用方式

```bash
# 仅供静态分析 / SAST 工具喂样，勿直接运行
grep -r "VULN:" python/ c/
```

## License

MIT — 教育用途，作者不承担滥用责任。
