/*
 * Copyright 2011 Tomas Schlosser
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.anadix.html;

import java.math.BigInteger;

public class AreaTag extends CommonAttributes {

	AreaTag(BigInteger id, HtmlElement parent, Attributes attributes) {
		super(id, "area", parent, attributes);
	}

	public String getShape() {
		return getAttribute("shape");
	}

	public String getCoords() {
		return getAttribute("coords");
	}

	public String getHref() {
		return getAttribute("href");
	}

	public String getTarget() {
		return getAttribute("target");
	}

	public String getNohref() {
		return getAttribute("nohref");
	}

	public String getAlt() {
		return getAttribute("alt");
	}

	public String getTabindex() {
		String value = getAttribute("tabindex");

		// return (value == null) ? -1 : Integer.parseInt(value);
		return value;
	}

	public String getAcesskey() {
		return getAttribute("accesskey");
	}

	public String getOnfocus() {
		return getAttribute("onfocus");
	}

	public String getOnblur() {
		return getAttribute("onblur");
	}

}