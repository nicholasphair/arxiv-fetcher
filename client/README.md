# client
A Java client generated from an OpenAPI specification of the [arxiv api][1].  

The arxiv api returns [atom][2], which is XML, but the OpenAPI generators hardly support
XML. While the generated Java client is better than its Python counterpart, it still
needed to be hacked a bit to get the parsing to work. As such, this client is a bit of
a snowflake, since it diverges from the auto-generated code. At somepoint, maybe I will
contribute back to the upstream project to get try and support XML better.  



[1]: https://arxiv.org/help/api/user-manual
[2]: https://en.wikipedia.org/wiki/Atom_(web_standard)
