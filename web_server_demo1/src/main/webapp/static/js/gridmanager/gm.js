!function (e, t) {
    if ("object" == typeof exports && "object" == typeof module) module.exports = t(); else if ("function" == typeof define && define.amd) define([], t); else {
        var o = t();
        for (var n in o) ("object" == typeof exports ? exports : e)[n] = o[n]
    }
}(self, (function () {
    return (() => {
        var e = {
            956: e => {
                e.exports = '<div class="gm-toolbar" {{vm.keyName}}="{{vm.gridManagerName}}"><span class="refresh-action"><i class="gm-icon gm-icon-refresh"></i></span><div class="goto-page">{{ vm.gotoFirstText }}<input type="text" class="gp-input" current-page-info/>{{ vm.gotoLastText }}</div><div class="change-size">{{ vm.pageSizeOptionTpl }}</div><div class="toolbar-info checked-info"></div><div class="toolbar-info page-info"></div><div class="pagination"><ul pagination-before><li class="first-page">{{ vm.firstPageText }}</li><li class="previous-page">{{ vm.previousPageText }}</li></ul><ul pagination-number></ul><ul pagination-after><li class="next-page">{{ vm.nextPageText }}</li><li class="last-page">{{ vm.lastPageText }}</li></ul></div></div>'
            }, 976: e => {
                e.exports = "<label class=\"gm-checkbox-wrapper{{vm.disabled ? ' disabled-radio-checkbox' : ''}}\"><span class=\"gm-radio-checkbox gm-checkbox{{vm.checked === 'checked' ? ' gm-checkbox-checked' : ''}}\"><input type=\"checkbox\" class=\"gm-radio-checkbox-input gm-checkbox-input\"{{vm.value ? ' value=\"' + vm.value + '\"' : ''}}{{vm.checked === 'checked' ? ' checked=\"true\"' : ''}}/><span class=\"gm-radio-checkbox-inner gm-checkbox-inner\"></span></span>{{vm.label ? '<span class=\"gm-radio-checkbox-label\">' + vm.label + '</span>' : ''}}</label>"
            }, 692: e => {
                e.exports = "<td gm-create gm-checkbox>{{vm.template}}</td>"
            }, 963: e => {
                e.exports = "<label class=\"gm-radio-wrapper{{vm.disabled ? ' disabled-radio-checkbox' : ''}}\"><span class=\"gm-radio-checkbox gm-radio{{vm.checked ? ' gm-radio-checked' : ''}}\"><input type=\"radio\" class=\"gm-radio-checkbox-input gm-radio-input\"{{vm.value ? ' value=\"' + vm.value + '\"' : ''}}{{vm.checked ? ' checked=\"true\"' : ''}}/><span class=\"gm-radio-checkbox-inner gm-radio-inner\"></span></span>{{vm.label ? '<span class=\"gm-radio-checkbox-label\">' + vm.label + '</span>' : ''}}</label>"
            }, 271: e => {
                e.exports = '<div class="gm-config-area" {{vm.key}}><span class="config-action"><i class="gm-icon gm-icon-close"></i></span><div class="config-info">{{vm.info}}</div><ul class="config-list"></ul></div>'
            }, 125: e => {
                e.exports = '<th {{vm.thAttr}}><div class="th-wrap"><span class="{{vm.thTextClassName}}" {{vm.compileAttr}}>{{vm.thText}}</span></div></th>'
            }, 397: e => {
                e.exports = "{{vm.thListTpl}}"
            }, 985: e => {
                e.exports = '<div class="{{vm.classNames}}" {{vm.wrapKey}}><div class="table-header"></div><div class="table-div" {{vm.divKey}}></div><span class="text-dreamland"></span>{{vm.configTpl}} {{vm.ajaxPageTpl}}</div>'
            }, 909: e => {
                e.exports = '<table class="dreamland-table {{vm.class}}"><thead><tr>{{vm.th}}</tr></thead><tbody>{{vm.tbody}}</tbody></table>'
            }, 986: e => {
                e.exports = '<div class="gm-dropdown"><span class="gm-dropdown-text"></span><span class="gm-dropdown-icon"></span><ul class="gm-dropdown-list">{{vm.li}}</ul></div>'
            }, 285: e => {
                e.exports = '<div class="gm-filter-area"><i class="fa-icon gm-icon gm-icon-filter{{vm.icon}}"></i><div class="fa-con"><ul class="filter-list" {{vm.style}}>{{vm.list}}</ul><div class="filter-bottom"><span class="filter-button filter-submit">{{vm.ok}}</span><span class="filter-button filter-reset">{{vm.reset}}</span></div></div></div>'
            }, 763: e => {
                e.exports = '<table class="dreamland-row {{vm.class}}"><tbody>{{vm.tbody}}</tbody></table>'
            }, 923: e => {
                e.exports = '<div class="gm-remind-action"><i class="ra-icon gm-icon gm-icon-help"></i><div class="ra-area" {{vm.style}}>{{vm.text}}</div></div>'
            }, 472: e => {
                e.exports = '<div class="gm-sorting-action"><i class="sa-icon sa-up gm-icon gm-icon-up"></i><i class="sa-icon sa-down gm-icon gm-icon-down"></i></div>'
            }
        }, t = {};

        function o(n) {
            var s = t[n];
            if (void 0 !== s) return s.exports;
            var r = t[n] = {exports: {}};
            return e[n](r, r.exports, o), r.exports
        }

        o.n = e => {
            var t = e && e.__esModule ? () => e.default : () => e;
            return o.d(t, {a: t}), t
        }, o.d = (e, t) => {
            for (var n in t) o.o(t, n) && !o.o(e, n) && Object.defineProperty(e, n, {enumerable: !0, get: t[n]})
        }, o.o = (e, t) => Object.prototype.hasOwnProperty.call(e, t), o.r = e => {
            "undefined" != typeof Symbol && Symbol.toStringTag && Object.defineProperty(e, Symbol.toStringTag, {value: "Module"}), Object.defineProperty(e, "__esModule", {value: !0})
        };
        var n = {};
        return (() => {
            "use strict";
            o.r(n), o.d(n, {default: () => kr, jTool: () => Q});
            const e = "jTool-create-dom", t = {
                    "[object String]": "string",
                    "[object Boolean]": "boolean",
                    "[object Undefined]": "undefined",
                    "[object Number]": "number",
                    "[object Object]": "object",
                    "[object Error]": "error",
                    "[object Function]": "function",
                    "[object Date]": "date",
                    "[object Array]": "array",
                    "[object RegExp]": "regexp",
                    "[object Null]": "null",
                    "[object NodeList]": "nodeList",
                    "[object Arguments]": "arguments",
                    "[object Window]": "window",
                    "[object HTMLDocument]": "document"
                }, s = window, r = s.document, a = e => e && e === e.window,
                i = e => e instanceof Element ? "element" : t[Object.prototype.toString.call(e)], c = () => {
                }, l = e => e.jTool, d = (e, t) => {
                    const o = e.DOMList;
                    if (!g(o)) return b(t) ? o[t] : o
                }, u = (e, t) => {
                    if (e && (!l(e) || (e = d(e), !g(e))) && (g(e.length) || [].every.call(e, ((e, o) => (!a(e) && l(e) && (e = e.get(0)), !1 !== t.call(e, e, o)))), x(e))) for (const o in e) {
                        const n = e[o];
                        if (!1 === t.call(n, o, n)) break
                    }
                }, h = (e, t) => getComputedStyle(e)[t], p = t => {
                    let o = r.querySelector(`#${e}`);
                    if (!o) {
                        const t = r.createElement("table");
                        t.id = e, t.style.display = "none", r.body.appendChild(t), o = r.querySelector(`#${e}`)
                    }
                    o.innerHTML = g(t) ? "" : t;
                    let n = o.childNodes;
                    if (1 === n.length) {
                        const e = n[0], o = e.nodeName, s = e.childNodes;
                        (!/<tbody|<TBODY/.test(t) && "TBODY" === o || !/<thead|<THEAD/.test(t) && "THEAD" === o || !/<tr|<TR/.test(t) && "TR" === o || !/<td|<TD/.test(t) && "TD" === o || !/<th|<TH/.test(t) && "TH" === o) && (n = s)
                    }
                    return r.body.removeChild(o), n
                }, g = e => "undefined" === i(e), f = e => "null" === i(e), m = e => "string" === i(e),
                v = e => "function" === i(e), b = e => "number" === i(e), y = e => "boolean" === i(e),
                x = e => "object" === i(e), w = e => {
                    let t = !0;
                    for (const o in e) e.hasOwnProperty(o) && (t = !1);
                    return t
                }, k = e => "array" === i(e), C = e => k(e) && e.length > 0, $ = e => "element" === i(e),
                T = e => "nodeList" === i(e);

            function S(...[]) {
                if (0 === arguments.length) return {};
                let e, t = !1, o = 1, n = arguments[0];
                for (1 === arguments.length && x(arguments[0]) ? (n = this, o = 0) : 2 === arguments.length && y(arguments[0]) ? (t = arguments[0], n = this, o = 1) : arguments.length > 2 && y(arguments[0]) && (t = arguments[0], n = arguments[1] || {}, o = 2); o < arguments.length; o++) e = arguments[o] || {}, s(e, n);

                function s(e, o) {
                    for (let n in e) e.hasOwnProperty(n) && (t && x(e[n]) ? (x(o[n]) || (o[n] = {}), s(e[n], o[n])) : o[n] = e[n])
                }

                return n
            }

            const D = {isWindow: a, noop: c, type: i, getStyle: h, isEmptyObject: w, each: u}, j = function (e, t) {
                let o = (() => {
                    if (!e) return void (e = null);
                    if (a(e) || e === r || $(e)) return [e];
                    if (T(e) || k(e)) return e;
                    if (l(e)) return e.DOMList;
                    if (/<.+>/.test(e)) return p(e.trim());
                    if (!t) return r.querySelectorAll(e);
                    m(t) && (t = r.querySelectorAll(t)), $(t) && (t = [t]), l(t) && (t = t.DOMList);
                    const o = [];
                    return u(t, (t => {
                        u(t.querySelectorAll(e), (e => {
                            e && o.push(e)
                        }))
                    })), o
                })();
                return o && 0 !== o.length || (o = void 0), this.jTool = !0, this.DOMList = o, this.length = o ? o.length : 0, this.querySelector = e, this
            }, A = "Content-Type", M = "application/x-www-form-urlencoded";

            function O(e) {
                if (!x(e)) return e;
                let t = "";
                return u(e, ((e, o) => {
                    t && (t += "&"), t += e + "=" + o
                })), t
            }

            function _(e) {
                let {
                    url: t,
                    type: o,
                    data: n,
                    headers: s,
                    async: r,
                    xhrFields: a,
                    beforeSend: i,
                    complete: l,
                    success: d,
                    error: u
                } = S({
                    url: null,
                    type: "GET",
                    data: null,
                    headers: {},
                    async: !0,
                    xhrFields: {},
                    beforeSend: c,
                    complete: c,
                    success: c,
                    error: c
                }, e);
                o = o.toUpperCase();
                const h = new XMLHttpRequest;
                let p;
                "GET" === o && n && (t = t + (-1 === t.indexOf("?") ? "?" : "&") + O(n)), "POST" === o && (s[A] || (s[A] = M), 0 === s[A].indexOf(M) && (p = O(n)), 0 === s[A].indexOf("application/json") && (p = JSON.stringify(n))), h.open(o, t, r);
                for (const e in a) h[e] = a[e];
                for (const e in s) h.setRequestHeader(e, s[e]);
                i(h), h.onload = () => {
                    l(h, h.status)
                }, h.onreadystatechange = function () {
                    if (4 !== h.readyState) return;
                    const e = h.status;
                    e >= 200 && e < 300 || 304 === e ? d(h.response, e) : u(h, e, h.statusText)
                }, h.send(p)
            }

            const P = e => e.jToolEvent || {}, R = (e, t, o, n, s) => {
                    if (v(o) && (s = n || !1, n = o, o = void 0), o && $(e[0]) || (o = ""), "" !== o) {
                        const e = n;
                        n = function (t) {
                            let n = t.target;
                            for (; n && n !== this;) {
                                if (-1 !== [].indexOf.call(this.querySelectorAll(o), n)) {
                                    e.apply(n, arguments);
                                    break
                                }
                                n = n.parentNode
                            }
                        }
                    }
                    const r = t.split(" "), a = [];
                    return u(r, (e => {
                        e.trim() && a.push({
                            eventName: e + o,
                            type: e.split(".")[0],
                            querySelector: o,
                            callback: n || c,
                            useCapture: s || !1
                        })
                    })), a
                }, E = {
                    on: function (e, t, o, n) {
                        return this.addEvent(R(d(this), e, t, o, n))
                    }, off: function (e, t) {
                        return this.removeEvent(R(d(this), e, t))
                    }, bind: function (e, t, o) {
                        return this.on(e, void 0, t, o)
                    }, unbind: function (e) {
                        return this.removeEvent(R(d(this), e))
                    }, trigger: function (e) {
                        return u(this, (t => {
                            try {
                                const o = P(t)[e];
                                if (o && o.length > 0) {
                                    const o = new Event(e);
                                    t.dispatchEvent(o)
                                } else "click" === e && t[e]()
                            } catch (t) {
                                console.error(`Event:[${e}] error`, t)
                            }
                        })), this
                    }, addEvent: function (e) {
                        return u(e, (e => {
                            u(this, (t => {
                                const o = P(t), {eventName: n, type: s, callback: r, useCapture: a} = e;
                                o[n] = o[n] || [], o[n].push(e), t.jToolEvent = o, t.addEventListener(s, r, a)
                            }))
                        })), this
                    }, removeEvent: function (e) {
                        return u(e, (e => {
                            u(this, (t => {
                                const o = P(t), n = e.eventName, s = o[n];
                                s && (u(s, (e => {
                                    t.removeEventListener(e.type, e.callback)
                                })), delete o[n])
                            }))
                        })), this
                    }
                },
                H = e => ["width", "max-width", "height", "top", "left", "right", "bottom", "padding", "margin"].some((t => -1 !== e.indexOf(t)));

            function z(e, t, o) {
                f(o) || g(o) || (b(o) && (o = o.toString()), -1 === o.indexOf("px") && H(t) && (o += "px"), u(e, (e => {
                    e.style[t] = o
                })))
            }

            const L = {
                css: function (e, t) {
                    const o = d(this);
                    if (m(e) && g(t)) {
                        const t = h(o[0], e);
                        return H(e) ? parseFloat(t) : t
                    }
                    if (x(e)) for (const t in e) z(o, t, e[t]); else z(o, e, t);
                    return this
                }, width: function (e) {
                    return this.css("width", e)
                }, height: function (e) {
                    return this.css("height", e)
                }
            };

            function N(e, t, o) {
                const n = function (e) {
                    return e.indexOf(" ") ? e.split(" ") : [e]
                }(t);
                u(e, (e => {
                    u(n, (t => {
                        e.classList[o](t)
                    }))
                }))
            }

            const q = {
                addClass: function (e) {
                    return N(d(this), e, "add"), this
                }, removeClass: function (e) {
                    return N(d(this), e, "remove"), this
                }, hasClass: function (e) {
                    return [].some.call(d(this), (function (t) {
                        return t.classList.contains(e)
                    }))
                }
            }, K = {
                append: function (e) {
                    return this.html(e, "append")
                }, prepend: function (e) {
                    return this.html(e, "prepend")
                }, before: function (e) {
                    l(e) && (e = d(e, 0));
                    const t = d(this, 0);
                    return t.parentNode.insertBefore(e, t), this
                }, after: function (e) {
                    l(e) && (e = d(e, 0));
                    const t = d(this, 0), o = t.parentNode;
                    o.lastChild === t ? o.appendChild(e) : o.insertBefore(e, t.nextSibling)
                }, text: function (e) {
                    return g(e) ? d(this, 0).textContent : (u(this, (t => {
                        t.textContent = e
                    })), this)
                }, html: function (e, t) {
                    const o = d(this);
                    if (g(e) && g(t)) return o[0].innerHTML;
                    let n;
                    return l(e) && (e = d(e)), (m(e) || b(e)) && (e = p(e)), $(e) && (e = [e]), u(o, (o => {
                        t || (o.innerHTML = ""), "prepend" === t && (n = o.firstChild), u(e, (e => {
                            e = e.cloneNode(!0), n ? o.insertBefore(e, n) : o.appendChild(e), o.normalize()
                        }))
                    })), this
                }, wrap: function (e, t) {
                    const o = p(e)[0], n = d(this, 0);
                    n.parentNode.insertBefore(o, n), o.querySelector(t).appendChild(n)
                }, closest: function (e) {
                    const t = d(this, 0);
                    return g(e) ? new j(t.parentNode) : new j(t.closest(e))
                }, parent: function () {
                    return this.closest()
                }, clone: function (e) {
                    return new j(d(this, 0).cloneNode(e || !1))
                }, remove: function () {
                    u(this, (e => {
                        e.remove()
                    }))
                }
            }, B = (e, t, o) => {
                const n = {top: "scrollTop", left: "scrollLeft"}[o];
                if (9 === e.nodeType && (e = e.body), !b(t)) return e[n];
                e[n] = t
            }, F = {
                offset: function () {
                    let e = {top: 0, left: 0};
                    const t = d(this, 0);
                    if (!t.getClientRects().length) return e;
                    if ("none" === h(t, "display")) return e;
                    e = t.getBoundingClientRect();
                    const o = t.ownerDocument.documentElement;
                    return {top: e.top + pageYOffset - o.clientTop, left: e.left + pageXOffset - o.clientLeft}
                }, scrollTop: function (e) {
                    return B(d(this, 0), e, "top")
                }, scrollLeft: function (e) {
                    return B(d(this, 0), e, "left")
                }
            }, I = {
                get: function (e) {
                    return d(this, e)
                }, eq: function (e) {
                    return new j(d(this, e))
                }, find: function (e) {
                    return new j(e, this)
                }, index: function (e) {
                    const t = d(this, 0);
                    return e ? l(e) && (e = d(e)) : e = t.parentNode.children, e ? [].indexOf.call(e, t) : -1
                }
            }, G = "inline-block", W = "table-cell", J = {
                TABLE: "table",
                THEAD: "table-header-group",
                TBODY: "table-row-group",
                TR: "table-row",
                TH: W,
                TD: W,
                SPAN: G,
                A: G,
                FONT: G,
                BUTTON: G,
                I: G
            }, V = {
                animate: function (e, t = 0, o = c) {
                    let n = "", s = "", a = d(this, 0);
                    u(e, ((e, t) => {
                        n += e + ":" + h(a, e) + ";", s += e + ":" + t + ";"
                    }));
                    const i = `@keyframes jToolAnimate {from {${n}}to {${s}}}`, l = r.createElement("style");
                    l.type = "text/css", r.head.appendChild(l), l.textContent = l.textContent + i, a.style.animation = `jToolAnimate ${t / 1e3}s ease-in-out forwards`, setTimeout((() => {
                        L.css.call(this, e), a.style.animation = "", r.head.removeChild(l), o()
                    }), t)
                }, show: function () {
                    return u(this, (e => {
                        e.style.display = J[e.nodeName] || "block"
                    })), this
                }, hide: function () {
                    return u(this, (e => {
                        e.style.display = "none"
                    })), this
                }
            }, U = e => f(e) ? void 0 : e, Y = {
                attr: function (e, t) {
                    return g(t) ? U(d(this, 0).getAttribute(e)) : (u(this, (o => {
                        o.setAttribute(e, t)
                    })), this)
                }, removeAttr: function (e) {
                    u(this, (t => {
                        t.removeAttribute(e)
                    }))
                }, prop: function (e, t) {
                    return g(t) ? U(d(this, 0)[e]) : (u(this, (o => {
                        o[e] = t
                    })), this)
                }, val: function (e) {
                    return this.prop("value", e) || ""
                }
            }, X = function (e, t) {
                return new j(e, t)
            };
            j.prototype = X.prototype = {}, X.extend = X.prototype.extend = S, X.extend(D), X.ajax = _, u([E, L, q, K, F, I, V, Y], (e => {
                X.prototype.extend(e)
            })), window.jTool = X;
            const Q = X, Z = "grid-manager", ee = "grid-manager-wrap", te = "grid-manager-div",
                oe = "grid-manager-config", ne = "grid-manager-toolbar", se = "grid-master", re = "grid-manager-thead",
                ae = "grid-manager-mock-thead", ie = "grid-manager-tbody", ce = "th-name", le = "gm-row-index",
                de = "gm-tr-row", ue = "gm-cache-key", he = "gm-level-key", pe = "parent-key", ge = "children-state",
                fe = "gm-focus-td", me = "gm_row_class_name", ve = "GridManagerMemory", be = "GridManagerVersion",
                ye = "grid-manager-cache-error", xe = "gm_fold", we = "gm_order", ke = "gm_moverow", Ce = "gm_checkbox",
                $e = "no-select-text", Te = "empty-data", Se = "gm-load-area", De = "last-visible", je = "cell-hidden",
                Ae = "gm-create", Me = ["class", "style"], Oe = "checked", _e = "indeterminate", Pe = "unchecked",
                Re = "gm-checkbox-checked", Ee = "gm-checkbox-indeterminate", He = "disabled", ze = "gm-remind-action",
                Le = "gm-sorting-action", Ne = "gm-row-hide", qe = "px",
                Ke = e => [`background:${e};height:18px;line-height:18px;padding:1px;border-radius:3px 0 0 3px;color:#fff`, "background:#169fe6;height:18px;line-height:18px;padding:1px;border-radius:0 3px 3px 0;color:#fff"],
                Be = "Info", Fe = "Warn", Ie = "Error", Ge = {[Be]: Ke("#333"), [Fe]: Ke("#f90"), [Ie]: Ke("#f00")},
                We = {[Z]: {}, [te]: {}, [ee]: {}, [re]: {}, [ae]: {}, [ie]: {}, allTh: {}, allFakeTh: {}},
                Je = (e, t, o) => {
                    const n = We[t];
                    return n[e] || (n[e] = Q(o || `[${t}="${e}"]`)), n[e]
                }, Ve = e => {
                    for (let t in We) delete We[t][e]
                }, Ue = "filter-selected", Ye = "fa-con", Xe = "click", Qe = "mousedown", Ze = "mousemove", et = "mouseup",
                tt = "mouseleave", ot = "scroll", nt = "events", st = "target", rt = "selector",
                at = (e, t, o) => ({[nt]: e, [st]: t, [rt]: o}), it = (e, t, o) => {
                    let n = S(!0, {}, t);
                    for (let t in e) e[t].isAutoCreate && delete n[t];
                    return delete n.gm_checkbox_disabled, delete n[ue], delete n[le], delete n[he], delete n[me], o && o.forEach((e => delete n[e])), n
                }, ct = (e, t) => {
                    const o = gt(e), n = o.find(".gm-load-area");
                    n.length > 0 && n.remove();
                    const s = Q(t);
                    s.addClass(Se), o.append(s)
                }, lt = (e, t) => {
                    setTimeout((() => {
                        Q(".gm-load-area", gt(e)).remove()
                    }), t || 0)
                }, dt = e => m(e) ? e : e.getAttribute(Z), ut = e => `[grid-manager="${e}"]`, ht = e => Je(e, Z),
                pt = e => Je(e, te), gt = e => Je(e, ee), ft = e => Je(e, re), mt = e => Je(e, ae), vt = e => Je(e, ie),
                bt = (e, t) => (t.jTool && (t = Ct(t)), Q(`[${re}="${e}"] th[th-name="${t}"]`)),
                yt = (e, t) => Q(`[grid-manager-mock-thead="${e}"] th[th-name="${t}"]`),
                xt = e => Je(e, "allTh", `[${re}="${e}"] th`), wt = e => Q(`[${re}="${e}"] th:not(cell-hidden)`),
                kt = (e, t) => Q(`[grid-manager-mock-thead="${e}"] th:not([cell-hidden])${t ? ":not([gm-create])" : ""}`),
                Ct = e => e.attr(ce), $t = e => Q(`[empty-template="${e}"]`),
                Tt = (e, t) => m(t) ? Q(`tbody tr td:nth-child(${e.index() + 1})`, ht(t)) : Q(`td:nth-child(${e.index() + 1})`, t),
                St = (e, t, o) => {
                    u(k(t) ? t : [t], (t => {
                        const n = bt(e, t), s = yt(e, t), r = Tt(n, e), a = o ? "removeAttr" : "attr";
                        n[a](je, ""), s[a](je, ""), r[a](je, "");
                        const i = Q(`[${oe}="${e}"] li[th-name="${t}"]`);
                        o ? i.addClass("checked-li") : i.removeClass("checked-li"), Q('input[type="checkbox"]', i).prop("checked", o), (e => {
                            const t = $t(e);
                            if (0 === t.length) return;
                            const o = wt(e).length;
                            Q("td", t).attr("colspan", o)
                        })(e)
                    }))
                }, Dt = e => {
                    const t = kt(e), o = t.length - 1, n = t.eq(o);
                    Q(`${ut(e)} [last-visible]`).removeAttr(De), n.attr(De, ""), wt(e).eq(o).attr(De, ""), Tt(n, e).attr(De, "")
                }, jt = (e, t) => {
                    const {_: o, columnMap: n, isIconFollowText: s, __isNested: r} = e;
                    let a = pt(o).width(), i = 0;
                    const c = [], l = [];
                    let d;
                    u(n, ((e, n) => {
                        let {__width: u, width: h, isShow: p, pk: g, children: f} = n;
                        if (p && !g) if (n.disableCustomize) a -= h; else {
                            if (h && "auto" !== h && r && C(f)) {
                                const e = n.colspan;
                                n.width = h = parseInt(h / e, 10) * e
                            }
                            if (t && (!h || "auto" === h) || !t && (!u || "auto" === u)) return n.width = At(o, n, s, r), i += n.width, void (r && C(f) ? l.push(n) : c.push(n));
                            t && (i += h), t || (n.width = u, i += u), (!d || d.index > n.index) && (d = n)
                        }
                    }));
                    const h = c.length, p = l.length;
                    let g = a - i;
                    if (g > 0 && p) {
                        let e = Math.floor(g / (p + h));
                        u(l, (t => {
                            const o = t.colspan;
                            e = parseInt(parseInt(e, 10) / o, 10) * o, t.width = t.width + e, g -= e
                        }))
                    }
                    if (d && g > 0 && !h && (d.width = d.width + g), g > 0 && h) {
                        const e = Math.floor(g / h);
                        u(c, ((t, o) => {
                            o !== h - 1 ? (t.width = t.width + e, g -= e) : t.width = t.width + g
                        }))
                    }
                    u(n, ((e, t) => {
                        t.isShow && t.disableCustomize || t.pk || bt(o, e).width(t.width)
                    }))
                }, At = (e, t, o, n) => {
                    const s = (e, t, o) => {
                        const n = Q(".th-wrap", t), s = Q(".th-text", t), r = Mt(e, s.html(), {
                            fontSize: s.css("font-size"),
                            fontWeight: s.css("font-weight"),
                            fontFamily: s.css("font-family")
                        }), a = n.css("padding-left"), i = n.css("padding-right");
                        let c = 0;
                        if (o) {
                            const e = Q(`.${ze}`, t);
                            e.length && (c += e.width());
                            const o = Q(`.${Le}`, t);
                            o.length && (c += o.width());
                            const n = Q(".gm-filter-area", t);
                            n.length && (c += n.width())
                        }
                        return Math.ceil(r + c + (a || 0) + (i || 0) + 2 + 1)
                    };
                    if (!n || !C(t.children)) return s(e, yt(e, t.key), o);
                    let r = 0, a = 0;
                    const i = t => {
                        t.children.forEach((n => {
                            C(n.children) ? i(n) : (a++, r += s(e, yt(e, t.key), o))
                        }))
                    };
                    return i(t), parseInt(r / a, 10) * a
                }, Mt = (e, t, o) => {
                    const n = Q(`[${ee}="${e}"] .text-dreamland`);
                    return n.html(t), n.css(o), n.width()
                }, Ot = (e, t) => {
                    const {_: o, columnMap: n} = e, s = pt(o);
                    if (!s.length) return;
                    const r = mt(o);
                    if (r.css("left", -s.scrollLeft() + qe), !t) {
                        let e;
                        for (let t in n) e = n[t].width, yt(o, t).css({width: e, "max-width": e});
                        r.width(ft(o).width())
                    }
                }, _t = e => {
                    const t = pt(e);
                    t.attr("gm-overflow-x", ft(e).width() > t.width())
                }, Pt = e => {
                    const {_: t, width: o, height: n, minHeight: s, maxHeight: r, supportAjaxPage: a} = e, i = gt(t).get(0),
                        c = ft(t).height(), l = c + 1;
                    i.style.width = `calc(${o})`, i.style.height = `calc(${n})`, m(s) && (i.style.minHeight = `calc(${s})`), m(r) && (i.style.maxHeight = `calc(${r})`), i.style.paddingTop = l + qe, pt(t).get(0).style.height = a ? `calc(100% - ${Q(`[${ne}="${t}"]`).height() + qe})` : "100%", Q(".table-header", i).height(l), ht(t).css("margin-top", -c)
                }, Rt = e => {
                    for (let t in e) {
                        const o = e[t], n = Q(o.target);
                        n.length && n.off(o.events, o.selector)
                    }
                }, Et = (e, t) => {
                    pt(e).get(0).style.setProperty("--gm-line-height", t)
                }, Ht = (e, t) => {
                    console.log(`%c GridManager ${t} %c ${e} `, ...Ge[t])
                }, zt = e => {
                    Ht(e, Be)
                }, Lt = e => {
                    Ht(e, Fe)
                }, Nt = e => {
                    Ht(e, Ie)
                }, qt = (e, t, o) => {
                    const n = Object.keys(e), s = Object.keys(t);
                    return m(o) ? e[o] === t[o] : n.length === s.length && n.every((o => JSON.stringify(e[o]) === JSON.stringify(t[o])))
                }, Kt = e => JSON.parse(JSON.stringify(e)), Bt = {}, Ft = {supportDrag: !0, dragBefore: c, dragAfter: c},
                It = {supportMoveRow: !1, moveRowConfig: {handler: c}},
                Gt = {supportAdjust: !0, adjustBefore: c, adjustAfter: c}, Wt = {supportMenu: !0, menuHandler: e => e},
                Jt = {supportConfig: !0, configInfo: "配置列的显示状态"}, Vt = {
                    width: "100%",
                    height: "300px",
                    lineHeight: "41px",
                    animateTime: 300,
                    disableLine: !1,
                    disableBorder: !1,
                    loadingTemplate: '<section class="gm-loading"><div class="loader"><svg class="circular" viewBox="25 25 50 50"><circle class="path" cx="50" cy="50" r="20" fill="none"></circle></svg></div></section>',
                    skinClassName: "",
                    useWordBreak: !1,
                    isIconFollowText: !1
                }, Ut = {rowHover: null, rowClick: null, cellHover: null, cellClick: null}, Yt = {disableCache: !0}, Xt = {
                    isCombSorting: !1,
                    mergeSort: !1,
                    sortKey: "sort_",
                    sortData: {},
                    sortUpText: "ASC",
                    sortDownText: "DESC",
                    sortMode: "overall",
                    sortingBefore: c,
                    sortingAfter: c
                }, Qt = {
                    supportAjaxPage: !1,
                    useNoTotalsMode: !1,
                    sizeData: [10, 20, 30, 50, 100],
                    pageSize: 20,
                    pageData: {},
                    totalsKey: "totals",
                    currentPageKey: "cPage",
                    pageSizeKey: "pSize",
                    pagingBefore: c,
                    pagingAfter: c
                }, Zt = {supportAutoOrder: !0, autoOrderConfig: {width: 50}}, eo = {
                    supportCheckbox: !0,
                    checkboxConfig: {width: 40},
                    checkedBefore: c,
                    checkedAfter: c,
                    checkedAllBefore: c,
                    checkedAllAfter: c
                }, to = {i18n: "zh-cn"}, oo = {supportTreeData: !1, treeConfig: {treeKey: "children", openState: !1}},
                no = {
                    firstLoading: !0,
                    virtualScroll: {useVirtualScroll: !1, virtualNum: 20},
                    ajaxType: "GET",
                    query: {},
                    ajaxHeaders: {},
                    ajaxXhrFields: {},
                    ajaxBeforeSend: c,
                    ajaxSuccess: c,
                    ajaxComplete: c,
                    ajaxError: c,
                    requestHandler: e => e,
                    responseHandler: e => e,
                    rowRenderHandler: (e, t) => e,
                    dataKey: "data",
                    emptyTemplate: () => '<div class="gm-empty-template">暂无数据</div>'
                }, so = {supportExport: !0, exportConfig: {mode: "static", suffix: "xls", handler: c}},
                ro = {supportPrint: !0};

            function ao() {
                S(!0, this, Object.assign(Object.assign(Object.assign(Object.assign(Object.assign(Object.assign(Object.assign(Object.assign(Object.assign(Object.assign(Object.assign(Object.assign(Object.assign(Object.assign(Object.assign(Object.assign(Object.assign(Object.assign({rendered: !1}, Bt), Ft), It), Gt), Wt), Jt), Vt), Yt), Xt), Qt), Zt), eo), to), no), so), ro), oo), Ut))
            }

            function io() {
                const e = this;
                e["order-text"] = {"zh-cn": "序号", "zh-tw": "序號", "en-us": "order"}, e["first-page"] = {
                    "zh-cn": "首页",
                    "zh-tw": "首頁",
                    "en-us": "first"
                }, e["previous-page"] = {
                    "zh-cn": "上一页",
                    "zh-tw": "上一頁",
                    "en-us": "previous"
                }, e["next-page"] = {"zh-cn": "下一页", "zh-tw": "下一頁", "en-us": "next"}, e["last-page"] = {
                    "zh-cn": "尾页",
                    "zh-tw": "尾頁",
                    "en-us": "last"
                }, e["page-info"] = {
                    "zh-cn": '此页显示 {0}-{1}<span class="page-info-totals"> 共{2}条</span>',
                    "zh-tw": '此頁顯示 {0}-{1}<span class="page-info-totals"> 共{2}條</span>',
                    "en-us": 'this page show {0}-{1}<span class="page-info-totals"> count {2}</span>'
                }, e["checked-info"] = {
                    "zh-cn": "已选 {0} 条",
                    "zh-tw": "已選 {0} 條",
                    "en-us": "selected {0}"
                }, e["goto-first-text"] = {
                    "zh-cn": "跳转至",
                    "zh-tw": "跳轉至",
                    "en-us": "goto"
                }, e["goto-last-text"] = {"zh-cn": "页", "zh-tw": "頁", "en-us": "page"}, e.refresh = {
                    "zh-cn": "重新加载",
                    "zh-tw": "重新加載",
                    "en-us": "Refresh"
                }, e.export = {
                    "zh-cn": "导出",
                    "zh-tw": "導出",
                    "en-us": "Export"
                }, e["export-checked"] = {
                    "zh-cn": "导出选中项",
                    "zh-tw": "導出選中項",
                    "en-us": "Export selected"
                }, e.config = {"zh-cn": "配置表", "zh-tw": "配置表", "en-us": "Setting Grid"}, e.print = {
                    "zh-cn": "打印",
                    "zh-tw": "打印",
                    "en-us": "Print"
                }, e.copy = {"zh-cn": "复制", "zh-tw": "復制", "en-us": "Copy"}, e["hide-row"] = {
                    "zh-cn": "隐藏行",
                    "zh-tw": "隱藏行",
                    "en-us": "Hidden Row"
                }, e.ok = {"zh-cn": "确定", "zh-tw": "確定", "en-us": "OK"}, e.reset = {
                    "zh-cn": "重置",
                    "zh-tw": "重置",
                    "en-us": "Reset"
                }
            }

            const co = {version: "2.18.2", responseData: {}, checkedData: {}, settings: {}},
                lo = ["width", "__width", "isShow", "__isShow", "index", "__index"],
                uo = ["__width", "__isShow", "__index"], ho = e => localStorage.getItem(e), po = (e, t) => {
                    localStorage.setItem(e, t)
                }, go = {}, fo = {}, mo = (e, t, o) => {
                    const n = Do(e), s = e => {
                        let t = e[de];
                        return o ? t : it(n.columnMap, t)
                    };
                    if ($(t)) return s(t);
                    if (T(t)) {
                        let e = [];
                        return u(t, (t => {
                            e.push(s(t))
                        })), e
                    }
                    return {}
                }, vo = (e, t) => {
                    const o = co.responseData[e] || [];
                    return t ? o : Kt(o)
                }, bo = (e, t) => {
                    co.responseData[e] = t
                }, yo = e => (co.checkedData[e] || []).map((e => S(!0, {}, e))), xo = (e, t, o) => {
                    const {columnMap: n, checkboxConfig: s} = Do(e);
                    if (o) return void (co.checkedData[e] = t.map((e => it(n, e))));
                    co.checkedData[e] || (co.checkedData[e] = []);
                    const r = co.checkedData[e], a = s.key, i = r.length > 0, c = [];
                    t.forEach((e => {
                        const t = it(n, e), o = e.gm_checkbox;
                        let s = -1;
                        i && (s = ((e, t, o) => {
                            let n = -1, s = !1;
                            return e.some(((e, r) => (s = qt(e, t, o), s && (n = r), s))), n
                        })(r, t, a)), o && -1 === s ? c.push(t) : o || -1 === s || r.splice(s, 1)
                    })), co.checkedData[e] = r.concat(c)
                }, wo = e => location.pathname + location.hash + "-" + e, ko = e => {
                    let t = ho(ve);
                    return t && "{}" !== t ? (t = JSON.parse(t), JSON.parse(t[wo(e)] || "{}")) : (ht(e).attr(ye, "error"), {})
                }, Co = e => {
                    const {disableCache: t, _: o, columnMap: n, supportAjaxPage: s, pageData: r, pageSizeKey: a} = e;
                    if (t) return;
                    const i = {};
                    u(n, ((e, t) => {
                        const o = {};
                        lo.forEach((e => {
                            o[e] = t[e]
                        })), i[e] = o
                    }));
                    const c = {column: i};
                    s && (c[a] = r[a]);
                    const l = JSON.stringify(c), d = JSON.parse(ho(ve) || "{}");
                    d[wo(o)] = l, po(ve, JSON.stringify(d))
                }, $o = e => {
                    if (!e) return t = ve, localStorage.removeItem(t), zt("delete user memory of all"), !0;
                    var t;
                    let o = ho(ve);
                    return !!o && (o = JSON.parse(o), delete o[wo(e)], po(ve, JSON.stringify(o)), zt(`delete user memory of ${e}`), !0)
                }, To = e => {
                    const {columnData: t, emptyTemplate: o} = e;
                    o && !v(o) && (e.emptyTemplate = () => o);
                    const n = e => {
                        e.forEach((e => {
                            const t = e.text;
                            if (t && !v(t) && (e.text = () => t), C(e.children)) return n(e.children), void delete e.template;
                            const o = e.template;
                            o && !v(o) && (e.template = () => o)
                        }))
                    };
                    return n(t), e
                }, So = (e, t, o, n, s) => {
                    m(e.columnData[0]) && (e.columnData = e.columnData.map((e => ({key: e, text: e})))), e = To(e);
                    let r = new ao;
                    r.textConfig = new io, S(!0, r, e), r._ = r.gridManagerName, r.browser = (() => {
                        try {
                            return navigator.userAgent.toLowerCase().match(/(msie|firefox|chrome|opera|version).*?([\d.]+)/)[1].replace(/version/, "safari")
                        } catch (e) {
                            return "-"
                        }
                    })();
                    const {
                        _: a,
                        columnData: i,
                        supportMoveRow: c,
                        moveRowConfig: l,
                        supportAutoOrder: d,
                        __isNested: h,
                        __isFullColumn: p,
                        fullColumn: f,
                        supportCheckbox: v,
                        checkboxConfig: y
                    } = r, w = [];
                    c && l.useSingleMode && w.push(t(l)), v && w.push(o(y)), d && w.push(n(r)), p && f.useFold && w.push(s(r));
                    const k = {};
                    let $ = !1;
                    const T = !h && i.length > 1, D = (e, t, o) => {
                        e.forEach(((e, n) => {
                            const s = (e = S(!0, {}, e)).key;
                            return s ? (e.width && !b(e.width) && (e.width = parseInt(e.width, 10)), e.remind && (r._remind = !0), m(e.sorting) && (r._sort = !0), x(e.filter) && (r._filter = !0), T && m(e.fixed) ? (r._fixed = !0, e.disableCustomize = !0) : delete e.fixed, e.disableCustomize && !e.width ? (Nt(`column ${s}: width must be set`), void ($ = !0)) : (k[s] = e, k[s].isShow = e.isShow || g(e.isShow), k[s].index = n, k[s].__index = n, k[s].__width = e.width, k[s].__isShow = e.isShow, void (h && (C(e.children) && D(e.children, t + 1, e.key), k[s].pk = o, k[s].level = t)))) : (Nt(`columnData[${n}].key undefined`), void ($ = !0))
                        }))
                    };
                    if (D(w.concat(i), 0), $) return !1;
                    r.columnMap = k;
                    return (() => {
                        if (r.disableCache) return;
                        const e = r.columnMap, t = ko(a).column || {}, o = Object.keys(t), n = Object.keys(e);
                        if (0 === o.length) return;
                        let s = !0;
                        o.length !== n.length && (s = !1), s && u(e, ((e, o) => {
                            if (!t[e] || uo.some((n => {
                                const s = t[e][n], r = o[n];
                                return x(s) ? JSON.stringify(s) !== JSON.stringify(r) : s !== r
                            }))) return s = !1, !1
                        })), s ? S(!0, e, t) : $o(a)
                    })(), jo(r), r
                }, Do = e => S(!0, {}, co.settings[e] || {}), jo = e => {
                    co.settings[e._] = S(!0, {}, e)
                }, Ao = (e, t) => {
                    const o = Do(e), n = o.columnMap;
                    return u(n, ((o, n) => {
                        if (n.disableCustomize) return;
                        let s = ((e, o) => t ? yt(e, o) : bt(e, o))(e, n.key);
                        n.width = s.width(), n.index = s.index(), n.isShow = !m(s.attr(je))
                    })), jo(o), Co(o), o
                }, Mo = "data-compile-node", Oo = {}, _o = e => (Oo[e] || (Oo[e] = []), Oo[e]), Po = e => {
                    Oo[e] = []
                }, Ro = (e, t, o, n, s) => {
                    const {_: r, compileAngularjs: a, compileVue: i, compileReact: c} = e, l = _o(r);
                    let d = "", u = "";
                    return t ? (c && (u = Mo, l.push({
                        template: t,
                        row: o,
                        index: n,
                        key: s,
                        type: g(n) ? void 0 : "template",
                        fnArg: [o[s], o, n, s]
                    })), (i || a) && (u = Mo, l.push({
                        row: o,
                        index: n,
                        key: s
                    })), c || (d = t(o[s], o, n, s))) : (d = o[s], (f(d) || g(d)) && (d = "")), {text: d, compileAttr: u}
                };

            async function Eo(e) {
                const {_: t, compileAngularjs: o, compileVue: n, compileReact: s} = e, a = _o(t);
                if (0 === a.length) return Promise.resolve();
                let i = r.querySelectorAll(`${ut(t)} [${Mo}]`);
                a.forEach(((e, t) => {
                    e.el || (e.el = i[t])
                })), n && (await n(a), i = r.querySelectorAll(`${ut(t)} [${Mo}]`)), o && await o(a), s && await s(a), [].forEach.call(i, (e => {
                    e.removeAttribute(Mo)
                })), Po(t)
            }

            const Ho = e => (t, o, n) => {
                const s = n.value;
                n.value = o => {
                    const n = s.call(t, o);
                    return (o && o.tpl || e).replace(/\{\{([^(\}\})]+)\}\}/g, ((e, t) => new Function("vm", "return " + t)(n) || ""))
                }
            }, zo = {}, Lo = (e, t) => e.textConfig[t][e.i18n];

            function No(e, t, o, n, s) {
                let r = [];
                const a = arguments.length;
                if (3 === a && k(arguments[2])) r = arguments[2]; else if (a > 2) for (let e = 2; e < a; e++) r.push(arguments[e]);
                try {
                    let o = Lo(e, t);
                    return r && r.length ? o.replace(/{\d+}/g, (e => {
                        const t = r[e.match(/\d+/)];
                        return g(t) ? "" : t
                    })) : o
                } catch (e) {
                    return Lt(`not find language matched to ${t}`), ""
                }
            }

            const qo = (e, t) => {
                const o = r.createElement("a");
                o.addEventListener("click", (() => {
                    o.download = e, o.href = t
                }));
                const n = r.createEvent("MouseEvents");
                n.initEvent("click", !1, !1), o.dispatchEvent(n)
            };
            const Ko = new class {
                async exportGrid(e, t, o) {
                    const n = Do(e), {
                        query: s,
                        disableAutoLoading: r,
                        loadingTemplate: a,
                        exportConfig: i,
                        pageData: c,
                        sortData: l
                    } = n;
                    t = ((e, t, o, n) => {
                        if (!t) {
                            const e = n.fileName;
                            t = v(e) ? e(o) : e
                        }
                        return t || (t = e), `${t}.${n.suffix}`
                    })(e, t, s, i);
                    const d = o ? yo(e) : [], u = vo(e), h = i.handler;
                    switch (i.mode) {
                        case"static":
                            this.downStatic(e, r, a, t, o, i.suffix, h, s, c, l, d, u);
                            break;
                        case"blob":
                            await this.downBlob(e, r, a, t, h, s, c, l, d, u);
                            break;
                        case"url":
                            await this.downFilePath(e, r, a, t, h, c, l, d)
                    }
                }

                downStatic(e, t, o, n, s, r, a, i, c, l, d, h) {
                    !t && ct(e, o);
                    let p = a(n, i, c, l, d, h);
                    if (!k(p)) {
                        const t = kt(e, !0), o = vt(e);
                        let n;
                        n = Q(s ? 'tr[checked="true"]' : "tr", o), p = [];
                        const r = [];
                        u(t, (e => {
                            r.push(`"${e.querySelector(".th-text").textContent || ""}"`)
                        })), p.push(r), u(n, (e => {
                            let t = [];
                            const o = Q("td:not([gm-create]):not([cell-hidden])", e);
                            u(o, (e => {
                                t.push(`"${e.textContent || ""}"`)
                            })), p.push(t)
                        }))
                    }
                    let g = "";
                    u(p, ((e, t) => {
                        0 !== t && (g += "\r\n"), g += e.join(",")
                    }));
                    qo(n, `data:${{
                        csv: "text/csv",
                        xls: "application/vnd.ms-excel"
                    }[r]};charset=utf-8,\ufeff${encodeURIComponent(g)}`), !t && lt(e, 300)
                }

                async downFilePath(e, t, o, n, s, r, a, i) {
                    try {
                        !t && ct(e, o);
                        const c = await s(n, r, a, i);
                        qo(n, c)
                    } catch (e) {
                        Nt(e)
                    } finally {
                        !t && lt(e, 300)
                    }
                }

                async downBlob(e, t, o, n, s, r, a, i, c, l) {
                    try {
                        !t && ct(e, o);
                        const d = await s(n, r, a, i, c, l), u = Blob.prototype;
                        let h;
                        if (Object.getPrototypeOf(d) === u && (h = d), d.data && Object.getPrototypeOf(d.data) === u && (h = d.data), !h || Object.getPrototypeOf(h) !== u) return void Nt("response type not equal to Blob");
                        qo(n, URL.createObjectURL(h))
                    } catch (e) {
                        Nt(e)
                    } finally {
                        !t && lt(e, 300)
                    }
                }
            }, Bo = "rowspan", Fo = "merge-td", Io = "last-rowspan", Go = (e, t) => {
                u(t, ((t, o) => {
                    let n = o.merge;
                    if (!n || "text" !== n && "html" !== n) return !0;
                    const s = Tt(bt(e, t), vt(e).find("tr:not([gm-summary-row]):not([gm-row-hide])"));
                    let r = s.length, a = r, i = 1;
                    for (; a;) {
                        const e = s.eq(a - 1);
                        if (e.removeAttr(Bo), e.removeAttr(Fo), e.removeAttr(Io), a--, 0 === a) return void (i > 1 && (e.attr(Bo, i), i = 1));
                        s.eq(a - 1)[n]() === e[n]() ? (e.attr(Fo, ""), i++) : i > 1 && (e.attr(Bo, i), a + i === r && e.attr(Io, ""), i = 1)
                    }
                }))
            }, Wo = e => Q(`[gm-cache-key="${e}"], [${pe}="${e}"], [${pe}^="${e}-"]`), Jo = (e, t) => {
                const o = Wo(t);
                o.attr(Ne, "ing"), setTimeout((() => {
                    o.attr(Ne, "true"), Go(e._, e.columnMap)
                }), 500)
            };

            function Vo(e) {
                const t = ht(e).clone(!0), o = open();
                t.find("[cell-hidden]").remove(), t.find("[merge-td]").remove(), t.find("[gm-create]").remove();
                const n = t.find("[grid-manager-mock-thead] th"), s = t.find(`[${re}] th`);
                s.removeAttr("style"), u(s, ((e, t) => {
                    e.innerHTML = n.eq(t).find(".th-text").html()
                })), t.removeAttr("style"), t.find("[grid-manager-mock-thead]").remove(), o.document.write("<style>\ntable{width: 100%;border-collapse: collapse;border-spacing: 0;}\nth,td{height: 18px;padding:11px;border: 1px solid #999;font-size: 12px;color: #666;}\nth{color: #333}\na{color: #666; text-decoration:none;}\ntr[empty-template] td{text-align: center}\n</style>" + t.get(0).outerHTML), o.document.close(), o.print(), o.close()
            }

            const Uo = e => `[grid-master="${e}"]`, Yo = e => {
                const {closeMenu: t} = zo[e];
                Q(t.target).off(t.events), Q(Uo(e)).remove()
            }, Xo = (e, t) => {
                const o = Do(e), {
                    supportAjaxPage: n,
                    supportExport: s,
                    supportConfig: a,
                    supportPrint: i,
                    menuHandler: c,
                    useCellFocus: l,
                    useHideRow: d
                } = o;
                let u = [];
                n && u.push((e => ({
                    content: `${No(e, "previous-page")}<i class="gm-icon gm-icon-up"></i>`,
                    onClick: e => {
                        const t = Do(e), {currentPageKey: o, pageData: n} = t, s = n[o];
                        ws(t, s > 1 ? s - 1 : s)
                    },
                    run: (e, t) => {
                        const o = Do(e), {pageData: n, currentPageKey: s} = o, r = n[s], a = n.tPage;
                        1 === r || 0 === a ? t.addClass(He) : t.removeClass(He)
                    }
                }))(o), (e => ({
                    content: `${No(e, "next-page")}<i class="gm-icon gm-icon-down"></i>`,
                    line: !0,
                    onClick: e => {
                        const t = Do(e), {currentPageKey: o, pageData: n} = t, s = n[o];
                        ws(t, s < n.tPage ? s + 1 : s)
                    },
                    run: (e, t) => {
                        const o = Do(e), {pageData: n, currentPageKey: s} = o, r = n[s], a = n.tPage;
                        r === a || 0 === a ? t.addClass(He) : t.removeClass(He)
                    }
                }))(o)), s && u.push((e => ({
                    content: `${No(e, "export")}<i class="gm-icon gm-icon-export"></i>`,
                    onClick: e => {
                        Ko.exportGrid(e, void 0, !1)
                    }
                }))(o), (e => ({
                    content: `${No(e, "export-checked")}<i class="gm-icon gm-icon-export-checked"></i>`,
                    onClick: e => {
                        Ko.exportGrid(e, void 0, !0)
                    },
                    run: (e, t) => {
                        0 === Q('tr[checked="true"]', vt(e)).length ? t.addClass(He) : t.removeClass(He)
                    }
                }))(o)), u.push((e => ({
                    content: `${No(e, "refresh")}<i class="gm-icon gm-icon-refresh"></i>`,
                    onClick: e => {
                        const t = Do(e), {currentPageKey: o, pageData: n} = t;
                        ws(t, n[o])
                    }
                }))(o)), l && u.push((e => ({
                    content: `${No(e, "copy")}<i class="gm-icon gm-icon-copy"></i><input gm-fake-copy="${e._}"/>`,
                    onClick: e => {
                        const t = r.querySelector(`[gm-fake-copy=${e}]`);
                        t.value = vt(e).find("td[gm-focus-td]").text(), t.select(), r.execCommand("Copy")
                    }
                }))(o)), i && u.push((e => ({
                    content: `${No(e, "print")}<i class="gm-icon gm-icon-print"></i>`,
                    onClick: e => {
                        Vo(e)
                    }
                }))(o)), d && u.push((e => ({
                    content: `${No(e, "hide-row")}<i class="gm-icon gm-icon-hide"></i>`,
                    onClick: (e, t) => {
                        const o = Q(t).closest("tr");
                        Jo(Do(e), o.attr(ue) || o.attr(pe))
                    }
                }))(o)), a && u.push((e => ({
                    content: `${No(e, "config")}<i class="gm-icon gm-icon-config"></i>`,
                    onClick: e => {
                        Us.toggle(e)
                    }
                }))(o)), u = c(u);
                let h = "";
                const p = u.length;
                u.forEach(((e, t) => {
                    h += `<span menu-action>${e.content}</span>`, e.line && t !== p - 1 && (h += '<span class="menu-line"></span>')
                })), Q("[grid-master]").remove(), Q("body").append(`<div class="gm-menu" grid-master="${e}">${h}</div>`);
                const g = Q(Uo(e)), f = g.find("[menu-action]");
                return u.forEach(((o, n) => {
                    const {run: s, onClick: r} = o, a = f.eq(n);
                    s && s(e, a), a.bind("click", (function (o) {
                        if (((e, t) => {
                            if (Q(e).hasClass(He)) return t.stopPropagation(), t.preventDefault(), !0
                        })(this, o)) return !1;
                        r(e, t), Yo(e)
                    }))
                })), g
            };
            var Qo = o(923), Zo = o.n(Qo);
            const en = {};
            var tn = function (e, t, o, n) {
                var s, r = arguments.length, a = r < 3 ? t : null === n ? n = Object.getOwnPropertyDescriptor(t, o) : n;
                if ("object" == typeof Reflect && "function" == typeof Reflect.decorate) a = Reflect.decorate(e, t, o, n); else for (var i = e.length - 1; i >= 0; i--) (s = e[i]) && (a = (r < 3 ? s(a) : r > 3 ? s(t, o, a) : s(t, o)) || a);
                return r > 3 && a && Object.defineProperty(t, o, a), a
            };
            const on = e => {
                const t = pt(e).find(".gm-tooltip");
                t.length && t.remove()
            }, nn = (e, t, o, n) => {
                if (!x(o)) return;
                const {text: s, position: r} = o;
                let a = "right" === r ? " right-model" : "";
                const i = pt(e), c = Q(t), l = ht(e), d = c.offset().top - l.offset().top - i.scrollTop() - 30;
                let u = "";
                "TD" === t.nodeName && (a = "", u = `left:${c.offset().left - l.offset().left - i.scrollLeft() + qe};`), on(e);
                const h = `<span class="ra-area gm-tooltip${a}" style="height:30px;top:${d + qe};${u}">${s}</span>`;
                i.append(h), c.bind(tt, (() => {
                    c.unbind(tt), on(e), v(n) && n()
                }))
            };

            class sn {
                init(e) {
                    en[e] = ((e, t) => ({
                        start: at("mouseover", t, `[grid-manager-mock-thead="${e}"] .${ze}`),
                        tooltipLeave: at(tt, t, `[grid-manager-mock-thead="${e}"] .${ze}`)
                    }))(e, `${ut(e)} [grid-manager-mock-thead]`);
                    const {start: t} = en[e], o = pt(e);
                    Q(t.target).on(t.events, t.selector, (function () {
                        const e = Q(this), t = e.find(".ra-area");
                        o.get(0).offsetWidth - (e.offset().left - o.offset().left) > t.get(0).offsetWidth + 20 ? t.removeClass("right-model") : t.addClass("right-model")
                    }))
                }

                createHtml(e) {
                    const {remind: t} = e;
                    let o = "", n = "";
                    n = x(t) ? t.text : t;
                    const s = t.style;
                    return x(s) && (o = 'style="', Object.keys(s).forEach((e => {
                        o = `${o}${e}:${s[e]};`
                    })), o += '"'), {text: n, style: o}
                }

                destroy(e) {
                    Rt(en[e]), on(e)
                }
            }

            tn([Ho(Zo())], sn.prototype, "createHtml", null);
            const rn = new sn, an = "gm-drag-ongoing", cn = (e, t, o, n) => {
                u(o, (o => {
                    const s = e[o.key], {level: r} = s;
                    t[r] || (t[r] = []), C(s.children) ? (s.rowspan = 1, s.colspan = (e => {
                        let t = 0;
                        const o = e => {
                            e.children.forEach((e => {
                                C(e.children) ? o(e) : t++
                            }))
                        };
                        return o(e), t
                    })(s), cn(e, t, s.children, n - 1)) : (s.rowspan = n, s.colspan = 1), r > 0 && t[r].push(s)
                }))
            };
            const ln = new class {
                addSign(e) {
                    pt(e).attr("gm-nested", "")
                }

                push(e, t) {
                    let o = 0;
                    const n = t[0];
                    u(e, ((e, t) => {
                        const {level: s, index: r} = t;
                        0 === s && (n[r] = t), o < s && (o = s)
                    })), cn(e, t, n, o + 1)
                }
            };
            var dn = o(985), un = o.n(dn), hn = o(397), pn = o.n(hn), gn = o(125), fn = o.n(gn),
                mn = function (e, t, o, n) {
                    var s, r = arguments.length,
                        a = r < 3 ? t : null === n ? n = Object.getOwnPropertyDescriptor(t, o) : n;
                    if ("object" == typeof Reflect && "function" == typeof Reflect.decorate) a = Reflect.decorate(e, t, o, n); else for (var i = e.length - 1; i >= 0; i--) (s = e[i]) && (a = (r < 3 ? s(a) : r > 3 ? s(t, o, a) : s(t, o)) || a);
                    return r > 3 && a && Object.defineProperty(t, o, a), a
                };

            class vn {
                getWrapTpl(e) {
                    const t = e.settings, {
                        _: o,
                        skinClassName: n,
                        isIconFollowText: s,
                        disableBorder: r,
                        disableLine: a,
                        supportConfig: i,
                        supportAjaxPage: c,
                        configInfo: l,
                        ajaxPageTemplate: d
                    } = t, u = ["table-wrap"];
                    return n && m(n) && n.trim() && u.push(n), s && u.push("gm-icon-follow-text"), r && u.push("disable-border"), a && u.push("disable-line"), {
                        wrapKey: `${ee}="${o}"`,
                        divKey: `${te}="${o}"`,
                        classNames: u.join(" "),
                        configTpl: i ? Us.createHtml({_: o, configInfo: l}) : "",
                        ajaxPageTpl: c ? Cs.createHtml({settings: t, tpl: d}) : ""
                    }
                }

                getTheadTpl(e) {
                    const t = e.settings, {columnMap: o, __isNested: n} = t, s = [[]], r = s[0];
                    n ? ln.push(o, s) : u(o, ((e, t) => {
                        r[t.index] = t
                    }));
                    let a = "";
                    return u(s, (e => {
                        a += "<tr>", u(e, (e => {
                            a += this.getThTpl({settings: t, col: e})
                        })), a += "</tr>"
                    })), {thListTpl: a}
                }

                getThTpl(e) {
                    const {settings: t, col: o} = e, {
                        query: n,
                        supportDrag: s,
                        sortData: r,
                        sortUpText: a,
                        sortDownText: i
                    } = t;
                    let c = "";
                    o.remind && (c = "remind");
                    let l = "";
                    m(o.sorting) && (o.sorting === i ? (l = `sorting="${i}"`, r[o.key] = i) : o.sorting === a ? (l = `sorting="${a}"`, r[o.key] = a) : l = "sorting");
                    let d = "";
                    x(o.filter) && (d = "filter", g(o.filter.selected) ? o.filter.selected = n[o.key] : n[o.key] = o.filter.selected);
                    let u = "";
                    "left" !== o.fixed && "right" !== o.fixed || (u = `fixed="${o.fixed}"`);
                    const h = o.align ? `align="${o.align}"` : "", p = o.isShow ? "" : je;
                    let f = "", v = o.key, b = o.text, y = "";
                    switch (o.key) {
                        case we:
                            f = "gm-create gm-order";
                            break;
                        case Ce:
                            f = "gm-create gm-checkbox";
                            break;
                        case xe:
                        case ke:
                            f = Ae;
                            break;
                        default:
                            const e = ((e, t, o) => {
                                const {_: n, compileAngularjs: s, compileVue: r, compileReact: a} = e, i = _o(n);
                                let c = "", l = "";
                                return o && ((s || r || a) && (l = Mo, i.push({
                                    key: t,
                                    template: o,
                                    type: "text"
                                })), a || (c = o())), {text: c, compileAttr: l}
                            })(t, v, o.text);
                            b = e.text, y = e.compileAttr
                    }
                    let w = "th-text";
                    !s || o.isAutoCreate || o.disableCustomize || (w = `${w} gm-drag-action`);
                    const k = g(o.colspan) ? "" : `colspan="${o.colspan}"`,
                        C = g(o.rowspan) ? "" : `rowspan="${o.rowspan}"`;
                    let $ = "auto";
                    return o.width && ($ = o.width + qe), {
                        thAttr: `th-name="${v}" ${k} ${C} style="width:${$}" ${p} ${h} ${l} ${d} ${u} ${c} ${f}`,
                        thTextClassName: w,
                        thText: b,
                        compileAttr: y
                    }
                }
            }

            mn([Ho(un())], vn.prototype, "getWrapTpl", null), mn([Ho(pn())], vn.prototype, "getTheadTpl", null), mn([Ho(fn())], vn.prototype, "getThTpl", null);
            const bn = new vn;
            var yn = o(763), xn = o.n(yn);
            const wn = {}, kn = "gm-move-row-ongoing", Cn = "disable-move";
            var $n = function (e, t, o, n) {
                var s, r = arguments.length, a = r < 3 ? t : null === n ? n = Object.getOwnPropertyDescriptor(t, o) : n;
                if ("object" == typeof Reflect && "function" == typeof Reflect.decorate) a = Reflect.decorate(e, t, o, n); else for (var i = e.length - 1; i >= 0; i--) (s = e[i]) && (a = (r < 3 ? s(a) : r > 3 ? s(t, o, a) : s(t, o)) || a);
                return r > 3 && a && Object.defineProperty(t, o, a), a
            };

            class Tn {
                init(e) {
                    const t = this, {
                        supportCheckbox: o,
                        checkboxConfig: n,
                        moveRowConfig: s,
                        animateTime: r,
                        columnMap: a
                    } = Do(e), {key: i, useSingleMode: c, handler: l} = s, d = Q("body"), u = ht(e).get(0);
                    wn[e] = (e => {
                        const t = "gmLineDrag";
                        return {
                            start: at(`mousedown.${t}`, e, "tr:not([empty-template])"),
                            doing: at(`mousemove.${t}`, "body"),
                            abort: at(`mouseup.${t}`, "body")
                        }
                    })(`${ut(e)} tbody`);
                    const {start: h, doing: p, abort: g} = wn[e], f = vt(e), b = pt(e), y = b.get(0);
                    let x;
                    b.attr("move-row", c ? "single" : "all"), Q(h.target).on(h.events, h.selector, (function (s) {
                        const h = s.target;
                        if (1 !== s.buttons) return;
                        if ("TD" !== h.nodeName) return;
                        if (c && !m(h.getAttribute("gm-moverow"))) return;
                        if (!c && m(h.getAttribute(Cn))) return;
                        const w = this, k = Q(w);
                        let C = Q("tr", f);
                        d.addClass($e);
                        const $ = vo(e);
                        x = [...$];
                        let T = Q(".dreamland-row-div", b);
                        if (T.length) return;
                        b.append('<div class="dreamland-row-div"></div>'), T = Q(".dreamland-row-div", b), (e => {
                            const t = ht(e);
                            Q("[rowspan]", t).removeAttr(Bo), Q("[merge-td]", t).removeAttr(Fo)
                        })(e);
                        const S = "true" === pt(e).attr("gm-overflow-x");
                        T.get(0).innerHTML = t.createHtml({
                            table: u,
                            tr: w,
                            $thList: kt(e),
                            overFlow: S
                        }), k.addClass(kn);
                        let D = 0;
                        const j = Q(p.target), A = p.events;
                        j.off(A), j.on(A, (function (e) {
                            let t, o;
                            D = k.index(), D > 0 && (t = C.eq(D - 1)), D < C.length - 1 && (o = C.eq(D + 1)), T.show().css({
                                width: w.offsetWidth,
                                top: e.clientY - b.offset().top + pageYOffset,
                                left: 0 - y.scrollLeft
                            }), C = ((e, t, o, n, s, r, a, i) => {
                                const c = a.attr(ue);
                                let l;
                                if (s && n.offset().top < s.offset().top && (s.before(a), l = s), r && n.offset().top + n.height() / 2 > r.offset().top && (r.after(a), l = r), l) {
                                    const e = l.attr(ue);
                                    l.attr(ue, c), a.attr(ue, e);
                                    const o = i[c], n = i[e];
                                    if (o[ue] = e, n[ue] = c, m(t)) {
                                        const e = o[t], s = n[t];
                                        o[t] = s, n[t] = e
                                    }
                                    i[c] = n, i[e] = o
                                }
                                return Q("tr", o)
                            })(0, i, f, T, t, o, k, $)
                        }));
                        const M = Q(g.target), O = g.events;
                        M.off(O), M.on(O, (function () {
                            j.off(A), M.off(O), T.animate({top: `${w.offsetTop - y.scrollTop + qe}`}, r, (() => {
                                k.removeClass(kn), T.remove()
                            }));
                            const t = $.filter(((e, t) => !qt(e, x[t])));
                            v(l) && l(t, $), o && ((e, t, o, n, s) => {
                                if (!m(o)) return;
                                const r = yo(e);
                                r.length && (r.forEach((e => {
                                    s.forEach((s => {
                                        qt(it(n, e, [o]), it(n, s, [o]), t) && (e[o] = s[o])
                                    }))
                                })), xo(e, r, !0))
                            })(e, n.key, i, a, t), cs.changeTableData(e, $, !0), d.removeClass($e)
                        }))
                    }))
                }

                addSign(e) {
                    return e.disableMoveRow ? Cn : ""
                }

                createHtml(e) {
                    const {table: t, tr: o, overFlow: n, $thList: s} = e, r = o.cloneNode(!0);
                    r.style.height = h(o, "height");
                    const a = r.querySelectorAll("td");
                    return u(s, ((e, t) => {
                        a[t].style.width = h(e, "width"), a[t].style.left = h(e, "left"), a[t].style.right = h(e, "right"), n && (a[t].style.boxShadow = h(e, "box-shadow"))
                    })), {class: t.className, tbody: r.outerHTML}
                }

                getColumn(e) {
                    const {fixed: t} = e;
                    return {
                        key: ke,
                        text: "",
                        isAutoCreate: !0,
                        isShow: !0,
                        disableCustomize: !0,
                        width: 30,
                        fixed: t,
                        template: () => '<td gm-create gm-moverow><i class="gm-icon gm-icon-move"></i></td>'
                    }
                }

                destroy(e) {
                    Rt(wn[e])
                }
            }

            $n([Ho(xn())], Tn.prototype, "createHtml", null);
            const Sn = new Tn, Dn = {}, jn = "full-column-fold", An = "full-column-state",
                Mn = (e, t, o, n, s, r, a, i) => {
                    let {text: c, compileAttr: l} = ((e, t, o, n, s) => {
                        const {_: r, compileAngularjs: a, compileVue: i, compileReact: c} = e, l = _o(r);
                        let d = "", u = "";
                        return c && (u = Mo, l.push({
                            template: n,
                            row: t,
                            index: o,
                            type: "full-" + s,
                            fnArg: [t, o]
                        })), (i || a) && (u = Mo, l.push({row: t, index: o})), c || (d = n(t, o)), {
                            text: d,
                            compileAttr: u
                        }
                    })(e, r, a, o, i);
                    c = $(c) ? c.outerHTML : c;
                    let d = [];
                    return n && (d = [[An, s + ""]]), {
                        className: [],
                        attribute: [["full-column", i], [pe, a + ""]].concat(d),
                        querySelector: `[full-column][${pe}="${a}"]`,
                        tdList: [`<td colspan="${t}"><div class="full-column-div" ${l}>${c}</div></td>`]
                    }
                }, On = (e, t, o, n, s) => {
                    const {columnMap: r, fullColumn: a} = e, {
                        topTemplate: i,
                        bottomTemplate: c,
                        useFold: l,
                        interval: d,
                        openState: u = !1
                    } = a, h = Object.keys(r).length;
                    if ("top" === s && v(i)) {
                        const r = Mn(e, h, i, l, u, t, o, s);
                        r && n.push(r)
                    }
                    if ("bottom" === s && v(c)) {
                        const r = Mn(e, h, c, l, u, t, o, s);
                        r && n.push(r)
                    }
                    "bottom" === s && (v(i) || v(c)) && n.push(((e, t, o = 0) => (b(o) && (o += qe), {
                        className: [],
                        attribute: [["full-column-interval", o + ""], [pe, t + ""]],
                        querySelector: `[full-column-interval][${pe}="${t}"]`,
                        tdList: [`<td colspan="${e}"><div style="height: ${o}"></div></td>`]
                    }))(h, o, d))
                }, _n = e => e ? "gm-icon-sub" : "gm-icon-add";
            const Pn = new class {
                init(e) {
                    const {useFold: t} = Do(e).fullColumn;
                    if (pt(e).attr("gm-full-column", ""), t) {
                        Dn[e] = (o = `${ut(e)} tbody`, {fold: at(Xe, o, `i[${jn}]`)});
                        const t = Dn[e].fold;
                        Q(t.target).on(t.events, t.selector, (function () {
                            const t = Q(this), o = t.closest("tr"), n = o.attr(ue),
                                s = Q(`${ut(e)} tbody [${pe}="${n}"]`), r = !("true" === t.attr(jn));
                            t.attr(jn, r), s.attr(An, r), o.attr(An, r), t.removeClass(_n(!r)), t.addClass(_n(r))
                        }))
                    }
                    var o
                }

                addTop(e, t, o, n) {
                    On(e, t, o, n, "top")
                }

                addBottom(e, t, o, n) {
                    On(e, t, o, n, "bottom")
                }

                getColumn(e) {
                    const {openState: t = !1, fixed: o} = e.fullColumn;
                    return {
                        key: xe,
                        text: "",
                        isAutoCreate: !0,
                        isShow: !0,
                        disableCustomize: !0,
                        width: "40px",
                        fixed: o,
                        template: () => `<td gm-create gm-fold><i class="gm-icon ${_n(t)}" ${jn}="${t}"></i></td>`
                    }
                }

                destroy(e) {
                    Rt(Dn[e])
                }
            }, Rn = {}, En = "tree-element", Hn = {}, zn = e => {
                delete Hn[e]
            }, Ln = e => e ? "gm-icon-sub" : "gm-icon-add";
            const Nn = new class {
                add(e, t, o, n, s) {
                    ((e, t) => {
                        Hn[e] || (Hn[e] = []), Hn[e].push(t)
                    })(e, {cacheKey: t, level: o, state: s, hasChildren: n})
                }

                init(e) {
                    const t = this;
                    var o;
                    Rn[e] = (o = ut(e), {toggle: at(Xe, o, `[${En}] i`)});
                    const {toggle: n} = Rn[e];
                    vt(e).addClass("tree-tbody"), Q(n.target).on(n.events, n.selector, (function () {
                        const o = Q(this).closest("tr");
                        t.updateDOM(e, void 0, o)
                    }))
                }

                updateDOM(e, t, o) {
                    const n = vt(e), s = (e, t) => {
                        const o = Q("[tree-element]", e), r = Q("i", o), a = e.attr(ue);
                        g(t) && (t = !("true" === o.attr(En))), r.removeClass(Ln(!t)), r.addClass(Ln(t)), o.attr(En, t);
                        const i = n.find(`[${pe}="${a}"]`);
                        0 !== i.length && (i.attr(ge, t), t || u(i, (e => {
                            s(Q(e), !1)
                        })))
                    };
                    o ? s(o, t) : (e => {
                        const t = Q("[tree-element]", n), o = Q("i", t);
                        o.removeClass(Ln(!e)), o.addClass(Ln(e)), t.attr(En, e);
                        n.find(`[${pe}]`).attr(ge, e)
                    })(t), ar.update(e)
                }

                insertDOM(e, t) {
                    const {openState: o, insertTo: n} = t, s = ht(e), a = [];
                    u(Q(`tr[${pe}]`, s), (e => {
                        a.push(e.getAttribute(pe))
                    }));
                    const i = (e => Hn[e])(e);
                    i && 0 !== i.length && (i.forEach((t => {
                        let {cacheKey: a, level: i, hasChildren: c, state: l} = t;
                        g(l) && (l = o);
                        const d = Q(`tr[gm-cache-key="${a}"]`, s);
                        let u;
                        m(n) && (u = Tt(bt(e, n), d)), u || (u = Q("td:not([gm-create])", d).eq(0));
                        const h = r.createElement("span");
                        h.setAttribute(En, l + ""), h.style.width = 14 * (i + 1) + qe, c && (h.innerHTML = `<i class="gm-icon ${Ln(l)}"></i>`), u.prepend(h)
                    })), zn(e))
                }

                destroy(e) {
                    Rt(Rn[e]), zn(e)
                }
            }, qn = "gm-summary", Kn = "gm-summary-row", Bn = "[gm-summary-row]";
            var Fn = o(472), In = o.n(Fn);
            const Gn = {};
            var Wn = function (e, t, o, n) {
                var s, r = arguments.length, a = r < 3 ? t : null === n ? n = Object.getOwnPropertyDescriptor(t, o) : n;
                if ("object" == typeof Reflect && "function" == typeof Reflect.decorate) a = Reflect.decorate(e, t, o, n); else for (var i = e.length - 1; i >= 0; i--) (s = e[i]) && (a = (r < 3 ? s(a) : r > 3 ? s(t, o, a) : s(t, o)) || a);
                return r > 3 && a && Object.defineProperty(t, o, a), a
            };
            const Jn = (e, t, o, n) => {
                if (!x(t) || w(t)) return void Lt("sortJson unavailable");
                const s = Do(e);
                s.isCombSorting || (s.sortData = {}), S(s.sortData, t), jo(s), v(o) || (o = () => {
                }), g(n) && (n = !0);
                const r = S({}, s.query, s.sortData, s.pageData);
                s.sortingBefore(r), n ? cs.refresh(e, (t => {
                    (e => {
                        const {sortData: t, sortUpText: o, sortDownText: n} = Do(e), s = "sorting-up",
                            r = "sorting-down", a = "sorting";
                        u(Q(`${ut(e)} .${Le}`), (e => {
                            Q(e).removeClass("sorting-up sorting-down"), Q(e).closest("th").attr(a, "")
                        })), u(t, ((t, i) => {
                            const c = Q(`${ut(e)} th[th-name="${t}"]`), l = Q(`.${Le}`, c);
                            i === o && (l.addClass(s), l.removeClass(r), c.attr(a, o)), i === n && (l.addClass(r), l.removeClass(s), c.attr(a, n))
                        }))
                    })(e), o(t), s.sortingAfter(r)
                })) : (o(), s.sortingAfter(r))
            };

            class Vn {
                init(e) {
                    Gn[e] = ((e, t) => ({start: at(Xe, t, `[grid-manager-mock-thead="${e}"] .${Le}`)}))(e, ut(e));
                    const {start: t} = Gn[e];
                    Q(t.target).on(t.events, t.selector, (function (t) {
                        const o = Ct(Q(this).closest("th")), {
                            sortData: n,
                            sortMode: s,
                            sortUpText: r,
                            sortDownText: a
                        } = Do(e), i = n[o];
                        let c = "";
                        if ("single" === s) {
                            const e = Q(t.target);
                            e.hasClass("sa-up") && (c = i === r ? "" : r), e.hasClass("sa-down") && (c = i === a ? "" : a)
                        }
                        "overall" === s && (c = i === a ? r : a);
                        Jn(e, {[o]: c})
                    }))
                }

                createHtml() {
                    return {}
                }

                destroy(e) {
                    Rt(Gn[e])
                }
            }

            Wn([Ho(In())], Vn.prototype, "createHtml", null);
            const Un = new Vn;
            var Yn = o(285), Xn = o.n(Yn);
            const Qn = {};
            var Zn = function (e, t, o, n) {
                var s, r = arguments.length, a = r < 3 ? t : null === n ? n = Object.getOwnPropertyDescriptor(t, o) : n;
                if ("object" == typeof Reflect && "function" == typeof Reflect.decorate) a = Reflect.decorate(e, t, o, n); else for (var i = e.length - 1; i >= 0; i--) (s = e[i]) && (a = (r < 3 ? s(a) : r > 3 ? s(t, o, a) : s(t, o)) || a);
                return r > 3 && a && Object.defineProperty(t, o, a), a
            };

            class es {
                init(e) {
                    const t = this, o = Q("body"), n = ut(e);
                    Qn[e] = ((e, t) => {
                        const o = `[grid-manager-mock-thead="${e}"] .gm-filter-area`;
                        return {
                            toggle: at(Qe, t, `${o} .fa-icon`),
                            close: at("mousedown.closeFitler", "body"),
                            submit: at(et, t, `${o} .filter-submit`),
                            reset: at(et, t, `${o} .filter-reset`),
                            checkboxAction: at(Xe, t, `${o} .gm-checkbox-input`),
                            radioAction: at(Xe, t, `${o} .gm-radio-input`)
                        }
                    })(e, n);
                    const {toggle: s, close: r, submit: a, reset: i, checkboxAction: c, radioAction: l} = Qn[e];
                    Q(s.target).on(s.events, s.selector, (function (s) {
                        s.stopPropagation(), s.preventDefault();
                        const a = Q(`${n} .fa-con`), i = Q(this), c = i.closest(".gm-filter-area"),
                            l = i.closest("th[th-name]"), d = Ct(l), h = c.find(".fa-con");
                        u(a, (e => {
                            h.get(0) !== e && (e.style.display = "none")
                        }));
                        const p = Do(e);
                        t.update(l, p.columnMap[d].filter);
                        "none" !== h.css("display") ? h.hide() : h.show();
                        const g = "direction-left", f = "direction-right";
                        c.offset().left + h.width() > pt(e).width() ? (h.addClass(f), h.removeClass(g)) : (h.addClass(g), h.removeClass(f)), Q(r.target).on(r.events, (function (e) {
                            const t = Q(e.target);
                            if (t.hasClass(Ye) || 1 === t.closest(".fa-con").length) return !1;
                            o.find(".fa-con").hide(), Q(r.target).off(r.events)
                        }))
                    })), Q(a.target).on(a.events, a.selector, (function () {
                        const o = Q(this).closest(".fa-con"), n = Q(".gm-radio-checkbox-input", o), s = o.closest("th"),
                            a = Ct(s), i = [];
                        u(n, (e => {
                            e.checked && i.push(e.value)
                        }));
                        const c = Do(e), l = i.join(",");
                        c.columnMap[a].filter.selected = l, c.pageData[c.currentPageKey] = 1, S(c.query, {[a]: l}), jo(c), t.update(s, c.columnMap[a].filter), cs.refresh(e), o.hide(), Q(r.target).off(r.events)
                    })), Q(i.target).on(i.events, i.selector, (function () {
                        const o = Q(this).closest(".fa-con"), n = Q(this).closest("th[th-name]"), s = Ct(n), a = Do(e);
                        delete a.query[s], a.columnMap[s].filter.selected = "", a.pageData[a.currentPageKey] = 1, jo(a), t.update(n, a.columnMap[s].filter), cs.refresh(e), o.hide(), Q(r.target).off(r.events)
                    })), Q(c.target).on(c.events, c.selector, (function () {
                        const e = Q(this).closest(".filter-checkbox").find(".gm-checkbox");
                        Es(e, this.checked ? Oe : Pe)
                    })), Q(l.target).on(l.events, l.selector, (function () {
                        const e = Q(this).closest(".filter-list").find(".filter-radio");
                        u(e, (e => {
                            Rs(Q(e).find(".gm-radio"), this === e.querySelector(".gm-radio-input"))
                        }))
                    }))
                }

                createHtml(e) {
                    const {settings: t, columnFilter: o} = e, n = gt(t._).height();
                    let s = "";
                    return o.selected = o.selected || "", o.option.forEach((e => {
                        let t = o.selected.split(",");
                        t = t.map((e => e.trim()));
                        const n = {checked: -1 !== t.indexOf(e.value), label: e.text, value: e.value};
                        o.isMultiple ? s += `<li class="filter-checkbox">${Ls.getCheckboxTpl(n)}</li>` : s += `<li class="filter-radio">${Ls.getRadioTpl(n)}</li>`
                    })), {
                        icon: o.selected ? " filter-selected" : "",
                        style: `style="max-height: ${n - 100 + qe}"`,
                        ok: No(t, "ok"),
                        reset: No(t, "reset"),
                        list: s
                    }
                }

                update(e, t) {
                    const o = Q(".fa-icon", e), n = Q(".fa-con .gm-radio-checkbox-input", e);
                    u(n, (e => {
                        let o = Q(e).closest(".gm-radio-checkbox");
                        t.isMultiple ? Es(o, t.selected.split(",").includes(e.value) ? Oe : Pe) : Rs(o, e.value === t.selected)
                    })), t.selected ? o.addClass(Ue) : o.removeClass(Ue)
                }

                destroy(e) {
                    Rt(Qn[e])
                }
            }

            Zn([Ho(Xn())], es.prototype, "createHtml", null);
            const ts = new es, os = (e, t) => {
                const {_: o, emptyTemplate: n} = e;
                if (t && 0 !== vo(o, !0).length) return;
                const s = pt(o);
                s.addClass(Te), vt(o).html(`<tr empty-template="${o}" style="height: ${s.height() - 1 + qe}"><td colspan="${wt(o).length}"></td></tr>`);
                const r = $t(o).get(0).querySelector("td");
                r.innerHTML = ((e, t, o) => {
                    const {_: n, compileAngularjs: s, compileVue: r, compileReact: a} = e, i = _o(n);
                    return a ? (i.push({
                        el: t,
                        template: o,
                        type: "empty",
                        fnArg: [e]
                    }), "") : (r && i.push({el: t}), s && i.push({el: t}), o(e))
                })(e, r, n), Eo(e)
            }, ns = async (e, t, o, n, s) => {
                const {
                    _: r,
                    columnMap: a,
                    supportTreeData: i,
                    supportCheckbox: c,
                    supportMoveRow: l,
                    treeConfig: d,
                    __isNested: h,
                    __isFullColumn: p
                } = e, {treeKey: m, openState: y} = d, x = vt(r), k = x.get(0), T = x.find(`[empty-template="${r}"]`);
                T.length && T.remove();
                let S = [];
                const D = [], j = [];
                u(a, ((e, t) => {
                    t.pk || (D[t.index] = t)
                }));
                const A = e => {
                    u(e, (e => {
                        C(e.children) ? A(e.children) : j.push(e)
                    }))
                };
                A(D);
                try {
                    const o = (t, n, s) => {
                        const a = g(s);
                        u(t, ((t, d) => {
                            const h = [], g = [], f = t[ue];
                            t[me] && h.push(t[me]), a || (g.push([pe, s]), g.push([ge, y])), a && i && d % 2 == 0 && g.push(["odd", ""]), g.push([ue, f]);
                            const v = {
                                className: h,
                                attribute: g,
                                row: t,
                                querySelector: `[gm-cache-key="${f}"]`,
                                tdList: []
                            };
                            if (a && p && Pn.addTop(e, t, d, S), ((t, o, n, s) => {
                                const r = t.tdList;
                                u(j, (t => {
                                    const a = t.template;
                                    if (t.isAutoCreate) return void r.push(a(o[t.key], o, n, s));
                                    let {text: i, compileAttr: d} = Ro(e, a, o, n, t.key);
                                    const u = t.align ? `align=${t.align}` : "", h = l ? Sn.addSign(t) : "",
                                        p = c ? Ls.addSign(t) : "", g = t.fixed ? `fixed=${t.fixed}` : "";
                                    i = $(i) ? i.outerHTML : i, r.push(`<td ${d} ${u} ${h} ${p} ${g}>${i}</td>`)
                                }))
                            })(v, t, d, a), S.push(v), a && p && Pn.addBottom(e, t, d, S), i) {
                                const e = t[m], s = e && e.length;
                                let a;
                                const i = x.find(`${v.querySelector} [tree-element]`);
                                i.length && (a = "true" === i.attr(En)), Nn.add(r, f, n, s, a), s && o(e, n + 1, f)
                            }
                        }))
                    };
                    o(t, 0), ((e, t, o) => {
                        const {_: n, summaryHandler: s, browser: r} = e;
                        if (!v(s)) return;
                        const a = s(vo(n, !0)), i = pt(n);
                        if (i.find(Bn).remove(), w(a)) return void i.removeAttr(qn);
                        i.attr(qn, "");
                        const c = [];
                        let l = "";
                        "safari" === r && (l = `style="bottom: ${ft(n).height()}px"`), u(t, (t => {
                            const {key: o, align: n} = t;
                            let s = a[o];
                            (f(s) || g(s)) && (s = "");
                            const r = n ? `align="${n}"` : "";
                            let {text: i, compileAttr: d} = Ro(e, (() => s), {}, void 0, o);
                            i = $(i) ? i.outerHTML : i, c.push(`<td ${d} ${r} disable-move ${l}>${i}</td>`)
                        })), o.push({className: [], attribute: [[Kn, ""]], querySelector: Bn, tdList: c})
                    })(e, j, S);
                    const a = document.createDocumentFragment(), d = document.createDocumentFragment(),
                        h = x.find("tr");
                    if (u(h, (e => {
                        d.appendChild(e)
                    })), k.innerHTML = "", d.children.length) {
                        let e, t, o = ((e, t, o) => e.querySelector(`[full-column="${t}"][${pe}="${o}"]`))(d, "top", n);
                        o || (o = d.querySelector(`[gm-cache-key="${n}"]`)), o && (e = [].indexOf.call(d.children, o));
                        let r = (M = s, d.querySelector(`[full-column-interval][${pe}="${M}"]`));
                        r || (r = d.querySelector(`[gm-cache-key="${s}"]`)), r && (t = [].indexOf.call(d.children, r));
                        const a = [];
                        u(d.children, ((o, n) => {
                            b(e) || b(t) ? (b(e) && n < e && a.push(o), b(t) && n > t && a.push(o)) : a.push(o)
                        })), u(a, (e => e.remove()))
                    }
                    S.forEach((e => {
                        const {className: t, attribute: o, tdList: n, row: s, querySelector: i} = e, c = n.join("");
                        let l = d.querySelector(i);
                        if (l) l.innerHTML = c; else {
                            l = document.createElement("tr"), t.length && (l.className = t.join(" ")), o.forEach((e => {
                                l.setAttribute(e[0], e[1])
                            })), l.innerHTML = c;
                            const e = d.querySelector("[gm-cache-key]");
                            if (e && !g(s)) {
                                const t = mo(r, e, !0)[le];
                                s[le] < t ? a.appendChild(l) : d.appendChild(l)
                            } else d.appendChild(l)
                        }
                        l[de] = s
                    })), d.insertBefore(a, d.firstChild), k.appendChild(d)
                } catch (e) {
                    Nt("render tbody error"), console.error(e)
                }
                var M;
                h || u(a, ((e, t) => {
                    St(r, e, t.isShow)
                })), await Eo(e), i && Nn.insertDOM(r, d), Go(r, a), o || (ar.update(r), x.height() >= pt(r).height() ? x.attr("filled", "") : x.removeAttr("filled"), e.__isNested || Dt(r))
            }, ss = e => {
                const {
                    query: t,
                    supportAjaxPage: o,
                    pageData: n,
                    sortData: s,
                    mergeSort: r,
                    sortKey: a,
                    currentPageKey: i,
                    pageSizeKey: c,
                    requestHandler: l
                } = e, d = S(!0, {}, t);
                return o && (d[i] = n[i], d[c] = n[c]), w(s) || (r ? (d[a] = "", u(s, ((e, t) => {
                    d[a] = `${d[a]}${d[a] ? "," : ""}${e}:${t}`
                }))) : u(s, ((e, t) => {
                    d[`${a}${e}`] = t
                }))), l(Kt(d))
            }, rs = (e, t, o) => {
                const n = Kt(o), {supportTreeData: s, treeConfig: r} = e, {treeKey: a} = r;
                let i, c = n[0];
                const l = (e, t) => {
                    const o = {};
                    t.forEach((e => {
                        o[e[ue]] = e
                    })), u(e, ((t, n) => {
                        const r = o[t[ue]] || {};
                        i = t, qt(r, t) && delete e[n], s && t[a] && l(t[a], r[a] || [])
                    }))
                };
                return l(n, t), {diffList: n, diffFirst: c, diffLast: i}
            }, as = {}, is = e => {
                const {rowHover: t, rowClick: o, cellHover: n, cellClick: s, useCellFocus: r} = Do(e);
                as[e] = (e => {
                    const t = "tr[gm-cache-key]", o = "tr[gm-cache-key] td";
                    return {
                        rowHover: at(Ze, e, t),
                        rowClick: at(Xe, e, t),
                        cellHover: at(Ze, e, o),
                        cellClick: at(Xe, e, o),
                        cellFocus: at(Qe, e, "td")
                    }
                })(ut(e));
                const a = as[e], i = t => [mo(e, t), parseInt(t.getAttribute(ue), 10)];
                t && (() => {
                    let o;
                    const n = a.rowHover;
                    Q(n.target).on(n.events, n.selector, (function () {
                        o !== this && (o = this, nn(e, this, t(...i(this), this), (() => {
                            o = null
                        })))
                    }))
                })(), o && (() => {
                    const t = a.rowClick;
                    Q(t.target).on(t.events, t.selector, (function () {
                        nn(e, this, o(...i(this), this))
                    }))
                })();
                const c = t => {
                    const o = t.parentNode;
                    return [mo(e, o), parseInt(o.getAttribute(ue), 10), t.cellIndex]
                };
                n && (() => {
                    let t;
                    const o = a.cellHover;
                    Q(o.target).on(o.events, o.selector, (function () {
                        t !== this && (t = this, nn(e, this, n(...c(t), this), (() => {
                            t = null
                        })))
                    }))
                })(), s && (() => {
                    const t = a.cellClick;
                    Q(t.target).on(t.events, t.selector, (function () {
                        nn(e, this, s(...c(this), this))
                    }))
                })(), r && (() => {
                    const t = a.cellFocus;
                    Q(t.target).on(t.events, t.selector, (function () {
                        vt(e).find("[gm-focus-td]").removeAttr(fe), this.setAttribute(fe, "")
                    }))
                })()
            };
            const cs = new class {
                refresh(e, t) {
                    const o = Do(e), {
                        disableAutoLoading: n,
                        loadingTemplate: s,
                        ajaxBeforeSend: r,
                        ajaxSuccess: a,
                        ajaxError: i,
                        ajaxComplete: c,
                        checkboxConfig: l
                    } = o;
                    l.disableStateKeep && xo(e, [], !0), Cs.updateRefreshIconState(e, !0), !n && ct(e, s);
                    let d = (e => {
                        const t = ss(e), {
                            supportAjaxPage: o,
                            pageData: n,
                            sortData: s,
                            sortKey: r,
                            ajaxType: a,
                            ajaxHeaders: i,
                            ajaxXhrFields: c,
                            ajaxData: l
                        } = e;
                        o && u(n, ((e, o) => {
                            n[e] = t[e] || o
                        })), u(s, ((e, o) => {
                            s[e] = t[`${r}${e}`] || o
                        })), jo(e);
                        const d = v(l) ? l(e, t) : l;
                        return m(d) ? new Promise(((e, o) => {
                            _({url: d, type: a, data: t, headers: i, xhrFields: c, cache: !0, success: e, error: o})
                        })) : d instanceof Promise ? d : new Promise((e => {
                            e(d)
                        }))
                    })(o);
                    r(d), d.then((o => {
                        try {
                            const s = Do(e);
                            setTimeout((() => {
                                this.driveDomForSuccessAfter(s, o, t), a(o), c(o), !n && lt(e), Cs.updateRefreshIconState(e, !1)
                            }))
                        } catch (e) {
                            console.error(e)
                        }
                    })).catch((t => {
                        i(t), c(t), !n && lt(e), Cs.updateRefreshIconState(e, !1)
                    }))
                }

                async changeTableData(e, t, o) {
                    const n = Do(e);
                    if (0 === t.length) return os(n), void bo(e, []);
                    let s = vo(e, !0);
                    const r = o ? ((e, t) => {
                        const {
                            columnMap: o,
                            rowRenderHandler: n,
                            pageData: s,
                            supportAutoOrder: r,
                            supportCheckbox: a,
                            checkboxConfig: i,
                            pageSizeKey: c,
                            currentPageKey: l,
                            supportTreeData: d,
                            treeConfig: u,
                            fullColumn: h
                        } = Do(e), p = i.key;
                        let f = 0;
                        const m = (e, t, o, n) => {
                            let s = o.toString();
                            g(n) || (s = `${n}-${o}`);
                            const {topTemplate: r, bottomTemplate: a} = h || {};
                            if (v(r) && f++, e[le] = f, f++, v(a) && f++, (v(r) || v(a)) && f++, d) {
                                const o = e[u.treeKey];
                                o && o.length && o.forEach(((e, o) => {
                                    m(e, t + 1, o, s)
                                }))
                            }
                            e[ue] = s, e[he] = t
                        };
                        return t.map(((t, i) => {
                            if (r) {
                                let e = 1;
                                s && s[c] && s[l] && (e = s[c] * (s[l] - 1) + 1), t.gm_order = e + i
                            }
                            return a && (t.gm_checkbox = yo(e).some((e => qt(it(o, e), it(o, t), p))), t.gm_checkbox_disabled = !1), m(t, 0, i), n(t, i)
                        }))
                    })(e, t) : t;
                    xo(e, r), bo(e, r);
                    const {virtualScroll: a, supportCheckbox: i, checkboxConfig: c} = n, {
                        useVirtualScroll: l,
                        virtualNum: d
                    } = a, u = ht(e), h = ft(e).height();
                    if (!l || d >= r.length) {
                        Qs.virtualScrollMap[e] && (s = []);
                        const {diffList: t, diffFirst: o, diffLast: a} = rs(n, s, r);
                        return await ns(n, t, !1, o[ue], a[ue]), i && Hs(e, r, c.useRadio, c.max), delete Qs.virtualScrollMap[e], void u.css({
                            marginTop: -h,
                            marginBottom: 0
                        })
                    }
                    const p = pt(e), f = vt(e);
                    let m = vo(e, !0), b = parseInt(n.lineHeight, 10);
                    const y = p.height();
                    let x, w, k = [];
                    Qs.virtualScrollMap[e] = async t => {
                        const o = Do(e), {supportCheckbox: n, checkboxConfig: s} = o;
                        m = vo(e, !0);
                        const r = p.scrollTop();
                        if (x && r === x) return;
                        const a = f.find("tr[gm-cache-key]").eq(0);
                        if (a.length && (b = a.height()), x && Math.abs(r - x) < b) return;
                        x = r;
                        const i = Math.ceil(y / b);
                        let c = Math.ceil(r / b) - Math.ceil((d - i) / 2);
                        c < 0 && (c = 0);
                        let l = c + d;
                        l >= m.length && (l = m.length, c = l - d), c < 0 && (c = 0), u.css({
                            marginTop: c * b - h,
                            marginBottom: (m.length - l) * b
                        });
                        const g = m.slice(c, l), {diffList: v, diffFirst: C, diffLast: $} = rs(o, k, g);
                        k = g, await ns(o, v, t, C[ue], $[ue]), w && clearTimeout(w), w = setTimeout((() => {
                            clearTimeout(w), n && Hs(e, m, s.useRadio, s.max)
                        }), 300)
                    }, Qs.virtualScrollMap[e](!1)
                }

                async driveDomForSuccessAfter(e, t, o) {
                    const {
                        _: n,
                        rendered: s,
                        responseHandler: r,
                        supportAjaxPage: a,
                        supportMenu: i,
                        dataKey: c,
                        totalsKey: l,
                        useNoTotalsMode: d,
                        asyncTotals: u
                    } = e;
                    if (!s) return;
                    if (!t) return void Nt("response undefined！please check ajaxData");
                    let h = m(t) ? JSON.parse(t) : t;
                    h = r(Kt(h));
                    let p = h[c], g = h[l];
                    if (p && k(p)) if (!a || d || u || !isNaN(parseInt(g, 10))) {
                        if (0 === p.length) h[l] = 0; else {
                            const e = pt(n);
                            e.removeClass(Te), e.scrollTop(0)
                        }
                        await this.changeTableData(n, p, !0), a && Cs.resetPageData(e, h[l], p.length), i && Yo(n), v(o) && o(h)
                    } else Nt(`response.${l} undefined，please check totalsKey`); else Nt(`response.${c} is not Array，please check dataKey`)
                }

                async createDOM(e, t) {
                    const {_: o, lineHeight: n, useWordBreak: s} = t;
                    Po(o), e.wrap(bn.getWrapTpl({settings: t}), ".table-div");
                    const a = r.createElement("thead");
                    a.setAttribute(re, o), e.append(a);
                    const i = r.createElement("tbody");
                    i.setAttribute(ie, o), s && i.setAttribute("word-break", ""), e.append(i), is(o), (e => {
                        const {_: t, columnMap: o, sortUpText: n, sortDownText: s, supportAdjust: r} = e;
                        ft(t).html(bn.getTheadTpl({settings: e}));
                        const a = xt(t);
                        u(a, (t => {
                            const a = Q(t), i = Q(".th-wrap", a), c = a.attr(ce), l = o[c], d = l.isAutoCreate;
                            if (!d && l.remind && i.append(Q(rn.createHtml({remind: l.remind}))), !d && m(l.sorting)) {
                                const e = Q(Un.createHtml());
                                switch (l.sorting) {
                                    case n:
                                        e.addClass("sorting-up");
                                        break;
                                    case s:
                                        e.addClass("sorting-down")
                                }
                                i.append(e)
                            }
                            if (!d && l.filter && x(l.filter)) {
                                const t = Q(ts.createHtml({settings: e, columnFilter: l.filter}));
                                i.append(t)
                            }
                            !r || d || l.disableCustomize || i.append(Q(lr.html))
                        }))
                    })(t), Et(o, n), jo(t), await this.waitContainerAvailable(o), Pt(t), Qs.init(o), await Eo(t)
                }

                waitContainerAvailable(e) {
                    const t = r.querySelector(`[${ee}="${e}"]`);

                    function o() {
                        return "100%" !== h(t, "width")
                    }

                    if (!o()) return new Promise((t => {
                        go[e] = setInterval((() => {
                            o() && (clearInterval(go[e]), go[e] = null, t())
                        }), 50)
                    }))
                }

                destroy(e) {
                    Rt(as[e]);
                    try {
                        const t = ht(e), o = gt(e);
                        if (!t.length || !o.length) return;
                        const n = t.get(0);
                        Me.forEach((e => {
                            let o = n["__" + e];
                            o ? t.attr(e, o) : t.removeAttr(e), delete n["__" + e]
                        })), t.html(""), o.after(t), o.remove()
                    } catch (e) {
                    }
                }
            };
            var ls = o(986), ds = o.n(ls);
            const us = {};
            var hs = function (e, t, o, n) {
                var s, r = arguments.length, a = r < 3 ? t : null === n ? n = Object.getOwnPropertyDescriptor(t, o) : n;
                if ("object" == typeof Reflect && "function" == typeof Reflect.decorate) a = Reflect.decorate(e, t, o, n); else for (var i = e.length - 1; i >= 0; i--) (s = e[i]) && (a = (r < 3 ? s(a) : r > 3 ? s(t, o, a) : s(t, o)) || a);
                return r > 3 && a && Object.defineProperty(t, o, a), a
            };

            class ps {
                init({_: e, defaultValue: t = "", onChange: o}) {
                    var n;
                    us[e] = {
                        open: at(Xe, n = `[${ne}="${e}"]`, ".gm-dropdown .gm-dropdown-text"),
                        close: at(Xe, "body"),
                        selected: at(Xe, n, ".gm-dropdown .gm-dropdown-list >li")
                    };
                    const {open: s, close: r, selected: a} = us[e], i = gt(e).find(".gm-dropdown"),
                        c = i.find(".gm-dropdown-text"), l = i.find(".gm-dropdown-list");
                    c.text(t), Q(s.target).on(s.events, s.selector, (function (e) {
                        e.stopPropagation();
                        const t = Q(r.target);
                        if ("block" === l.css("display")) return l.hide(), void t.unbind(r.events);
                        l.show();
                        const o = r.events;
                        t.unbind(o), t.bind(o, (function () {
                            t.unbind(o), l.hide()
                        }))
                    })), Q(a.target).on(a.events, a.selector, (function () {
                        const e = parseInt(c.text(), 10), t = this.value;
                        e !== t && (c.text(t), o(t, e))
                    }))
                }

                createHtml(e) {
                    const {sizeData: t} = e;
                    let o = "";
                    return t.forEach((e => {
                        o += `<li value="${e}">${e}</li>`
                    })), {li: o}
                }

                destroy(e) {
                    Rt(us[e])
                }
            }

            hs([Ho(ds())], ps.prototype, "createHtml", null);
            const gs = new ps;
            var fs = o(956), ms = o.n(fs);
            const vs = e => `[${ne}="${e}"]`, bs = {};
            var ys = function (e, t, o, n) {
                var s, r = arguments.length, a = r < 3 ? t : null === n ? n = Object.getOwnPropertyDescriptor(t, o) : n;
                if ("object" == typeof Reflect && "function" == typeof Reflect.decorate) a = Reflect.decorate(e, t, o, n); else for (var i = e.length - 1; i >= 0; i--) (s = e[i]) && (a = (r < 3 ? s(a) : r > 3 ? s(t, o, a) : s(t, o)) || a);
                return r > 3 && a && Object.defineProperty(t, o, a), a
            };
            const xs = (e, t, o) => {
                const {useNoTotalsMode: n, currentPageKey: s} = t;
                n && e.attr("no-totals-mode", "true");
                Q("[pagination-number]", e).html(((e, t) => {
                    let o = Number(t[e] || 0), n = Number(t.tPage || 0), s = "", r = "", a = 1, i = n;
                    if (o > 4 && (s += '<li to-page="1">1</li><li class="disabled">...</li>', a = o - 2), n - o > 4 && (i = o + 2, r += `<li class="disabled">...</li><li to-page="${n}">${n}</li>`), t.tSize) for (; a <= i; a++) s += a !== o ? `<li to-page="${a}">${a}</li>` : `<li class="active">${o}</li>`;
                    return s += r, s
                })(s, o));
                const r = o[s], a = Q("[pagination-before] .first-page", e),
                    i = Q("[pagination-before] .previous-page", e), c = Q("[pagination-after] .next-page", e),
                    l = Q("[pagination-after] .last-page", e), d = Boolean(a.length), u = Boolean(i.length),
                    h = Boolean(c.length), p = Boolean(l.length);
                1 === r ? (d && a.addClass(He), u && i.addClass(He)) : (d && a.removeClass(He), u && i.removeClass(He)), r >= o.tPage ? (h && c.addClass(He), p && l.addClass(He)) : (h && c.removeClass(He), p && l.removeClass(He))
            }, ws = (e, t) => {
                (!t || t < 1) && (t = 1);
                const {
                    _: o,
                    useNoTotalsMode: n,
                    currentPageKey: s,
                    pageData: r,
                    pageSize: a,
                    pageSizeKey: i,
                    sortData: c,
                    query: l,
                    pagingBefore: d,
                    pagingAfter: u
                } = e, {tPage: h} = r;
                !n && t > h && (t = h), r[s] = t, r[i] = r[i] || a, jo(e);
                const p = S({}, l, c, r);
                d(p), cs.refresh(o, (() => {
                    u(p)
                }))
            };

            class ks {
                init(e) {
                    const t = Do(e), {
                        disableCache: o,
                        pageSizeKey: n,
                        pageSize: s,
                        currentPageKey: r,
                        useNoTotalsMode: a
                    } = t;
                    bs[e] = (e => {
                        const t = `[${ne}="${e}"]`;
                        return {
                            input: at("keyup", t, ".gp-input"),
                            first: at(Xe, t, "[pagination-before] .first-page"),
                            previous: at(Xe, t, "[pagination-before] .previous-page"),
                            next: at(Xe, t, "[pagination-after] .next-page"),
                            last: at(Xe, t, "[pagination-after] .last-page"),
                            num: at(Xe, t, "[pagination-number] li"),
                            refresh: at(Xe, t, ".refresh-action")
                        }
                    })(e);
                    let i = s || 10;
                    if (!o) {
                        const t = ko(e)[n];
                        t && (i = t)
                    }
                    S(t, {pageData: {[n]: i, [r]: 1}}), a && (t.asyncTotals = null), jo(t);
                    const c = {
                        _: e, defaultValue: t.pageData[n], onChange: t => {
                            const o = Do(e);
                            o.pageData = {[r]: 1, [n]: t}, Co(o), jo(o);
                            const s = S({}, o.query, o.sortData, o.pageData);
                            o.pagingBefore(s), cs.refresh(e, (() => {
                                o.pagingAfter(s)
                            }))
                        }
                    };
                    gs.init(c), this.initEvent(e)
                }

                initEvent(e) {
                    const {first: t, previous: o, next: n, last: s, num: r, refresh: a, input: i} = bs[e];
                    Q(t.target).on(t.events, t.selector, (function () {
                        ws(Do(e), 1)
                    })), Q(o.target).on(o.events, o.selector, (function () {
                        const t = Do(e), o = t.pageData[t.currentPageKey] - 1;
                        ws(t, o < 1 ? 1 : o)
                    })), Q(n.target).on(n.events, n.selector, (function () {
                        const t = Do(e), o = t.pageData[t.currentPageKey], n = t.pageData.tPage, s = o + 1;
                        ws(t, s > n ? n : s)
                    })), Q(s.target).on(s.events, s.selector, (function () {
                        const t = Do(e);
                        ws(t, t.pageData.tPage)
                    })), Q(r.target).on(r.events, r.selector, (function () {
                        const t = Do(e), o = Q(this), n = o.attr("to-page");
                        if (!n || !Number(n) || o.hasClass(He)) return !1;
                        ws(t, parseInt(n, 10))
                    })), Q(a.target).on(a.events, a.selector, (function () {
                        const t = Do(e);
                        ws(t, t.pageData[t.currentPageKey])
                    })), Q(i.target).on(i.events, i.selector, (function (t) {
                        13 === t.which && ws(Do(e), parseInt(this.value, 10))
                    }))
                }

                createHtml(e) {
                    const {settings: t} = e;
                    return {
                        gridManagerName: t._,
                        keyName: ne,
                        gotoFirstText: No(t, "goto-first-text"),
                        gotoLastText: No(t, "goto-last-text"),
                        firstPageText: No(t, "first-page"),
                        previousPageText: No(t, "previous-page"),
                        nextPageText: No(t, "next-page"),
                        lastPageText: No(t, "last-page"),
                        pageSizeOptionTpl: gs.createHtml(t)
                    }
                }

                resetPageData(e, t, o) {
                    const {
                        _: n,
                        useNoTotalsMode: s,
                        currentPageKey: r,
                        pageData: a,
                        asyncTotals: i,
                        pageSizeKey: c,
                        pageSize: l
                    } = e, d = Q(vs(n)), u = a[r] || 1, h = a[c] || l, p = (t, n) => {
                        const s = ((e, t, o) => {
                            const {pageData: n, pageSizeKey: s, pageSize: r, currentPageKey: a} = e, i = n[s] || r,
                                c = n[a] || 1;
                            let l = 1;
                            return l = t ? Math.ceil(t / i) : o < i ? c : c + 1, {
                                tPage: l,
                                [a]: c > l ? 1 : c,
                                [s]: i,
                                tSize: t
                            }
                        })(e, t, o);
                        xs(d, e, s), ((e, t, o, n) => {
                            const {currentPageKey: s, pageSizeKey: r} = t, a = 1 === o[s] ? 1 : (o[s] - 1) * o[r] + 1,
                                i = o[s] * o[r];
                            let c = o.tSize;
                            const l = o[s];
                            let d = o.tPage;
                            !c && n && (c = d = n);
                            const u = Q(".page-info", e);
                            if (u.length) {
                                const e = No(t, "page-info", [a, i, c]);
                                u.html(e)
                            }
                            const h = Q("[begin-number-info]", e);
                            h.length && (h.html(a), h.val(a));
                            const p = Q("[end-number-info]", e);
                            p.length && (p.html(i), p.val(i));
                            const g = Q("[current-page-info]", e);
                            g.length && (g.html(l), g.val(l));
                            const f = Q("[totals-number-info]", e);
                            f.length && (f.html(c), f.val(c));
                            const m = Q("[totals-page-info]", e);
                            m.length && (m.html(d), m.val(d))
                        })(d, e, s, n), jo(S(!0, e, {pageData: s})), d.css("visibility", "visible")
                    };
                    if (i) return o < h ? void p((u - 1) * h + o) : (p(null, i.text), void i.handler(e, ss(e)).then((e => {
                        p(e)
                    })));
                    s ? p() : p(t)
                }

                updateRefreshIconState(e, t) {
                    const o = Q(`${vs(e)} .refresh-action`);
                    if (!o.length) return;
                    const n = "refreshing";
                    t ? o.addClass(n) : setTimeout((() => {
                        o.removeClass(n)
                    }), 3e3)
                }

                updateCheckedInfo(e) {
                    const t = Q(`${vs(e)} .toolbar-info.checked-info`);
                    0 !== t.length && t.html(No(Do(e), "checked-info", yo(e).length))
                }

                destroy(e) {
                    Rt(bs[e])
                }
            }

            ys([Ho(ms())], ks.prototype, "createHtml", null);
            const Cs = new ks;
            var $s = o(692), Ts = o.n($s), Ss = o(976), Ds = o.n(Ss), js = o(963), As = o.n(js);
            const Ms = {}, Os = (e, t, o, n, s) => {
                const r = vo(e), a = [];
                return o && !n && r.forEach((e => {
                    e.gm_checkbox_disabled || (e.gm_checkbox !== t && a.push(e), e.gm_checkbox = t)
                })), o || s || !n || (r[n].gm_checkbox = t, a.push(r[n])), s && r.forEach((e => {
                    e[ue] === n ? (e.gm_checkbox = !0, a.push(e)) : e.gm_checkbox = !1
                })), bo(e, r), xo(e, a, s), r
            };
            var _s = function (e, t, o, n) {
                var s, r = arguments.length, a = r < 3 ? t : null === n ? n = Object.getOwnPropertyDescriptor(t, o) : n;
                if ("object" == typeof Reflect && "function" == typeof Reflect.decorate) a = Reflect.decorate(e, t, o, n); else for (var i = e.length - 1; i >= 0; i--) (s = e[i]) && (a = (r < 3 ? s(a) : r > 3 ? s(t, o, a) : s(t, o)) || a);
                return r > 3 && a && Object.defineProperty(t, o, a), a
            };
            const Ps = "disabled-selected", Rs = (e, t) => {
                const o = Q('input[type="radio"]', e), n = "gm-radio-checked";
                t ? e.addClass(n) : e.removeClass(n), o.prop(Oe, t)
            }, Es = (e, t) => {
                const o = Q('input[type="checkbox"]', e);
                switch (t) {
                    case Oe:
                        e.addClass(Re), e.removeClass(Ee), o.prop(Oe, !0);
                        break;
                    case _e:
                        e.removeClass(Re), e.addClass(Ee), o.prop(Oe, !1);
                        break;
                    case Pe:
                        e.removeClass(Re), e.removeClass(Ee), o.prop(Oe, !1)
                }
            }, Hs = (e, t, o, n) => {
                const s = ht(e);
                let r = 0, a = t.length;
                t && t.forEach(((e, t) => {
                    const n = e.gm_checkbox, i = Q(`tbody tr[gm-cache-key="${t}"]`, s),
                        c = Q("td[gm-checkbox] .gm-radio-checkbox", i);
                    i.attr(Oe, n), o ? Rs(c, n) : Es(c, n ? Oe : Pe), e.gm_checkbox_disabled && a--, !e.gm_checkbox_disabled && n && r++
                }));
                const i = Q("thead tr th[gm-checkbox] .gm-checkbox-wrapper", s), c = Q(".gm-checkbox ", i);
                if (!o && Es(c, 0 === r ? Pe : r === a ? Oe : _e), Cs.updateCheckedInfo(e), !o && b(n)) {
                    const t = Q("tbody .gm-checkbox-wrapper ", s);
                    u(t, (t => {
                        const o = Q(t);
                        Q(".gm-checkbox", o).hasClass("gm-checkbox-checked") || (yo(e).length >= n ? o.addClass(Ps) : o.removeClass(Ps))
                    })), t.length > n ? i.addClass(Ps) : i.removeClass(Ps)
                }
            };

            class zs {
                init(e) {
                    var t;
                    Ms[e] = (t = ut(e), {
                        allChange: at(Xe, t, "th[gm-checkbox] .gm-checkbox-wrapper"),
                        checkboxChange: at(Xe, t, "td[gm-checkbox] .gm-checkbox-wrapper"),
                        radioChange: at(Xe, t, "td[gm-checkbox] .gm-radio-wrapper"),
                        trChange: at(Xe, t, "tbody > tr[gm-cache-key]")
                    });
                    const {allChange: o, checkboxChange: n, radioChange: s, trChange: r} = Ms[e], {
                        checkboxConfig: a,
                        checkedBefore: i,
                        checkedAllBefore: c,
                        checkedAfter: l,
                        checkedAllAfter: d
                    } = Do(e), {max: u, useRowCheck: h} = a;
                    Q(o.target).on(o.events, o.selector, (function () {
                        let t = yo(e);
                        const o = this.querySelector(".gm-checkbox-input"), n = o.checked;
                        if (i(t, !n), !1 === c(t, !n)) return void (o.checked = !n);
                        const s = Os(e, n, !0);
                        Hs(e, s), t = yo(e), l(t, n), d(t, n)
                    })), Q(n.target).on(n.events, n.selector, (function () {
                        const t = Q(this).closest("tr").get(0), o = this.querySelector(".gm-checkbox-input"),
                            n = o.checked;
                        if (!1 === i(yo(e), !n, mo(e, t))) return void (o.checked = !n);
                        const s = t.getAttribute(ue), r = Os(e, n, !1, s);
                        Hs(e, r, !1, u), l(yo(e), n, mo(e, t))
                    })), Q(s.target).on(s.events, s.selector, (function () {
                        const t = Q(this).closest("tr").get(0), o = this.querySelector(".gm-radio-input"),
                            n = o.checked;
                        if (!1 === i(yo(e), "true" === t.getAttribute("checked"), mo(e, t))) return void (o.checked = !n);
                        const s = t.getAttribute(ue), r = Os(e, void 0, !1, s, !0);
                        Hs(e, r, !0), l(yo(e), !0, mo(e, t))
                    })), h && Q(r.target).on(r.events, r.selector, (function (t) {
                        if (this.getAttribute(pe)) return;
                        const o = mo(e, this, !0), n = Q("td[gm-checkbox] label", this), s = t.target;
                        let r = Q(s);
                        "TD" !== s.nodeName && (r = r.closest("td")), o.gm_checkbox_disabled || m(r.attr(Ps)) || n.hasClass(Ps) || -1 !== [].indexOf.call(s.classList, "gm-radio-checkbox-input") || n.find("input").trigger("click")
                    }))
                }

                addSign(e) {
                    return e.disableRowCheck ? Ps : ""
                }

                getCheckedTr(e) {
                    return r.querySelectorAll(`${ut(e)} tbody tr[checked="true"]`)
                }

                getColumn(e) {
                    return {
                        key: Ce,
                        text: e.useRadio ? "" : this.getCheckboxTpl({}),
                        isAutoCreate: !0,
                        isShow: !0,
                        disableCustomize: !0,
                        width: e.width,
                        fixed: e.fixed,
                        template: (t, o, n, s) => this.getColumnTemplate({
                            checked: t,
                            disabled: o.gm_checkbox_disabled,
                            useRadio: e.useRadio,
                            isTop: s
                        })
                    }
                }

                getColumnTemplate(e) {
                    const {checked: t, disabled: o, useRadio: n, isTop: s} = e;
                    return {
                        template: s ? n ? this.getRadioTpl({
                            checked: t,
                            disabled: o
                        }) : this.getCheckboxTpl({checked: t, disabled: o}) : ""
                    }
                }

                getCheckboxTpl(e) {
                    const {checked: t, disabled: o, label: n, value: s} = e;
                    return {checked: t ? Oe : Pe, disabled: o, label: n, value: s}
                }

                getRadioTpl(e) {
                    const {checked: t, disabled: o, label: n, value: s} = e;
                    return {checked: t, disabled: o, label: n, value: s}
                }

                destroy(e) {
                    Rt(Ms[e])
                }
            }

            _s([Ho(Ts())], zs.prototype, "getColumnTemplate", null), _s([Ho(Ds())], zs.prototype, "getCheckboxTpl", null), _s([Ho(As())], zs.prototype, "getRadioTpl", null);
            const Ls = new zs;
            var Ns = o(271), qs = o.n(Ns);
            const Ks = {}, Bs = "no-click", Fs = "gm-config-ing", Is = "gm-config-area";
            var Gs = function (e, t, o, n) {
                var s, r = arguments.length, a = r < 3 ? t : null === n ? n = Object.getOwnPropertyDescriptor(t, o) : n;
                if ("object" == typeof Reflect && "function" == typeof Reflect.decorate) a = Reflect.decorate(e, t, o, n); else for (var i = e.length - 1; i >= 0; i--) (s = e[i]) && (a = (r < 3 ? s(a) : r > 3 ? s(t, o, a) : s(t, o)) || a);
                return r > 3 && a && Object.defineProperty(t, o, a), a
            };
            const Ws = e => Q(`[${oe}="${e}"]`), Js = e => {
                const t = gt(e), o = Ws(e), n = o.find(".config-list").get(0), s = o.find(".config-info");
                o.css("visibility", "hidden"), setTimeout((() => {
                    n.style.maxHeight = (t.height() - 90 - 20 - s.height() || 0) + qe, o.css("visibility", "inherit")
                }))
            };

            class Vs {
                init(e) {
                    const t = this;
                    Ks[e] = (e => {
                        const t = `[${oe}="${e}"]`;
                        return {
                            closeConfig: at(Xe, t, ".config-action"),
                            liChange: at(Xe, t, ".config-list li"),
                            closeConfigByBody: at("mousedown.closeConfig", "body")
                        }
                    })(e);
                    const {closeConfig: o, liChange: n} = Ks[e];
                    Q(o.target).on(o.events, o.selector, (function () {
                        t.hide(e)
                    })), Q(n.target).on(n.events, n.selector, (function (o) {
                        o.preventDefault();
                        const n = Q(this);
                        if (n.hasClass(Bs)) return !1;
                        const s = n.find(".gm-checkbox"), r = n.attr(ce), a = Ws(e), i = pt(e);
                        Q(".config-list .no-click", a).removeClass(Bs);
                        let c = !n.find('input[type="checkbox"]').prop(Oe);
                        c ? s.addClass(Re) : s.removeClass(Re), i.addClass(Fs), St(e, r, c), i.removeClass(Fs);
                        const l = Q(".checked-li", a);
                        1 === l.length && l.addClass(Bs), t.update(e)
                    }))
                }

                updateConfigList(e) {
                    const t = Ws(e), o = Q(".config-list", t);
                    let n = 0;
                    const s = [];
                    u(Do(e).columnMap, ((e, t) => {
                        s[t.index] = t
                    })), o.html(""), u(s, (t => {
                        const {key: s, isShow: r} = t;
                        if (t.disableCustomize) return;
                        const a = yt(e, s).find(".th-text").text();
                        o.append(this.createColumn({key: s, isShow: r, label: a})), r && n++
                    }));
                    const r = Q(".checked-li", t);
                    1 === n ? r.addClass(Bs) : r.removeClass(Bs)
                }

                update(e) {
                    let t = Ao(e);
                    pt(e).scrollLeft(0), jt(t), t = Ao(e), Ot(t), ar.update(e), Dt(e), _t(e), ar.resetFlag(e)
                }

                createHtml(e) {
                    return {key: `${oe}="${e._}"`, info: e.configInfo}
                }

                createColumn(e) {
                    const {key: t, isShow: o, label: n} = e;
                    return `<li th-name="${t}"${o ? ' class="checked-li"' : ""}>${Ls.getCheckboxTpl({
                        checked: o,
                        label: n
                    })}</li>`
                }

                toggle(e) {
                    "block" === Ws(e).css("display") ? this.hide(e) : this.show(e)
                }

                show(e) {
                    const t = Ws(e);
                    this.updateConfigList(e), t.show(), Js(e);
                    const {closeConfigByBody: o} = Ks[e], n = o.events, s = Q(o.target);
                    s.off(n), s.on(n, (function (e) {
                        const o = Q(e.target);
                        if (o.hasClass(Is) || 1 === o.closest(".gm-config-area").length) return !1;
                        t.hide(), s.off(n)
                    }))
                }

                hide(e) {
                    Ws(e).hide()
                }

                destroy(e) {
                    Rt(Ks[e])
                }
            }

            Gs([Ho(qs())], Vs.prototype, "createHtml", null);
            const Us = new Vs, Ys = {}, Xs = {};
            const Qs = new class {
                    constructor() {
                        this.width = 0, this.pauseResizeEventMap = {}, this.virtualScrollMap = {}
                    }

                    init(e) {
                        this.render(e), this.bindResizeToTable(e), this.bindScrollToTableDiv(e), this.width = (e => {
                            const t = r.createElement("div");
                            t.style.width = "100px", t.style.height = "100px", t.style.overflow = "scroll", t.style.scrollbarWidth = "thin", pt(e).get(0).appendChild(t);
                            const o = t.offsetWidth - t.clientWidth;
                            return t.remove(), o
                        })(e)
                    }

                    render(e) {
                        ht(e).append(ft(e).clone(!0).attr(ae, e));
                        const t = mt(e);
                        t.removeAttr(re);
                        ((e, t) => {
                            const {_: o, compileAngularjs: n, compileVue: s, compileReact: r} = e;
                            if (n || s || r) {
                                const e = _o(o), n = t.querySelectorAll(`[${Mo}]`);
                                [].forEach.call(n, ((t, o) => {
                                    const n = e[o];
                                    e.push(Object.assign({}, n))
                                }))
                            }
                        })(Do(e), t.get(0))
                    }

                    update(e) {
                        const t = gt(e);
                        let o = Xs[e], n = Do(e);
                        if (1 === t.length) {
                            this.pauseResizeEventMap[e] = !0;
                            try {
                                const s = t.width();
                                o && s !== o && (jt(n), jo(n)), Xs[e] = s, _t(e), Ot(n), ar.update(e), on(e), n.supportConfig && Js(e)
                            } catch (e) {
                            }
                            setTimeout((() => {
                                delete this.pauseResizeEventMap[e]
                            }))
                        }
                    }

                    bindResizeToTable(e) {
                        const t = gt(e).parent(), o = s.ResizeObserver;
                        if (o) {
                            const n = new o((() => {
                                this.pauseResizeEventMap[e] || this.update(e)
                            })), s = t.get(0);
                            return n.observe(s), void (Ys[e] = {observer: n, el: s})
                        }
                        Q(s).bind(`resize.${e}`, (() => {
                            this.pauseResizeEventMap[e] || this.update(e)
                        })), setTimeout((() => {
                            this.update(e)
                        }))
                    }

                    bindScrollToTableDiv(e) {
                        const t = pt(e), o = this.virtualScrollMap;
                        t.unbind(ot), t.bind(ot, (() => {
                            const t = o[e];
                            t && t(!0), Ot(Do(e), !0), ar.update(e), on(e)
                        }))
                    }

                    destroy(e) {
                        Q(s).unbind(`resize.${e}`), pt(e).unbind(ot);
                        const t = Ys[e];
                        t && t.el && t.observer && (t.observer.unobserve(t.el), delete Ys[e]), delete this.virtualScrollMap[e]
                    }
                }, Zs = {}, er = (e, t, o, n) => {
                    t.setProperty(`--gm-${e}-${o}-sticky-value`, n + qe)
                },
                tr = (e, t, o, n) => `[${te}="${e}"][gm-overflow-x="true"] tr:not([empty-template]) td:nth-of-type(${t + 1}){position: sticky;\nposition: -webkit-sticky;\n${o}: var(--gm-${e}-${t}-sticky-value);\nz-index: 3;\nbox-shadow: ${n};}`,
                or = {}, nr = {}, sr = {}, rr = "fixed-focus";
            const ar = new class {
                init(e) {
                    const {_: t, browser: o, columnMap: n} = e, s = pt(t), a = `fixed-style-${t}`;
                    let i = r.getElementById(a);
                    i || (i = r.createElement("style"), i.id = a);
                    const c = ut(t);
                    Zs[t] = {fixedFocus: at(Qe, c, "td[fixed]")};
                    const {fixedFocus: l} = Zs[t];
                    Q(l.target).on(l.events, l.selector, (function () {
                        vt(t).find("[fixed-focus]").removeAttr(rr), this.setAttribute(rr, "")
                    }));
                    const d = mt(t), h = ft(t).height() + qe;
                    let p = "", g = 0, f = 0;
                    const m = [], v = [];
                    u(n, ((e, t) => {
                        "left" === t.fixed && m.push(t), "right" === t.fixed && v.push(t)
                    }));
                    const b = m.length;
                    let y = "none";
                    or[t] = m.sort(((e, t) => e.index - t.index)), u(or[t], ((e, o) => {
                        const n = yt(t, e.key);
                        o === b - 1 && (y = "2px 0 4px #e8e8e8"), p += tr(t, e.index, "left", y), e.pl = g, g += e.width, n.css({
                            height: h,
                            lineHeight: h,
                            boxShadow: y
                        })
                    })), "safari" === o && g--, d.css("padding-left", g), y = "none";
                    const x = v.length;
                    nr[t] = v.sort(((e, t) => t.index - e.index)), nr[t].forEach(((e, o) => {
                        const n = yt(t, e.key);
                        o === x - 1 && (y = "-2px 0 4px #e8e8e8"), n.css({
                            height: h,
                            lineHeight: h,
                            boxShadow: y
                        }), p += tr(t, e.index, "right", y), e.pr = f, f += e.width
                    })), d.css("padding-right", f), i.innerHTML = p, s.append(i), this.resetFlag(t)
                }

                update(e) {
                    const t = pt(e), o = t.get(0).style, n = t.scrollLeft(), s = t.width(), r = mt(e).width(),
                        a = vt(e).height();
                    if (sr[e] && sr[e].divWidth === s && sr[e].scrollLeft === n && sr[e].theadWidth === r && sr[e].tbodyHeight === a) return;
                    sr[e] = {divWidth: s, scrollLeft: n, theadWidth: r, tbodyHeight: a};
                    const i = "true" === pt(e).attr("gm-overflow-x"), c = (e, t) => i ? bt(e, t.key).width() : t.width;
                    if (or[e] && or[e].length) {
                        let t, s = 0;
                        u(or[e], (r => {
                            t = c(e, r), yt(e, r.key).css({width: t, left: s + n}), er(e, o, r.index, s), s += t
                        })), mt(e).css("padding-left", s)
                    }
                    if (nr[e] && nr[e].length) {
                        let s = r - t.width() - n;
                        vt(e).height() > t.get(0).clientHeight && (s += Qs.width);
                        let a, i = 0;
                        nr[e].forEach((t => {
                            a = c(e, t), yt(e, t.key).css({width: a, right: i + s}), er(e, o, t.index, i), i += a
                        })), mt(e).css("padding-right", i)
                    }
                }

                resetFlag(e) {
                    if (!nr[e] || !nr[e].length) return;
                    const t = "fixed-previous", o = mt(e).find('th[fixed="right"]').eq(0), n = kt(e), s = o.index(n);
                    n.removeAttr(t), n.eq(s - 1).attr(t, "")
                }

                destroy(e) {
                    delete or[e], delete nr[e], Rt(Zs[e])
                }
            }, ir = "gm-adjust-ing";
            const cr = {};
            const lr = new class {
                get html() {
                    return '<span class="gm-adjust-action"></span>'
                }

                init(e) {
                    cr[e] = function (e, t) {
                        return {
                            start: at(Qe, t, `[grid-manager-mock-thead="${e}"] .gm-adjust-action`),
                            doing: at(Ze, `[${te}="${e}"]`, t),
                            abort: at("mouseup mouseleave", t)
                        }
                    }(e, ut(e));
                    const {start: t} = cr[e];
                    Q(t.target).on(t.events, t.selector, (function (t) {
                        const o = Q(this).closest("th"), n = o.find(".th-wrap");
                        let s = o.find(".gm-adjust-ing");
                        if (!s.length) {
                            const e = r.createElement("span");
                            e.className = ir, n.append(e), s = o.find(".gm-adjust-ing")
                        }
                        const a = o.height();
                        s.css({
                            top: -(a - n.height()) / 2,
                            right: -(o.width() - n.width() + 1) / 2,
                            height: pt(e).height() + a
                        });
                        const i = ht(e), {adjustBefore: c, adjustAfter: l, isIconFollowText: d, columnMap: u} = Do(e),
                            h = kt(e), p = h.eq(o.index(h) + 1);
                        c(t), i.addClass($e), ((e, t, o, n, s) => {
                            let r, a = o.width();
                            const i = pt(e).width(), {doing: c} = cr[e], l = mt(e), d = t.offset().left,
                                u = l.width() - a - t.width();
                            Q(c.target).on(c.events, c.selector, (function (c) {
                                r = Math.ceil(c.clientX - d);
                                const h = t.width();
                                if (r !== h) {
                                    if (s > r) {
                                        if (r <= n) return;
                                        const e = u + r + a;
                                        e < i && (a = a + i - e)
                                    }
                                    s < r && (a = o.width()), l.width(u + r + a), t.css({
                                        width: r,
                                        "max-width": r
                                    }), o.css({width: a, "max-width": a}), ar.update(e)
                                }
                            }))
                        })(e, o, p, At(e, u[Ct(o)], d), Math.ceil(t.clientX - o.offset().left)), ((e, t, o, n) => {
                            const {doing: s, abort: r} = cr[e];
                            Q(r.target).on(r.events, (a => {
                                Q(r.target).off(r.events), Q(s.target).off(s.events, s.selector);
                                const i = Ao(e, !0).columnMap;
                                for (let t in i) bt(e, t).width(i[t].width);
                                _t(e), Qs.update(e), n(a), t.removeClass($e), o.find(".gm-adjust-ing").remove()
                            }))
                        })(e, i, o, l)
                    }))
                }

                destroy(e) {
                    Rt(cr[e])
                }
            };
            const dr = new class {
                getColumn(e) {
                    const {autoOrderConfig: t} = e;
                    return {
                        key: we,
                        text: No(e, "order-text"),
                        isAutoCreate: !0,
                        isShow: !0,
                        disableCustomize: !0,
                        width: t.width,
                        fixed: t.fixed,
                        template: (e, t, o, n) => `<td gm-create gm-order>${n ? e : ""}</td>`
                    }
                }
            };
            var ur = o(909), hr = o.n(ur);
            const pr = {};
            var gr = function (e, t, o, n) {
                var s, r = arguments.length, a = r < 3 ? t : null === n ? n = Object.getOwnPropertyDescriptor(t, o) : n;
                if ("object" == typeof Reflect && "function" == typeof Reflect.decorate) a = Reflect.decorate(e, t, o, n); else for (var i = e.length - 1; i >= 0; i--) (s = e[i]) && (a = (r < 3 ? s(a) : r > 3 ? s(t, o, a) : s(t, o)) || a);
                return r > 3 && a && Object.defineProperty(t, o, a), a
            };

            class fr {
                init(e) {
                    const t = this, o = ht(e), n = Q("body");
                    pr[e] = ((e, t) => ({
                        start: at(Qe, t, `[grid-manager-mock-thead="${e}"] .gm-drag-action`),
                        doing: at("mousemove.gmDrag", "body"),
                        abort: at("mouseup.gmDrag", "body")
                    }))(e, `${ut(e)} [grid-manager-mock-thead]`);
                    const {start: s, doing: r, abort: a} = pr[e];
                    Q(s.target).on(s.events, s.selector, (function (s) {
                        let i = Do(e);
                        const {columnMap: c, dragBefore: l, animateTime: d, dragAfter: u, supportConfig: h} = i,
                            p = Q(this).closest("th"), g = p.get(0);
                        let f = kt(e);
                        const m = gt(e), v = Tt(p, e);
                        l(s), n.addClass($e), p.addClass(an), v.addClass(an);
                        let b = Q(".gm-dreamland-div", m);
                        if (b.length) return;
                        m.append('<div class="gm-dreamland-div"></div>'), b = Q(".gm-dreamland-div", m), b.get(0).innerHTML = t.createHtml({
                            $table: o,
                            $th: p
                        });
                        let y = 0;
                        const x = p.width(), w = p.height(), k = o.height(), C = m.offset(),
                            $ = pageXOffset - C.left - x / 2, T = pageYOffset - C.top - w / 2;
                        b.css({width: x + 2, height: k + 2});
                        const S = Q(r.target);
                        S.off(r.events), S.on(r.events, (function (o) {
                            let n, s, r, a;
                            b.show(), y = p.index(f), y > 0 && (n = f.eq(y - 1), s = Ct(n)), y < f.length - 1 && (r = f.eq(y + 1), a = Ct(r)), n && n.length && c[s].disableCustomize ? n = void 0 : r && r.length && c[a].disableCustomize && (r = void 0), b.css({
                                left: o.clientX + $,
                                top: o.clientY + T
                            }), f = t.updateDrag(e, n, r, p, v, b, f)
                        }));
                        const D = a.events, j = Q(a.target);
                        j.off(D), j.on(D, (function (t) {
                            Q(r.target).off(r.events), j.off(D), b.animate({
                                top: o.get(0).offsetTop + qe,
                                left: `${g.offsetLeft - pt(e).get(0).scrollLeft + qe}`
                            }, d, (() => {
                                p.removeClass(an), v.removeClass(an), b.remove(), u(t)
                            })), Ao(e), h && Us.updateConfigList(e), _t(e), ar.resetFlag(e), n.removeClass($e)
                        }))
                    }))
                }

                createHtml(e) {
                    const {$table: t, $th: o} = e, n = Tt(o, t.find("tbody tr:not([children-state])"));
                    let s = "";
                    return u(n, (e => {
                        s += `<tr style="height: ${e.offsetHeight + qe}">${e.outerHTML}</tr>`
                    })), {class: t.get(0).className, th: o.get(0).outerHTML, tbody: s}
                }

                updateDrag(e, t, o, n, s, r, a) {
                    if (t && r.offset().left < t.offset().left) {
                        let o = Tt(t, e);
                        t.before(n), u(s, ((e, t) => {
                            o.eq(t).before(e)
                        })), bt(e, t).before(bt(e, n)), Dt(e), a = kt(e)
                    }
                    if (o && r.offset().left + r.width() > o.offset().left) {
                        let t = Tt(o, e);
                        o.after(n), u(s, ((e, o) => {
                            t.eq(o).after(e)
                        })), bt(e, o).after(bt(e, n)), Dt(e), a = kt(e)
                    }
                    return a
                }

                destroy(e) {
                    Rt(pr[e])
                }
            }

            gr([Ho(hr())], fr.prototype, "createHtml", null);
            const mr = new fr;
            const vr = new class {
                init(e) {
                    zo[e] = (e => ({
                        openMenu: at("contextmenu", `[${ee}="${e}"]`),
                        closeMenu: at("mousedown.closeMenu", "body")
                    }))(e);
                    const {openMenu: t, closeMenu: o} = zo[e];
                    Q(t.target).on(t.events, (function (n) {
                        n.preventDefault(), n.stopPropagation();
                        const s = n.target;
                        if ("TBODY" !== s.nodeName && 0 === Q(s).closest("tbody").length) return;
                        const a = Xo(e, s);
                        a.show(), a.css(((e, t, o, n) => {
                            const s = r.documentElement, a = r.body, i = s.offsetHeight, c = s.offsetWidth,
                                l = a.scrollTop || s.scrollTop, d = a.scrollLeft || s.scrollLeft;
                            return {top: (i - l < n + t ? n - t : n) + l, left: (c - d < o + e ? o - e : o) + d}
                        })(a.width(), a.height(), n.clientX, n.clientY)), a.on(t.events, (function (e) {
                            e.preventDefault(), e.stopPropagation()
                        }));
                        const i = Q(o.target), c = o.events;
                        i.off(c), i.on(c, (function (t) {
                            const o = Q(t.target);
                            o.attr(se) || 1 === o.closest("[grid-master]").length || Yo(e)
                        }))
                    }))
                }

                destroy(e) {
                    Rt(zo[e]), Q(Uo(e)).remove()
                }
            }, br = (e, t) => {
                if (t || (t = Do(e)), t.rendered) return !0;
                Lt(`run failed，please check ${e} had been init`)
            };
            let yr = {};
            const xr = {};

            class wr {
                constructor(e, t, o) {
                    if ("TABLE" !== e.nodeName) return void Nt('nodeName !== "TABLE"');
                    Me.forEach((t => {
                        e["__" + t] = e.getAttribute(t)
                    }));
                    let n = Q(e), s = (t = S({}, wr.defaultOption, t)).gridManagerName;
                    if (m(s) ? n.attr(Z, s) : s = t.gridManagerName = dt(e), !m(s)) return void Nt("gridManagerName undefined");
                    let r = wr.get(s);
                    if (r.rendered && wr.destroy(s), xr[s] && !fo[s]) return;
                    if (xr[s] && fo[s] && (clearInterval(fo[s]), delete fo[s]), xr[s] = !0, !t || w(t)) return void Nt("init method params error");
                    if (!C(t.columnData)) return void Nt("columnData invalid");
                    if (!t.ajaxData) return void Nt("ajaxData undefined");
                    x(t.fullColumn) && (v(t.fullColumn.topTemplate) || v(t.fullColumn.bottomTemplate)) && (t.supportConfig = !1, t.supportDrag = !1, t.supportMoveRow = !1, t.supportTreeData = !1, t.__isFullColumn = !0, delete t.virtualScroll), t.supportTreeData && (t.supportMoveRow = !1, t.__isFullColumn = !1, delete t.virtualScroll), t.columnData.some((e => C(e.children))) && (t.supportConfig = !1, t.supportDrag = !1, t.supportAdjust = !1, t.disableLine = !1, t.supportMoveRow = !1, t.__isNested = !0), (() => {
                        const e = ho(be), t = co.version;
                        e || po(be, t), e && e !== t && ($o(), po(be, t))
                    })(), r = So(t, Sn.getColumn.bind(Sn), Ls.getColumn.bind(Ls), dr.getColumn.bind(dr), Pn.getColumn.bind(Pn)), Ve(r._);
                    const a = () => {
                        g(n.attr(ye)) || setTimeout((() => {
                            Co(r), n.removeAttr(ye)
                        }), 1e3), r = Do(s), delete xr[s], n.addClass("gm-ready"), r.rendered = !0, jo(r);
                        const e = () => {
                            v(o) && o(r.query)
                        };
                        r.firstLoading ? cs.refresh(s, (() => {
                            e()
                        })) : (os(r, !0), e()), Qs.update(r._)
                    }, i = () => {
                        if (n = ht(s), e = n.get(0), -1 === h(e, "width").indexOf(qe)) return !0;
                        clearInterval(fo[s]), delete fo[s], this.initTable(n, r).then(a)
                    };
                    i() && (clearInterval(fo[s]), fo[s] = setInterval((() => {
                        i()
                    }), 50))
                }

                static get version() {
                    return co.version
                }

                static get defaultOption() {
                    return yr
                }

                static set defaultOption(e) {
                    yr = e
                }

                static mergeDefaultOption(e) {
                    yr = S(yr, e)
                }

                static get(e) {
                    return Do(dt(e))
                }

                static getLocalStorage(e) {
                    return ko(dt(e))
                }

                static resetLayout(e, t, o) {
                    const n = dt(e), s = Do(n);
                    br(n, s) && (s.width = t, s.height = o, jo(s), Pt(s), Qs.update(n))
                }

                static clear(e) {
                    const t = dt(e);
                    return br(t) && $o(t)
                }

                static getTableData(e) {
                    const t = dt(e);
                    return br(t) && vo(t)
                }

                static getRowData(e, t) {
                    const o = dt(e);
                    return br(o) && mo(o, t)
                }

                static setSort(e, t, o, n) {
                    const s = dt(e);
                    br(s) && Jn(s, t, o, n)
                }

                static setConfigVisible(e, t) {
                    const o = dt(e), n = Do(o);
                    if (br(o, n)) if (n.supportConfig) switch (t) {
                        case!0:
                            Us.show(o);
                            break;
                        case!1:
                            Us.hide(o);
                            break;
                        case void 0:
                            Us.toggle(o)
                    } else Nt("supportConfig!==true")
                }

                static showTh(e, t) {
                    const o = dt(e);
                    br(o) && Do(o).supportConfig && (St(o, t, !0), Us.update(o))
                }

                static hideTh(e, t) {
                    const o = dt(e);
                    br(o) && Do(o).supportConfig && (St(o, t, !1), Us.update(o))
                }

                static exportGrid(e, t, o) {
                    const n = dt(e);
                    return br(n) && Ko.exportGrid(n, t, o)
                }

                static setQuery(e, t, o, n) {
                    const s = dt(e), r = Do(s);
                    if (!br(s, r)) return;
                    const {columnMap: a, pageData: i, currentPageKey: c} = r;
                    x(t) || (t = {}), y(o) || b(o) || (n = o, o = !0), r._filter && u(a, ((e, o) => {
                        o.filter && (o.filter.selected = m(t[e]) ? t[e] : "", ts.update(yt(s, e), o.filter))
                    })), S(r, {query: t}), !0 === o && (i[c] = 1), b(o) && (i[c] = o), jo(r), cs.refresh(s, n)
                }

                static setAjaxData(e, t, o) {
                    const n = dt(e), s = Do(n);
                    br(n, s) && (S(s, {ajaxData: t}), bo(n, []), jo(s), cs.refresh(n, o))
                }

                static refreshGrid(e, t, o) {
                    const n = dt(e), s = Do(n);
                    br(n, s) && (y(t) || (o = t, t = !1), t && (s.pageData[s.currentPageKey] = 1, jo(s)), cs.refresh(n, o))
                }

                static renderGrid(e) {
                    const t = dt(e), o = Do(t);
                    if (br(t, o)) {
                        const {dataKey: e, totalsKey: n, pageData: s} = o, r = {[e]: vo(t), [n]: s.tSize};
                        cs.driveDomForSuccessAfter(o, r)
                    }
                }

                static resetSettings(e, t) {
                    const o = dt(e);
                    br(o, t) && jo(t)
                }

                static updateTemplate(e) {
                    return To(e)
                }

                static getCheckedTr(e) {
                    const t = dt(e);
                    return br(t) && Ls.getCheckedTr(t)
                }

                static getCheckedData(e) {
                    const t = dt(e);
                    return br(t) && yo(t)
                }

                static setCheckedData(e, t) {
                    const o = dt(e), n = Do(o);
                    if (br(o, n)) {
                        const e = k(t) ? t : [t], {columnMap: s, checkboxConfig: r, treeConfig: a, supportMenu: i} = n,
                            c = a.treeKey, l = vo(o), {key: d, useRadio: u, max: h} = r;
                        l.forEach((t => {
                            let o = it(s, t, [c]);
                            t.gm_checkbox = e.some((e => qt(o, it(s, e, [c]), d)))
                        })), bo(o, l), xo(o, e, !0), i && Yo(o), Hs(o, l, u, h)
                    }
                }

                static updateRowData(e, t, o) {
                    const n = dt(e), s = Do(n);
                    if (br(n, s)) {
                        const {
                            columnMap: e,
                            supportCheckbox: r,
                            supportTreeData: a,
                            treeConfig: i,
                            rowRenderHandler: c
                        } = s, l = k(o) ? o : [o], d = vo(n), u = i.treeKey, h = (e, o) => {
                            e.some(((e, n) => {
                                if (e[t] === o[t]) return S(e, c(S(e, o), n)), !0;
                                if (a) {
                                    const t = e[u];
                                    if (t && t.length) return h(t, o)
                                }
                            }))
                        };
                        return l.forEach((e => {
                            h(d, e)
                        })), r && ((e, t, o, n) => {
                            co.checkedData[e] && (co.checkedData[e] = co.checkedData[e].map((e => (n.forEach((n => {
                                e[o] === n[o] && S(e, it(t, n))
                            })), e))))
                        })(n, e, t, l), cs.changeTableData(n, d), d
                    }
                }

                static updateTreeState(e, t) {
                    const o = dt(e);
                    br(o) && Nn.updateDOM(o, t)
                }

                static cleanData(e) {
                    const t = dt(e);
                    br(t) && (bo(t, []), this.renderGrid(t))
                }

                static print(e) {
                    const t = dt(e);
                    br(t) && Vo(t)
                }

                static showLoading(e) {
                    const t = dt(e), o = Do(t);
                    br(t, o) && ct(t, o.loadingTemplate)
                }

                static hideLoading(e, t) {
                    const o = dt(e);
                    br(o) && lt(o, t)
                }

                static showRow(e, t) {
                    const o = dt(e);
                    br(o) && ((e, t) => {
                        let o;
                        o = g(t) ? Q("[gm-row-hide]") : Wo(t), o.attr(Ne, "out"), setTimeout((() => {
                            o.removeAttr(Ne), Go(e._, e.columnMap)
                        }), 500)
                    })(Do(o), t)
                }

                static hideRow(e, t) {
                    const o = dt(e);
                    br(o) && b(t) && Jo(Do(o), t)
                }

                static setLineHeight(e, t) {
                    const o = dt(e);
                    br(o) && m(t) && Et(o, t)
                }

                async initTable(e, t) {
                    await cs.createDOM(e, t);
                    const {_: o} = t;
                    t.supportAdjust && lr.init(o), t.supportDrag && mr.init(o), t.supportMoveRow && Sn.init(o), t.supportCheckbox && Ls.init(o), t._sort && Un.init(o), t._remind && rn.init(o), t._filter && ts.init(o), t.supportConfig && Us.init(o), t.supportMenu && vr.init(o), t.supportAjaxPage && Cs.init(o), t.supportTreeData && Nn.init(o), t.__isFullColumn && Pn.init(o), t._fixed && ar.init(t), t = Do(o), jt(t, !0), jo(t), t.__isNested ? ln.addSign(o) : Dt(o), _t(o);
                    const n = ft(o).find("tr"), s = n.height();
                    n.height(s), mt(o).find("tr").height(s), u(xt(o), (e => {
                        e.innerHTML = ""
                    })), Ao(o)
                }

                static destroy(e) {
                    const t = dt(e);
                    try {
                        lr.destroy(t), Cs.destroy(t), Ls.destroy(t), Us.destroy(t), cs.destroy(t), mr.destroy(t), gs.destroy(t), ts.destroy(t), vr.destroy(t), Sn.destroy(t), rn.destroy(t), Qs.destroy(t), Un.destroy(t), Nn.destroy(t), ar.destroy(t), Pn.destroy(t)
                    } catch (e) {
                        console.error(e)
                    }
                    delete xr[t], (e => {
                        delete co.responseData[e], delete co.checkedData[e], delete co.settings[e], clearInterval(fo[e]), clearInterval(go[e]), delete fo[e], delete go[e]
                    })(t), Ve(t)
                }
            }

            Element.prototype.GM = Element.prototype.GridManager = function () {
                let e, t, o, n;
                const s = arguments;
                if (m(s[0]) ? (e = s[0], t = s[1], o = s[2], n = s[3]) : (e = "init", t = s[0], o = s[1]), "init" !== e) return wr[e](this, t, o, n) || this;
                new wr(this, t, o)
            }, s.GridManager || s.GM || (s.GridManager = s.GM = wr), (e => {
                if (!e) return;
                const t = function () {
                    return this.get(0).GM(...arguments)
                };
                e.fn.extend({GridManager: t, GM: t}), s.$ = e
            })(s.jQuery);
            const kr = wr
        })(), n
    })()
}));