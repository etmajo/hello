#!/usr/bin/env node

'use strict';

var c = require("skilstak-colors");
var out = process.stdout;


while (true) {
  out.write(c.cl + c.rc + "Hello " + c.rc + "world\n" + c.x);
}

