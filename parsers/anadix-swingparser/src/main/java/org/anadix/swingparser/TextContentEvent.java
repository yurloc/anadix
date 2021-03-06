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
package org.anadix.swingparser;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * <p>TextContentEvent class.</p>
 *
 * @author tomason
 * @version $Id: $
 */
public class TextContentEvent implements Serializable {
	private static final long serialVersionUID = 030L;

	private final BigInteger id;
	private final String textContent;
	private final int position;

	/**
	 * <p>Constructor for TextContentEvent.</p>
	 *
	 * @param id a {@link java.math.BigInteger} object.
	 * @param textContent a {@link java.lang.String} object.
	 */
	public TextContentEvent(BigInteger id, String textContent) {
		this(id, textContent, 0);
	}

	/**
	 * <p>Constructor for TextContentEvent.</p>
	 *
	 * @param id a {@link java.math.BigInteger} object.
	 * @param textContent a {@link java.lang.String} object.
	 * @param position a int.
	 */
	public TextContentEvent(BigInteger id, String textContent, int position) {
		this.id = id;
		this.textContent = textContent;
		this.position = position;
	}

	/**
	 * <p>Getter for the field <code>id</code>.</p>
	 *
	 * @return a {@link java.math.BigInteger} object.
	 */
	public BigInteger getId() {
		return id;
	}

	/**
	 * <p>Getter for the field <code>textContent</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getTextContent() {
		return textContent;
	}

	/**
	 * <p>Getter for the field <code>position</code>.</p>
	 *
	 * @return a int.
	 */
	public int getPosition() {
		return position;
	}

	/** {@inheritDoc} */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/** {@inheritDoc} */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		TextContentEvent other = (TextContentEvent) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

}
