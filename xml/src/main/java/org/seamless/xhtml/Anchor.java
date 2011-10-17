/*
 * Copyright (C) 2011 4th Line GmbH, Switzerland
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 2 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.seamless.xhtml;

import org.w3c.dom.Element;

import javax.xml.xpath.XPath;

/**
 * @author Christian Bauer
 */
public class Anchor extends XHTMLElement {

    public Anchor(XPath xpath, Element element) {
        super(xpath, element);
    }

    public String getType() {
        return getAttribute(XHTML.ATTR.type);
    }

    public Anchor setType(String type) {
        setAttribute(XHTML.ATTR.type, type);
        return this;
    }

    public Href getHref() {
        return Href.fromString(getAttribute(XHTML.ATTR.href));
    }

    public Anchor setHref(String href) {
        setAttribute(XHTML.ATTR.href, href);
        return this;
    }

    @Override
    public String toString() {
        return "(Anchor) " + getAttribute(XHTML.ATTR.href);
    }
}
