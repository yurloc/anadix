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

/**
 * Defines the text direction. See <a href="http://www.w3schools.com/tags/tag_bdo.asp">w3schools</a>.
 *
 * @author tomason
 * @version $Id: $
 */
public class BdoTag extends CoreAttributes {

	BdoTag(BigInteger id, HtmlElement parent, Attributes attributes) {
		super(id, "bdo", parent, attributes);
	}

	/**
	 * Specifies a language code for the content in an element
	 *
	 * @return a language code for the content in an element
	 */
	public String getLang() {
		return getAttribute("lang");
	}

	/**
	 * Specifies the text direction of the text inside a bdo element
	 *
	 * @return the text direction of the text
	 */
	public String getDir() {
		return getAttribute("dir");
	}
}
