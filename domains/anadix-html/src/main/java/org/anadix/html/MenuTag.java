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
 * Defines a menu list
 *
 * @author tomason
 * @version $Id: $
 */
public class MenuTag extends CommonAttributes {

	MenuTag(BigInteger id, HtmlElement parent, Attributes attributes) {
		super(id, "menu", parent, attributes);
	}

	/**
	 * Specifies that the list should render smaller than normal
	 *
	 * @return whether the list should be smaller
	 */
	public String getCompact() {
		return getAttribute("compact");
	}

}
